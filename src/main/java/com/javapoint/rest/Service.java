package com.javapoint.rest;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/service")  
public class Service {
	@POST
	@Path("/add")
	public Response addUser(@FormParam("name") String name) {

		return Response.status(200)
				.entity("Hai mandato "+ name +" correttamente!")
				.build();
	}
}

