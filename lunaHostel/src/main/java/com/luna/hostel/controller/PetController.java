package com.luna.hostel.controller;

import com.luna.hostel.entity.Hospedagem;
import com.luna.hostel.entity.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.luna.hostel.service.IPetService;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pets")
public class PetController {

    @Autowired
    private IPetService petService;

    @GetMapping
    public ResponseEntity<List<Pet>> getAll(){
        List<Pet> petsList = petService.getAll();
        return new ResponseEntity<>(petsList, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Pet> getById(@PathVariable Long id){
        Pet pet = petService.getById(id);
        if (pet != null){
            return new ResponseEntity<>(pet, HttpStatus.OK);
        }else {
            return new ResponseEntity<>(pet, HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Pet> create(@RequestBody Pet pet) {
        Pet petSave = petService.create(pet);
        return new ResponseEntity<>(petSave, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Pet> putPet(@RequestBody Pet pet) {
        Pet petAtualizado = petService.putPet(pet);
        return  new ResponseEntity<>(petAtualizado, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable Long id){
        petService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
