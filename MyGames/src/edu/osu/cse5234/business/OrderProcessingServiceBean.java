package edu.osu.cse5234.business;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.osu.cse5234.business.view.InventoryService;
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
	
	@PersistenceContext(unitName="myPersistenceUnit") protected EntityManager entityManager;
	
    public OrderProcessingServiceBean() {
        // TODO Auto-generated constructor stub
    }
    
    public String processOrder(Order order) {
//		System.out.println("Before inventory update="+ServiceLocator.getInventoryService().getAvailableInventory());
		ServiceLocator.getInventoryService().validateQuantity(order.getItems());
//		System.out.println("I was here");
		entityManager.persist(order);
		entityManager.flush();
		ServiceLocator.getInventoryService().updateInventory(order.getItems());
		System.out.println("After update inventory="+ServiceLocator.getInventoryService().getAvailableInventory());
		return "#114-5460846-3776203";
	}
    
    public boolean validateItemAvailability(Order order) {
    	System.out.println("CAll from Validate ORder");
    	return ServiceLocator.getInventoryService().validateQuantity(order.getItems());
    }

}
