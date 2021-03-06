package com.fedex.shipping;

import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

@ApplicationPath("services")
@Path("shipping")
public class ShippingInitiationService extends Application {
	
	@GET
	@Path("isAlive")
	@Produces(MediaType.TEXT_PLAIN)
	public String ping() {
		return "Fedex Service is up and running ...";
	}
	
	@POST
	@Path("/initiate")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public JsonObject initiateShipping(JsonObject incomingJson) {

		String organization = incomingJson.getString("Organization");
		int orderRefId = incomingJson.getInt("OrderRefId");
		int numberOfItemsToShip = incomingJson.getInt("ItemsCount");
		String zip = incomingJson.getString("Zip");

		System.out.println("Fedex\n===\n" + organization 
				+ " requested shipping of " + numberOfItemsToShip
				+ " items to ZIP: " + zip 
				+ ", Order Ref: " + orderRefId);

		// Persist the shipping request and generate a shipping reference
		// skip for now, create a hard-coded shipping number - PK

		JsonObject responseJson = Json.createObjectBuilder()
				.add("Accepted", true)
				.add("ShippingReferenceNumber", 90001)
				.add("Organization", organization)
				.add("OrderRefId", orderRefId)
				.build();

		return responseJson;
	}

}
