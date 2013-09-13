package com.restfull;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("/path")
public class UserREST {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Path("/{param}")
    public Response getIt(@PathParam("param") String msg) {
    	String output = "Jersey say : " + msg;
    	return Response.status(200).entity(output).build();
    }
}

