package edu.osu.cse5234.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="CUSTOMER_ORDER_LINE_ITEM")

public class LineItem implements Serializable{
	private static final long serialVersionUID = -4110290914115564440L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	
	@Column(name="ITEM_NUMBER")
	private int itemNumber;
	
	@Column(name="ITEM_NAME")
	private String name;
	
	@Transient
	private String price;
	
	@Column(name="QUANTITY")
	private String quantity;
	
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
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	
	
	public LineItem() {
		super();
	}
	public LineItem(int id, int itemNumber, String name, String price, String quantity) {
		super();
		this.id = id;
		this.itemNumber = itemNumber;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	
	
}
