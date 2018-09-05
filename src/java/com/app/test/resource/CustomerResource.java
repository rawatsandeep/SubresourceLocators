package com.app.test.resource;

import java.io.OutputStream;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.StreamingOutput;

/**
 *
 * @author SANDEEP RAWAT
 */
public class CustomerResource {
    
    @POST
    @Produces("application/xml")
    public Response createCustomer() {
        String object = "<customer>Customer Resource</customer>";
        return Response.ok(object, MediaType.APPLICATION_XML).build();
    }
    
    @GET
    @Path("{id}")
    @Produces("applicaton/xml")
    public StreamingOutput getCustomer(@PathParam("id") int id) {
        return (OutputStream out) -> {
            out.write(id);
        };
    }
    
    @PUT
    @Path("{id}")
    @Consumes("application/xml")
    public void updateCustomer(@PathParam("id") int id) {
        System.out.println("customer updated! " + id);
    }
    
}
