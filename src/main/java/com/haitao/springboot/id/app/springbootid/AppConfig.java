package com.haitao.springboot.id.app.springbootid;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import com.haitao.springboot.id.app.springbootid.repositories.ProductRepository;
import com.haitao.springboot.id.app.springbootid.repositories.ProductRepositoryJson;

@Configuration
@PropertySource("classpath:config.properties")
public class AppConfig {

    //se puede omitir el public
    @Bean("productJson")
    @Primary
    public ProductRepository productRepositoryJson(){
       return new ProductRepositoryJson();
    }
}
