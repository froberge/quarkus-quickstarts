package com.thecat;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String greeting() {
        return "Welcome to your first Quarkus app!!!";
    }

    @GET
    @Path("/workshop")
    @Produces(MediaType.TEXT_PLAIN)
    public String workshop() {
        return "Bienvenue au au workshop"; 
    }
}