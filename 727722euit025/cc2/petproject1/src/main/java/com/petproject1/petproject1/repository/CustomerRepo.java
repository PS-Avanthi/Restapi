package com.petproject1.petproject1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.petproject1.petproject1.model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,Long>{
    
}
