package com.spring.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.apirest.apirest.Entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
    

}
