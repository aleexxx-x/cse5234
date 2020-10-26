package edu.osu.cse5234.model;

public class LineItem {
	public int id;
	public int itemNumber;
	public String name;
	public double price;
	public int quantity;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getItemNumber() {
		return itemNumber;
	}
	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public LineItem(int id, int itemNumber, String name, double price, int quantity) {
		super();
		this.id = id;
		this.itemNumber = itemNumber;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	
	
}
