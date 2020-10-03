package edu.osu.cse5234.model;

import java.util.List;

public class Order {
	public List<Item> items;
	
	public Order() {
		
	}
	
	/**
	 * @return the items
	 */
	public List<Item> getItems() {
		return items;
	}

	/**
	 * @param items the items to set
	 */
	public void setItems(List<Item> items) {
		this.items = items;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Order [items=" + items + "]";
	}
}
