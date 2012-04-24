package com.harun.api.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.harun.core.service.UserService;

@Component
@Path("/users/")
@Produces(MediaType.APPLICATION_JSON)
public class UserResource
{

    @Autowired 
    private UserService userService;
    
    @GET
    public Response loadAll()
    {
        return Response.ok(userService.loadUsers()).build();
    }
    
    @GET
    @Path("{id}")
    public Response getUser(@PathParam("id") int userId)
    {
        return Response.ok(userService.getUser(userId)).build();
    }   
}