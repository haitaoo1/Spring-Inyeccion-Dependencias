package com.haitao.springboot.id.app.springbootid.repositories;

import java.util.List;

import com.haitao.springboot.id.app.springbootid.models.Product;

public interface ProductRepository  {
    List<Product> findAll();

    Product findById(Long id);
}
