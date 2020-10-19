package edu.osu.cse5234.business.view;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Inventory implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8063226923221074051L;
	List<Item> items;
	
	public Inventory(List<Item> items) {
		this.items = items;
	}
	
	public Inventory() {}
	
	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Inventory [items=" + Arrays.toString(items.toArray()) + "]";
	}

	
}
