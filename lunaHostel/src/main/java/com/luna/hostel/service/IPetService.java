package com.luna.hostel.service;

import com.luna.hostel.entity.Hospedagem;
import com.luna.hostel.entity.Pet;

import java.util.List;

public interface IPetService {

    Pet create(Pet pet);

    List<Hospedagem> hospedagemList(Integer id);

    Pet putPet(Pet pet);

    void delete(Long id);

    List<Pet> getAll();

    Pet getById(Long id);
}
