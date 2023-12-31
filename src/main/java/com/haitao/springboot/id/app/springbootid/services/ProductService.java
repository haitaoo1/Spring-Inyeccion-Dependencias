package com.haitao.springboot.id.app.springbootid.services;

import java.util.List;

import com.haitao.springboot.id.app.springbootid.models.Product;

public interface ProductService {

    public List<Product> findAll();
    Product findById(Long id);
    
} 
