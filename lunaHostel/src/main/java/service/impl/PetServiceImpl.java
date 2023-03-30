package service.impl;

import entity.Hospedagem;
import entity.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.PetRepository;
import service.IPetService;

import java.util.List;

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
        Pet petAtual = petRepository.save(pet);
        return petAtual ;
    }

    @Override
    public Pet delete(Integer id) {
        return null;
    }
}

