package com.example.demo.rest;


import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * @author Ken Finnigan
 */
@Path("/employee")
public class EmployeeResource {

    @Inject
    PersistenceHelper helper;

    @GET
    @Produces("application/json")
    public Employee[] get() {
        return helper.getEntityManager().createNamedQuery("Employee.findAll", Employee.class).getResultList().toArray(new Employee[0]);
    }
}
