package com.sab.inventory.repository;

import com.sab.inventory.dto.Product;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class ProductRepository{
    private final List<Product> products = List.of(Product.builder().id(UUID.randomUUID()).build());
    public List<Product> getAllProducts(){
        return products;
    }
}
