package com.haitao.springboot.id.app.springbootid.repositories;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import com.haitao.springboot.id.app.springbootid.models.Product;
@Primary
@Repository("productFoo")
public class ProductRepositoryFoo implements ProductRepository {

    @Override
    public List<Product> findAll() {
        return Collections.singletonList(new Product(1L,"Monitor Asus 27", 200L));
    }

    @Override
    public Product findById(Long id) {
        return new Product(id, "Monitor Asus 27", 200L);
    }
    
}
