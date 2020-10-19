package edu.osu.cse5234.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import edu.osu.cse5234.business.view.Item;

public class Order {
	public List<Item> items;
	
	public Order() {
		this.items = new ArrayList<>();
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
		this.items.addAll(items);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Order [items=" + Arrays.toString(items.toArray()) + "]";
	}
}
