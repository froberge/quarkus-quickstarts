package com.thecat.getting.started.endpoints;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.thecat.getting.started.services.ProductService;
import com.thecat.getting.started.model.Product;

@Path("/products")
public class ProductResource {

    @Inject
    ProductService productService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Product> listProduct() {
        return productService.listProduct();
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Product getAProduct(@PathParam( "id" ) Integer id) {
        return productService.findProductById(id);
    }

    @GET
    @Path("count")
    @Produces(MediaType.APPLICATION_JSON)
    public long getCount() {
        return productService.getProductCount();
    }

    @POST
    @Path( "/add" )
    public Response addProduct( Product product ) {
        productService.addProduct(product);
        return Response.ok().build();
    }

    @DELETE
    @Path("{id}")
    public Response delete(@PathParam( "id" ) Integer id) {
        productService.deleteById(id);
        return Response.ok().build();
    }

    // @PUT
    // @Path("/edit")
    // public Response editProduct( Product product ) {
    //     productService.modifyProduct(product);
    //     return Response.ok().build();
    // }

}