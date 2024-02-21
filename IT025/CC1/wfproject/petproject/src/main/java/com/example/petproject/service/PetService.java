package com.example.petproject.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.petproject.model.Pet;
import com.example.petproject.repository.PetRepository;

@Service
public class PetService {
    @Autowired
    PetRepository petRepository;
    Pet pets;
    
    @SuppressWarnings("null")
    public Pet addpet(Pet pet) 
    {
        return petRepository.save(pet);
    }
    public List<Pet> getpet()
    {
        return petRepository.findAll();
    }
    @SuppressWarnings("null")
    public java.util.Optional<Pet> getpetbyId(Long id)
    {
        return petRepository.findById(id);
    }
    @SuppressWarnings("null")
    public Pet edituser(Long petid,Pet pet)
    {
        pets = petRepository.findById(petid).orElse(null);
        if(pets !=null)
        {    
              pets.setPetBreed(pet.getPetBreed());
              pets.setPetFood(pet.getPetName());
              pets.setPetName(pet.getPetName());
              pets.setPetPrice(pet.getPetPrice());
              
             return petRepository.saveAndFlush(pets);
        }
        else
        return null;
    }

    @SuppressWarnings("null")
    public void deluser(Long petid)
    {
         petRepository.deleteById(petid);
    }
}

