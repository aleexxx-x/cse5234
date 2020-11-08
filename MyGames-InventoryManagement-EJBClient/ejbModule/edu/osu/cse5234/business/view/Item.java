package edu.osu.cse5234.business.view;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ITEM")

public class Item implements Serializable {
	private static final long serialVersionUID = -2079586076501858596L;

	@Column(name="NAME") 
	public String name;
	
	@Column(name="UNIT_PRICE") 
	public String price;
	
	@Column(name="AVAILABLE_QUANTITY") 
	public String quantity;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	
	@Column(name="ITEM_NUMBER") 
	public int itemNumber;
	
	@Column(name="DESCRIPTION") 
	public String description;
	
	public Item() {
		
	}
	
	public Item(String name, String price, int itemNumber, String description) {
		this.name = name;
		this.price = price;
		this.quantity = "0";
		this.itemNumber = itemNumber;
		this.description = description;
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
	public String getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the itemNumber
	 */
	public String getItemNumber() {
		return name;
	}
	/**
	 * @param itemNumber the itemNuber to set
	 */
	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
}
