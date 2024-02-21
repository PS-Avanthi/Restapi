package com.example.petproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Pets")
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long petId;
     String petName;
     String petBreed;
     Double petPrice;
     String petFood;
    public Long getPetId() {
        return petId;
    }
    // public Pet(Long petId, String petName, String petBreed, Double petPrice, String petFood) {
    //     this.petId = petId;
    //     this.petName = petName;
    //     this.petBreed = petBreed;
    //     this.petPrice = petPrice;
    //     this.petFood = petFood;
    // }
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
    public Double getPetPrice() {
        return petPrice;
    }
    public void setPetPrice(Double petPrice) {
        this.petPrice = petPrice;
    }
    public String getPetFood() {
        return petFood;
    }
    public void setPetFood(String petFood) {
        this.petFood = petFood;
    }

    
}
