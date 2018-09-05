package com.app.test.resource;

import java.io.OutputStream;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.StreamingOutput;

/**
 *
 * @author SANDEEP RAWAT
 */
public class FirstLastCustomerResource {
    
    @GET
    @Path("{first}-{last}")
    @Produces("application/xml")
    public StreamingOutput getCustomer(@PathParam("first") String firstName, @PathParam("last") String lastName) {
        return (OutputStream out) -> {
            out.write(firstName.getBytes());
        };
    }
    
    @PUT
    @Path("{first}-{last}")
    @Consumes("application/xml")
    public void updateCustomer(@PathParam("first") String firstName, @PathParam("last") String lastName) {
        System.out.println("First Name: " + firstName + ", Last Name: " + lastName);
    }
}
