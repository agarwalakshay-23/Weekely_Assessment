package com.globllogic.springTest.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globllogic.springTest.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{

}
