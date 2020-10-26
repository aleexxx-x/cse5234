package edu.osu.cse5234.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Order {
	public int id;
	public String customerName;
	public String emailAddress;
	public ShippingInfo shippingInfo;
	public PaymentInfo paymentInfo;
	
	public List<LineItem> lineItems;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public ShippingInfo getShippingInfo() {
		return shippingInfo;
	}

	public void setShippingInfo(ShippingInfo shippingInfo) {
		this.shippingInfo = shippingInfo;
	}

	public PaymentInfo getPaymentInfo() {
		return paymentInfo;
	}

	public void setPaymentInfo(PaymentInfo paymentInfo) {
		this.paymentInfo = paymentInfo;
	}

	public List<LineItem> getLineItems() {
		return lineItems;
	}

	public void setLineItems(List<LineItem> lineItems) {
		this.lineItems = lineItems;
	}

	public Order() {
		this.lineItems = new ArrayList<>();
	}
	
	/**
	 * @return the items
	 */
	public List<LineItem> getItems() {
		return lineItems;
	}

	/**
	 * @param items the items to set
	 */
	public void setItems(List<LineItem> items) {
		this.lineItems.addAll(items);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Order [items=" + Arrays.toString(lineItems.toArray()) + "]";
	}
}
