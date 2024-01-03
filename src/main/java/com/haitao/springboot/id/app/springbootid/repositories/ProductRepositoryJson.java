package com.haitao.springboot.id.app.springbootid.repositories;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.haitao.springboot.id.app.springbootid.models.Product;

public class ProductRepositoryJson implements ProductRepository{

    List<Product> list;

  
    public ProductRepositoryJson() {
        //leer el archivo json
        Resource resource = new ClassPathResource("json/product.json");
       //Permite convertir un archivo( file) a un objeto de java
        ObjectMapper objectMapper = new ObjectMapper();
        //Lee el json y convierte el resource en un archivo
        // y lo ponemos en un array y convertimos en list
        try {
            list = Arrays.asList(objectMapper.readValue(resource.getFile(),Product[].class));
        } catch (StreamReadException e) {
            e.printStackTrace();
        } catch (DatabindException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Product> findAll() {
        return null;
    }

    @Override
    public Product findById(Long id) {
        return null;
    }
    

}
