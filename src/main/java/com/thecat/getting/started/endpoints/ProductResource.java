package com.thecat.getting.started.endpoints;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
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
    @Path("size/{size}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Product> getAProduct(@PathParam( "size" ) String size) {
        return productService.findProductBySize(size);
    }

    @GET
    @Path("count")
    @Produces(MediaType.APPLICATION_JSON)
    public long getCount() {
        return productService.getProductCount();
    }

    @GET
    @Path( "health")
    @Produces(MediaType.TEXT_PLAIN)
    public String health() {
        return "SUCCESS";
    }

    @POST
    @Path( "/addproduct" )
    public Response addProduct( Product product ) {
        //user.persist();
        return Response.ok().build();
    }

    @DELETE
    @Path("/{id}")
    public Response delete(@PathParam("id") String id) {
        // User user = User.findById(new ObjectId(id));
        // if(user == null) {
        //     throw new NotFoundException();
        // }
        // user.delete();

        return Response.ok().build()
        ;
    }
}