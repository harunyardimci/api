package com.harun.api.resource;


import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.harun.api.util.GGResponse;
import com.harun.core.domain.Category;
import com.harun.core.service.CategoryService;
import com.sun.jersey.api.JResponse;

@Component
@Path("/categories/")
@Produces(MediaType.APPLICATION_JSON)
public class CategoryResource
{

    @Autowired
    private CategoryService categoryService;

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public JResponse<List<Category>> loadAll()
    {
        return JResponse.ok(categoryService.loadCategories()).build();
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public Response getCategory(@PathParam("id") int categoryId)
    {
        
        GGResponse myResponse = new GGResponse();
        myResponse.setErrCode(1);
        myResponse.setData(categoryService.getCategory(categoryId));
        return Response.ok(myResponse).build();
        
        //return Response.ok(categoryService.getCategory(categoryId)).build();
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response setCategory(Category category)
    {
        /*
         * post
         * aslinda bu asagidaki gibi olmasi lazim.. sadece tek elemanli list gecmek mantikli
         * 
            {
            "id": 7,
            "name": "Alisveris"
            }
         */
        
        return Response.ok(category.toString()).build();
    }
    
    @POST
    @Path("{multi}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response setMultipleCategories(List<Category> category)
    {
        /*
         * post
         * 
         [
            {
            "id": 7,
            "name": "Alisveris"
            },
            {
            "id": 8,
            "name": "Alisvsdfsdferis"
            }
          ]
         * 
         */
        
        return Response.ok(category.toString()).build();
    }
    
}