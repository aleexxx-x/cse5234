package edu.osu.cse5234.business;

import java.util.Date;

import javax.annotation.Resource;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jms.ConnectionFactory;
import javax.jms.JMSConnectionFactory;
import javax.jms.JMSContext;
import javax.jms.Queue;
import javax.json.Json;
import javax.json.JsonObject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import edu.osu.cse5234.business.view.Inventory;
import edu.osu.cse5234.business.view.InventoryService;
import edu.osu.cse5234.business.view.Item;
import edu.osu.cse5234.model.LineItem;
import edu.osu.cse5234.model.Order;
import edu.osu.cse5234.util.ServiceLocator;

/**
 * Session Bean implementation class OrderProcessingServiceBean
 */
@Stateless
@LocalBean
public class OrderProcessingServiceBean {
	
	@Resource(name="jms/emailQCF", lookup="jms/emailQCF", type=ConnectionFactory.class)
    /**
     * Default constructor. 
     */
	@Inject
	@JMSConnectionFactory("java:comp/env/jms/emailQCF")
	private JMSContext jmsContext;

	@Resource(lookup="jms/emailQ")
	private Queue queue;

	Inventory inventory;
	private static String SHIPPING_URI = "http://localhost:9080/UPS/services/shipping";
	@PersistenceContext(unitName="MyGames") protected EntityManager entityManager;
	
	private static final String customerEmail = "Customer Email";
	
    public OrderProcessingServiceBean() {
        // TODO Auto-generated constructor stub
    	this.inventory = ServiceLocator.getInventoryService().getAvailableInventory();
    }
    
    private void notifyUser() {
		String message = customerEmail + ":" +
		       "Your order was successfully submitted. " + 
		     	"You will hear from us when items are shipped. " + 
		      	new Date();
	
		System.out.println("Sending message: " + message);
		jmsContext.createProducer().send(queue, message);
		System.out.println("Message Sent!");
	}

    public String processOrder(Order order) {		
		entityManager.persist(order);
		entityManager.flush();
		
		for(LineItem it: order.getItems()) {
			for(Item it2: inventory.getItems()) {
				if(it.getName().equals(it2.getName())) {
					int it2quan = Integer.parseInt(it2.getQuantity());
					int it1quan = Integer.parseInt(it.getQuantity());
					int finquan = it2quan-it1quan;
					String finquanStr = String.valueOf(finquan);
					it2.setQuantity(finquanStr);
				}
			}
		}
		
		String orgName = "My Games INC";
		String orderId = "#114-5460846-3776203";
		int orderRefId = 90087;
		int totalItems = 0;
		for(LineItem li: order.getItems())
			totalItems += Integer.parseInt(li.getQuantity());
		
		String zipCode = order.getShippingInfo().getZipcode();
		
		Client client = ClientBuilder.newClient();
		WebTarget baseTarget = client.target(SHIPPING_URI);
				
		JsonObject requestJson = Json.createObjectBuilder()
		.add("Organization", orgName)
		.add("OrderRefId", orderRefId)
		.add("ItemsCount", totalItems)
		.add("Zip", zipCode)
		.build();

		JsonObject responseJson = baseTarget.path("/initiate")
		.request(MediaType.APPLICATION_JSON)
		.post(Entity.json(requestJson), JsonObject.class);

		System.out.println("Fedex accepted request? " +   
		     responseJson.getBoolean("Accepted"));
		System.out.println("Shipping Reference Number: " + 
		     responseJson.getInt("ShippingReferenceNumber"));

		client.close();

		return orderId;
	}
    
    public boolean validateItemAvailability(Order order) {
    	for(LineItem orderItem: order.getItems()) {
			for(Item inventoryItem: this.inventory.getItems()) {
				if(inventoryItem.getName().equals(orderItem.getName())) {
					if(Integer.parseInt(inventoryItem.getQuantity()) < Integer.parseInt(orderItem.getQuantity())) return false;
				}
			}
		}
    	
    	return true;
    }

}
