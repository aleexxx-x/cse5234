package edu.osu.cse5234.business;

import java.util.HashSet;
import java.util.Set;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import edu.osu.cse5234.business.view.InventoryService;
import edu.osu.cse5234.business.view.Item;
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
	public String processOrder(Order order) {
		InventoryService inventoryService = ServiceLocator.getInventoryService();
		inventoryService.updateInventory(items)
		return "#114-5460846-3776203";
	}
    public OrderProcessingServiceBean() {
        // TODO Auto-generated constructor stub
    }
    
    public boolean validateItemAvailability(Order order) {
    	return ServiceLocator.getInventoryService().validateQuantity(order.getItems());
    }

}
