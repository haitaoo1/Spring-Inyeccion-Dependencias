package com.haitao.springboot.id.app.springbootid.repositories;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.haitao.springboot.id.app.springbootid.models.Product;

@Component
public class ProductRepositoryImpl implements ProductRepository{

    List<Product> data;

    public ProductRepositoryImpl(){
        this.data = Arrays.asList(
            new Product(1L, "Memoria corsair 32", 300L),
            new Product(2L, "Cpu Intel Core i9", 800L),
            new Product(3L, "Motherboard Gigabyte", 200L),
            new Product(4L, "Raton Razer", 80L));
    }
    //overide se pone cuando se implementa metodos de una interfaz
    @Override
    public List <Product> findAll(){
        return data;
    }
    @Override
    public Product findById(Long id){
        return data.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }
}
