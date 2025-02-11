package com.e_commerce.spring_boot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.e_commerce.spring_boot.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
