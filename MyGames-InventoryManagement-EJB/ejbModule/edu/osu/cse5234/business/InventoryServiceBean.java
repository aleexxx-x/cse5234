package edu.osu.cse5234.business;

import edu.osu.cse5234.business.view.Inventory;
import edu.osu.cse5234.business.view.InventoryService;
import edu.osu.cse5234.business.view.Item;
import edu.osu.cse5234.model.LineItem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Session Bean implementation class InventoryServiceBean
 */
@Stateless
public class InventoryServiceBean implements InventoryService {

    /**
     * Default constructor. 
     */
	Inventory inventory;
	public static final String MY_QUERY = "Select i from Item i";
	
	@PersistenceContext
	EntityManager entityManager;
	
    public InventoryServiceBean() {
        // TODO Auto-generated constructor stub
    	Inventory inventory = new Inventory();
    	
    	List<Item> inventoryItems = new ArrayList<>();
    	Item it1 = new Item("PUBG", "100", 1, "This is the PUBG Game");
    	Item it2 = new Item("Fortnite", "200", 2, "This is the Fortnite Game");
    	Item it3 = new Item("Batman Returns!", "300", 3, "This is the Batman Returns Game");
		
    	inventoryItems.add(it1);
		inventoryItems.add(it2);
		inventoryItems.add(it3);
		
		inventory.setItems(inventoryItems);
		this.inventory = inventory;
		
    }
    
	/**
	 * @return the entityManager
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}
	/**
	 * @param entityManager the entityManager to set
	 */
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public Inventory getAvailableInventory() {
		// TODO Auto-generated method stub
		Inventory available = (Inventory) entityManager.createQuery(MY_QUERY, Item.class).getResultList();
		return available;
	}

	@Override
	public boolean validateQuantity(List<Item> orderItems) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean updateInventory(List<Item> orderItems) {
		// TODO Auto-generated method stub
		return true;
	}

}
