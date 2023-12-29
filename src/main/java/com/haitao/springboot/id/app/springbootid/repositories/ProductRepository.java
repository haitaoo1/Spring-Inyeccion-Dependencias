package com.haitao.springboot.id.app.springbootid.repositories;

import java.util.Arrays;
import java.util.List;

import com.haitao.springboot.id.app.springbootid.models.Product;

public class ProductRepository {

    List<Product> data;

    public ProductRepository(){
        this.data = Arrays.asList(
            new Product(1L, "Memoria corsair 32", 300L),
            new Product(2L, "Cpu Intel Core i9", 800L),
            new Product(3L, "Motherboard Gigabyte", 200L),
            new Product(3L, "Raton Razer", 80L));
    }
    
    public List <Product> findAll(){
        return data;
    }

    public Product findById(Long id){
        return data.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }
}
