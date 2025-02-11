package com.e_commerce.spring_boot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.e_commerce.spring_boot.entity.Product;

// This allows our angular app to communicate to this port at 8080
@CrossOrigin("http://localhost:4200")
public interface ProductRepository extends JpaRepository<Product, Long>{

}
