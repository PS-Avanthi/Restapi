package com.example.petproject.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.petproject.model.Pet;
import com.example.petproject.service.PetService;

@RestController

public class PetController {

    @Autowired
     PetService petService;
     
     @PostMapping ("/api/pet")
     public Pet addpet(@RequestBody Pet pet) 
     {
         return petService.addpet(pet);
     }
    @GetMapping ("get/pet")
    public List<Pet> getpet() 
    {
        return petService.getpet();
    }

    @GetMapping("/api/pet/{petId}")
    public Optional<Pet> getpetbyId(@PathVariable Long petId)
    {
        return petService.getpetbyId(petId);
    }

    @PutMapping("/editpet/{petid}")
    public Pet edituser(@PathVariable Long petid, @RequestBody Pet pet) {
        
        
        return petService.edituser(petid,pet);
    }

    @DeleteMapping("/delpet/{petid}")
    public void deluser(@PathVariable Long petid)
    {
         petService.deluser(petid);
    }
}
