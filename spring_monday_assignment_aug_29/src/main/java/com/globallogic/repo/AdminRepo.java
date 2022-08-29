package com.globallogic.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.globallogic.model.Admin;

@Repository
public interface AdminRepo extends JpaRepository<Admin, Integer> {

}
