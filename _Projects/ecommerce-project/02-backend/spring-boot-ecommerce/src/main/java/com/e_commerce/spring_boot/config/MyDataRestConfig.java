package com.e_commerce.spring_boot.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import jakarta.persistence.EntityManager;
import jakarta.persistence.metamodel.EntityType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import com.e_commerce.spring_boot.entity.Product;
import com.e_commerce.spring_boot.entity.ProductCategory;

@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer{

    private EntityManager entityManager;

    @Autowired
    public MyDataRestConfig(EntityManager entityManger){
        this.entityManager = entityManger;
    }


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

        // call an internal helper method to expose ids
        exposeIds(config);
        
        }

        private void exposeIds(RepositoryRestConfiguration config) {
            
            // exposee entity ids

            // - get a list of all entity classes from the entity manager
            //Set<EntityType<?>> entities = entityManager.getMetamodel().getEntities();
            Set<EntityType<?>> entities = entityManager.getMetamodel().getEntities();

            // - create an array of the entity types
            List<Class> entityClasses = new ArrayList<>();

            // - get the entity typees for the entities
            for(EntityType tempEntityType : entities){
                entityClasses.add(tempEntityType.getJavaType());
            }

            // = expose the entity ids for the array of entity/domain types
            Class[] domainTypes = entityClasses.toArray(new Class[0]);
            config.exposeIdsFor(domainTypes);
        }
}