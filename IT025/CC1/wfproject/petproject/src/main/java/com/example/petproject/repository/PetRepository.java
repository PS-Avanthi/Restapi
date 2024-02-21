package com.example.petproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.petproject.model.Pet;

@Repository
public interface PetRepository extends JpaRepository <Pet,Long>{
    
}
