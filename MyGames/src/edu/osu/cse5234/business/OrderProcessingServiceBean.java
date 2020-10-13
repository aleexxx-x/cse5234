package edu.osu.cse5234.business;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import edu.osu.cse5234.model.Order;

/**
 * Session Bean implementation class OrderProcessingServiceBean
 */
@Stateless
@LocalBean
public class OrderProcessingServiceBean {

    /**
     * Default constructor. 
     */
	public String processOrder(Order order) {
		return "";
	}
    public OrderProcessingServiceBean() {
        // TODO Auto-generated constructor stub
    }

}
