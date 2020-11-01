package edu.osu.cse5234.business;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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

    /**
     * Default constructor. 
     */
	Inventory inventory;
	@PersistenceContext(unitName="MyGames") protected EntityManager entityManager;
	
    public OrderProcessingServiceBean() {
        // TODO Auto-generated constructor stub
    	this.inventory = ServiceLocator.getInventoryService().getAvailableInventory();
    }
    
    public String processOrder(Order order) {		
		entityManager.persist(order);
		entityManager.flush();
		
		for(LineItem it: order.getItems()) {
			for(Item it2: inventory.getItems()) {
				if(it.getName().equals(it2.getName())) {
					it2.setQuantity(it2.getQuantity()-it.getQuantity());
				}
			}
		}
		
		return "#114-5460846-3776203";
	}
    
    public boolean validateItemAvailability(Order order) {
    	for(LineItem orderItem: order.getItems()) {
			for(Item inventoryItem: this.inventory.getItems()) {
				if(inventoryItem.getName().equals(orderItem.getName())) {
					if(inventoryItem.getQuantity() < orderItem.getQuantity()) return false;
				}
			}
		}
    	
    	return true;
    }

}
