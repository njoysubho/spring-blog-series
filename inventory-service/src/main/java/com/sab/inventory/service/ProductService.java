package com.sab.inventory.service;

import com.sab.inventory.dto.Product;
import com.sab.inventory.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService{
    private final ProductRepository productRepository;
    public List<Product> getAllProducts(){
        return productRepository.getAllProducts();
    }
}
