package com.e_commerce.spring_boot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import com.e_commerce.spring_boot.entity.Product;
import com.e_commerce.spring_boot.entity.ProductCategory;

@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer{

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        RepositoryRestConfigurer.super.configureRepositoryRestConfiguration(config, cors);

        HttpMethod[] theUnsupportedActions = {HttpMethod.PUT, HttpMethod.POST, HttpMethod.DELETE};

        //this will disable PUT POST and DELETE on our Product class
        config.getExposureConfiguration()
        .forDomainType(Product.class)
        .withItemExposure((metdata, httpmethods) -> httpmethods.disable(theUnsupportedActions))
        .withCollectionExposure((metdata, httpmethods) -> httpmethods.disable(theUnsupportedActions));

        //this will disable PUT POST and DELETE on our ProductCategory class
        config.getExposureConfiguration()
        .forDomainType(ProductCategory.class)
        .withItemExposure((metdata, httpmethods) -> httpmethods.disable(theUnsupportedActions))
        .withCollectionExposure((metdata, httpmethods) -> httpmethods.disable(theUnsupportedActions));
    }
}