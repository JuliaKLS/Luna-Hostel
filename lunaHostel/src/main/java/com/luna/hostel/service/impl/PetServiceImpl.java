package com.luna.hostel.service.impl;

import com.luna.hostel.entity.Hospedagem;
import com.luna.hostel.entity.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.luna.hostel.repository.PetRepository;
import com.luna.hostel.service.IPetService;

import java.util.List;
import java.util.Optional;

@Service
public class PetServiceImpl implements IPetService {

    @Autowired
    private PetRepository petRepository;

    @Override
    public Pet create(Pet pet) {
        Pet petSave = petRepository.save(pet);
        return petSave;
    }

    @Override
    public List<Hospedagem> hospedagemList(Integer id) {
        return null;
    }

    @Override
    public Pet putPet(Pet pet) {
        Pet petAtualizado = petRepository.save(pet);
        return petAtualizado ;
    }

    @Override
    public void delete(Long id) {
        petRepository.deleteById(id);
    }

    @Override
    public List<Pet> getAll() {
        return petRepository.findAll();
    }

    @Override
    public Pet getById(Long id) {
        Optional<Pet> pet = petRepository.findById(id);
        if(pet.isPresent()){
            return pet.get();
        }else{
            return null;
        }
    }
}

