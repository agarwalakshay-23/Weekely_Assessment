package com.globllogic.springTest.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globllogic.springTest.entity.Merchant;

public interface MerchantRepo extends JpaRepository<Merchant, Integer>{

}