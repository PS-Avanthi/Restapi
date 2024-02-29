package com.petproject1.petproject1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "petss")
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long petId;
    String petName;
    String petBreed;
    String petPrice;
    String petFood;
    public Long getPetId() {
        return petId;
    }
    public void setPetId(Long petId) {
        this.petId = petId;
    }
    public String getPetName() {
        return petName;
    }
    public void setPetName(String petName) {
        this.petName = petName;
    }
    public String getPetBreed() {
        return petBreed;
    }
    public void setPetBreed(String petBreed) {
        this.petBreed = petBreed;
    }
    public String getPetPrice() {
        return petPrice;
    }
    public void setPetPrice(String petPrice) {
        this.petPrice = petPrice;
    }
    public String getPetFood() {
        return petFood;
    }
    public void setPetFood(String petFood) {
        this.petFood = petFood;
    }
    
    
}
