package edu.osu.cse5234.business;

import edu.osu.cse5234.business.view.Inventory;
import edu.osu.cse5234.business.view.InventoryService;
import edu.osu.cse5234.business.view.Item;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class InventoryServiceBean
 */
@Stateless
public class InventoryServiceBean implements InventoryService {

    /**
     * Default constructor. 
     */
	Map<String, Item> nameItemMap;
    public InventoryServiceBean() {
        // TODO Auto-generated constructor stub
    	this.nameItemMap = new HashMap();
    }

	@Override
	public Inventory getAvailableInventory() {
		// TODO Auto-generated method stub
		Inventory inventory = new Inventory();
		Item[] itemArray = {new Item("Batman Returns!", "100"), new Item("PUBG!", "200"), new Item("CSGO", "300")};
		List<Item> itemList = (List<Item>) Arrays.asList(itemArray);
		inventory.setItems(itemList);
		for(Item it: itemArray) nameItemMap.put(it.name, it);
		return inventory;
	}

	@Override
	public boolean validateQuantity(List<Item> items) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean updateInventory(List<Item> items) {
		// TODO Auto-generated method stub
		
		return true;
	}

}
