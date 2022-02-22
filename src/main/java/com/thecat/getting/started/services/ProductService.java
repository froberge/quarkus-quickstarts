package com.thecat.getting.started.services;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import javax.ws.rs.NotFoundException;

import com.thecat.getting.started.model.Product; 

@ApplicationScoped
public class ProductService {
    
    public List<Product> listProduct() {
        return Product.findAll().list();
    }

    public Product findProductById(Integer id) {
        return Product.findById(id);
    }

    public List<Product> findProductBySize(String size) {
        return Product.list("size", size.toUpperCase());
    }

    public long getProductCount() {
        return Product.count();
    }

    @Transactional
    public void addProduct(Product product) {

        System.out.println( "PRODUCT " +  product.toString() );
        Product.persist(product);
    }


    @Transactional
    public void deleteById(Integer id) {
            Product product = Product.findById(id);
            if(product == null) {
                throw new NotFoundException();
            }
            product.delete();
    }

}