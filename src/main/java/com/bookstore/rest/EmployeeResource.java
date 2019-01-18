package com.bookstore.rest;

import com.bookstore.service.CustomerService;
import com.bookstore.service.EmployeeService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.ValidationException;
import java.io.Serializable;

@Path("{schema}/employee/")
public class EmployeeResource implements Serializable {

    @Inject
    private EmployeeService employeeService;

    @GET
    @Path("/login")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCustomerById(@PathParam("schema") String schema,
                                    @QueryParam("user-name") String userName,
                                    @QueryParam("pass") String pass) throws ValidationException {
        return Response.ok(employeeService.findEmployeeByUserName(userName, pass)).build();
    }
}
