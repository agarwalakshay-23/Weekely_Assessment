package com.globllogic.springTest.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globllogic.springTest.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
