package edu.osu.cse5234.business.view;

import java.io.Serializable;

public class Item implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8273870230678283245L;
	public String name;
	public String price;
	public int quantity;
	
	public Item() {
		
	}
	
	public Item(String name, String price) {
		this.name = name;
		this.price = price;
		this.quantity = 0;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the price
	 */
	public String getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(String price) {
		this.price = price;
	}
	
	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
}
