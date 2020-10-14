package edu.osu.cse5234.controller;


import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.osu.cse5234.business.view.InventoryService;
import edu.osu.cse5234.model.Order;
import edu.osu.cse5234.model.PaymentInfo;
import edu.osu.cse5234.model.ShippingInfo;
import edu.osu.cse5234.util.ServiceLocator;

@Controller
@RequestMapping("/purchase")
public class PurchaseController {

	@RequestMapping(path= "/orderEntry", method = RequestMethod.GET)
	public String viewOrderEntryForm(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// ... instantiate and set order object with items to display
		InventoryService inventoryService = ServiceLocator.getInventoryService();
		request.setAttribute("order", inventoryService.getAvailableInventory());
		return "OrderEntryForm";
	}

//	@RequestMapping(path = "/aboutUs", method = RequestMethod.GET)
//	public String forwardToAboutUs(HttpServletRequest request, HttpServletResponse response) {
//		return "AboutUs";
//	}
	
	@RequestMapping(path = "/orderEntryFailed", method = RequestMethod.GET)
	public String viewOrderEntryFormFailed(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.getWriter().println("The order is not valid! Re-take the order!");
		InventoryService inventoryService = ServiceLocator.getInventoryService();
		request.setAttribute("order", inventoryService.getAvailableInventory());
		return "OrderEntryForm";
	}
	
	@RequestMapping(path = "/submitItems", method = RequestMethod.POST)
	public String submitItems(@ModelAttribute("order") Order order, HttpServletRequest request) {
		if(!ServiceLocator.getOrderProcessingService().validateItemAvailability(order))
			return "redirect:/purchase/orderEntryFailed";
		request.getSession().setAttribute("order", order);
		System.out.println("Order inside submitItems=" + order);
		return "redirect:/purchase/paymentEntry";
	}

	@RequestMapping(path = "/paymentEntry", method = RequestMethod.GET)
	public String viewPaymentEntryForm(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("payment", new PaymentInfo());
		return "PaymentEntryForm";
	}

	@RequestMapping(path = "/submitPayment", method = RequestMethod.POST)
	public String submitPayment(@ModelAttribute("payment") PaymentInfo payment, HttpServletRequest request) {
		request.getSession().setAttribute("payment", payment);
		return "redirect:/purchase/shippingEntry";
	}

	@RequestMapping(path = "/shippingEntry", method = RequestMethod.GET)
	public String viewShippingEntryForm(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("shipping", new ShippingInfo());
		return "ShippingEntryForm";
	}

	@RequestMapping(path = "/submitShipping", method = RequestMethod.POST)
	public String submitShipping(@ModelAttribute("shipping") ShippingInfo shippingInfo, HttpServletRequest request) {
		request.getSession().setAttribute("shipping", shippingInfo);
		return "redirect:/purchase/viewOrder";
	}

	@RequestMapping(path = "/viewOrder", method = RequestMethod.GET)
	public String viewOrder(HttpServletRequest request, HttpServletResponse response) {
//		request.setAttribute("order", new PaymentInfo());	
		return "ViewOrder";
	}

	@RequestMapping(path = "/confirmOrder", method = RequestMethod.POST)
	public String confirmOrder(@ModelAttribute("order") Order order, HttpServletRequest request) {
		String code = ServiceLocator.getOrderProcessingService().processOrder(order);
		request.getSession().setAttribute("order", order);
		request.getSession().setAttribute("orderConfirm", code);
		return "redirect:/purchase/paymentConfirmation";
	}

	@RequestMapping(path = "/paymentConfirmation", method = RequestMethod.GET)
	public String viewConfirmation(HttpServletRequest request, HttpServletResponse response) {
//		request.setAttribute("payment", new PaymentInfo());	
		return "Confirmation";
	}

}
