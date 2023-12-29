package com.haitao.springboot.id.app.springbootid.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.haitao.springboot.id.app.springbootid.models.Product;
import com.haitao.springboot.id.app.springbootid.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api")
public class SomeController {
    //problemas de mutabilidad. (cada request es compartido )
    private ProductService service = new ProductService();

    @GetMapping
    public List<Product> list(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Product show(@PathVariable Long id){
        return  service.findById(id);
    }
    
    
}
