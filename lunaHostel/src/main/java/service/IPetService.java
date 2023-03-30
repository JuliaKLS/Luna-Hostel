package service;

import entity.Hospedagem;
import entity.Pet;

import java.util.List;

public interface IPetService {

    Pet create(Pet pet);

    List<Hospedagem> hospedagemList(Integer id);

    Pet putPet(Pet pet);

    Pet delete(Integer id);
}
