package edu.osu.cse5234.business;

import edu.osu.cse5234.business.view.Inventory;
import edu.osu.cse5234.business.view.InventoryService;
import edu.osu.cse5234.business.view.Item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class InventoryServiceBean
 */
@Stateless
public class InventoryServiceBean implements InventoryService {

    /**
     * Default constructor. 
     */
	Inventory inventory;
	
    public InventoryServiceBean() {
        // TODO Auto-generated constructor stub
    	Inventory inventory = new Inventory();
    	
    	List<Item> inventoryItems = new ArrayList<>();
    	Item it1 = new Item("PUBG US", "100");
    	Item it2 = new Item("Fortnite", "300");
    	Item it3 = new Item("Batman Returns!", "300");
		
    	inventoryItems.add(it1);
		inventoryItems.add(it2);
		inventoryItems.add(it3);
		
		inventory.setItems(inventoryItems);
		this.inventory = inventory;
		
    }

	@Override
	public Inventory getAvailableInventory() {
		// TODO Auto-generated method stub
		return this.inventory;
	}

	@Override
	public boolean validateQuantity(List<Item> orderItems) {
		// TODO Auto-generated method stub
		
		for(Item orderItem: orderItems) {
			for(Item inventoryItem: inventory.getItems()) {
				System.out.println("orderItemName validate ="+orderItem.getName()+"inventoryItemName="+inventoryItem.getName());
				if(inventoryItem.getName().equals(orderItem.getName())) {
					System.out.println(inventoryItem.getName());
					if(inventoryItem.getQuantity() < orderItem.getQuantity()) return false;
				}
			}
		}
		
		return true;
	}

	@Override
	public boolean updateInventory(List<Item> orderItems) {
		// TODO Auto-generated method stub
		for(Item it: orderItems) {
			for(Item it2: inventory.getItems()) {
				System.out.println("update orderItemName="+it.getName()+"inventoryItemName="+it2.getName());
				if(it.getName().equals(it2.getName())) {
					it2.setQuantity(it2.getQuantity()-it.getQuantity());
					System.out.println("Game updated after="+inventory.getItems());
				}
			}
		}
		
		return true;
	}

}
