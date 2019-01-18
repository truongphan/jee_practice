package com.bookstore.rest;

import com.bookstore.customer.model.CustomerModel;
import com.bookstore.service.CustomerService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.Serializable;

@Path("{schema}/customers/")
public class CustomerResource implements Serializable {

    @Inject
    private CustomerService customerService;

    @GET
    @Path("/{customer-id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCustomerById(@PathParam("schema") String schema,
                                    @PathParam("customer-id") Long customerId) {
        return Response.ok(customerService.getCustomerById(customerId)).build();
    }
}
