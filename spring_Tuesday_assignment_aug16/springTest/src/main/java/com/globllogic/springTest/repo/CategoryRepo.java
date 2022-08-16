package com.globllogic.springTest.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globllogic.springTest.entity.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
