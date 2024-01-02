package com.haitao.springboot.id.app.springbootid.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.haitao.springboot.id.app.springbootid.models.Product;
import com.haitao.springboot.id.app.springbootid.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
 
    @Autowired
    private Environment environment;

    @Value("${config.price.tax}")
    private Double tax;

    //@Autowired
    private ProductRepository repository;
    // private ProductRepositoryImpl repository = new ProductRepositoryImpl();
    
    public ProductServiceImpl(@Qualifier("productList")ProductRepository repository) {
        this.repository = repository;
    }

    //metodo setter
    // @Autowired
    // public void setRepository(ProductoRepository repository) {
    //     this.repository = repository;
    // }

    @Override
    public List<Product> findAll(){
        return repository.findAll().stream().map(p -> {
            Double priceTax = p.getPrice() * tax;
            // Double priceTax = p.getPrice() * environment.getProperty("config.price.tax", Double.class);
           // Product newProd = new Product(p.getId(), p.getName(), priceImp.longValue());
           // return newProd;
            Product newProduct = (Product) p.clone();
            newProduct.setPrice(priceTax.longValue());
            return newProduct;
        }).collect(Collectors.toList());
    }
    @Override
    public Product findById(Long id){
        return repository.findById(id);
    }
}
