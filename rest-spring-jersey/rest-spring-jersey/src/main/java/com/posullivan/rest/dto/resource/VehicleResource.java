package com.posullivan.rest.dto.resource;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.posullivan.rest.dto.Vehicle;
import com.posullivan.rest.util.Constants;

@Path("/vehicles")
@Component
@Scope("request")
@Produces(Constants.PRODUCES)
@Consumes(MediaType.APPLICATION_JSON)
public class VehicleResource {

	@POST
	public Response createVehicle(Vehicle vehicle) {
		// Long vehicleId = vechicleService.createVehicle(vehicle);
		Long vehicleId = 1L;
		return Response.status(Response.Status.CREATED)
				.entity("A new vehicle has been created.")
				.header("Location", Constants.VEHICLES_CONTEXT + vehicleId.toString())
				.build();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public Response createVehicle(
			@FormParam("make") String make,
			@FormParam("model") String model, 
			@FormParam("year") String year,
			@FormParam("guidePrice") Integer guidePrice) {	
		Vehicle vehicle = new Vehicle(make, model, year, guidePrice, null);
		// Long vehicleId = vechicleService.createVehicle(vehicle);
		Long vehicleId = 1L;
		return Response.status(Response.Status.CREATED)
				.entity("A new vehicle has been created.")
				.header("Location", Constants.VEHICLES_CONTEXT + vehicleId.toString())
				.build();
	}
	
	/*
	 * Query parameters are optional.
	 * Therefore, this method will bring back all vehicles or a subset of vehicles
	 */
	@GET
	public Response getVehicles(
			@QueryParam("make") String make,
			@QueryParam("model") String model, 
			@QueryParam("year") String year,
			@QueryParam("guidePrice") Integer guidePrice) {
		// List<Vehicle> vehicles = vechicleService.getVehicles(make, model, year, guidePrice);
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		if(vehicles != null && !vehicles.isEmpty()) {
			return Response.ok(vehicles)
					.status(Response.Status.OK)
					.build();
		} else {
			return Response.ok(vehicles)
					.status(Response.Status.NOT_FOUND)
					.build();
		}
	}
	
	/*
	 * Path parameters are required.
	 * Get a specific vehicle
	 */
	@GET
	@Path("{id}")
	public Response getVehicle(
			@PathParam("id") Long id) {
		// Vehicle vehicle = vechicleService.getVehicle(id);
		Vehicle vehicle = new Vehicle();
		if(vehicle != null) {
			return Response.ok(vehicle)
					.status(Response.Status.OK)
					.build();
		} else {
			return Response.status(Response.Status.NOT_FOUND)
					.entity("Vehicle not found.")
					.header("Location", Constants.VEHICLES_ID_CONTEXT + id.toString())
					.build();
		}
	}
	
	/*
	 * Partial Update.
	 * The users never update the id.
	 * Hence the use of post over put
	 */
	@POST
	@Path("{id}")
	public Response updateVehicle(
			@PathParam("id") Long id,
			Vehicle vehicle) {
		vehicle.setId(id);
		// Vehicle updatedVehicle = vechicleService.updateVehicle(vehicle);
		Vehicle updatedVehicle = new Vehicle();
		if(updatedVehicle != null) {
			return Response.ok(updatedVehicle)
					.status(Response.Status.OK)
					.build();
		} else {
			return Response.status(Response.Status.NOT_FOUND)
					.entity("Vehicle not found.")
					.header("Location", Constants.VEHICLES_ID_CONTEXT + id.toString())
					.build();
		}
	}
	
	@DELETE
	@Path("{id}")
	public Response deleteVehicle(
			@PathParam("id") Long id) {
		// Vehicle removedVehicle = vechicleService.deleteVehicle(id);
		Vehicle removedVehicle = new Vehicle();
		if(removedVehicle != null) {
			return Response.ok(removedVehicle)
					.status(Response.Status.OK)
					.build();
		} else {
			return Response.status(Response.Status.NOT_FOUND)
					.entity("Vehicle not found.")
					.header("Location", Constants.VEHICLES_ID_CONTEXT + id.toString())
					.build();
		}
	}

}
