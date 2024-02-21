package com.example.wfproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.wfproject.service.PetService;

@RestController
public class PetController {

    @Autowired PetService petService;
     
    @PostMapping ("/api/pet")
    
    public Pet addPet(@Request Pet pet)
    {
        return petService.addPet(pet);
    }
    
}
