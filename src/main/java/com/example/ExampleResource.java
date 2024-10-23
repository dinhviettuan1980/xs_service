package com.example;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.jboss.resteasy.reactive.RestPath;
import org.jboss.resteasy.reactive.RestQuery;

import java.util.Map;
import java.util.Set;

@Path("/api")
public class ExampleResource {

    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from Xoso REST";
    }

    @GET
    @Path("/xoayvong/{input}")
    @Produces(MediaType.TEXT_PLAIN)
    public Map<String, Set<String>> xoayvong(@RestPath String input) {
        XosoService oXosoService = new XosoService();
        return oXosoService.getNumberInOrder(input);
    }
}
