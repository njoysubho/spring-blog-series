package com.sab.inventory.controller;

import com.sab.inventory.api.ProductsApi;
import com.sab.inventory.dto.Product;
import com.sab.inventory.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController("/v1")
@RequiredArgsConstructor
public class ProductController implements ProductsApi{
    private final ProductService productService;

    @Override
    public ResponseEntity<Product> addProduct(Product product){
        return null;
    }

    @Override
    public ResponseEntity<List<Product>> getAllProducts(){
        return ResponseEntity.ok(productService.getAllProducts());
    }

    @Override
    public ResponseEntity<Product> getProductById(UUID id){
        return null;
    }

    @Override
    public ResponseEntity<Product> updateProduct(UUID id, Product product){
        return null;
    }
}
