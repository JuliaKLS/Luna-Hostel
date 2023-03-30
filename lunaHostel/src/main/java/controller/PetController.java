package controller;

import entity.Hospedagem;
import entity.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.IPetService;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pets")
public class PetController {

    @Autowired
    private IPetService petService;

    @PostMapping
    public Pet create(@RequestBody Pet pet) {
        return petService.create(pet);
    }

    @PutMapping("/pets/{idPet}")
    public Pet putPet(@RequestBody Pet pet) {
        return petService.putPet(pet);
    }

    @DeleteMapping("/{idPet}")
    public void delete(@PathVariable("id")Integer id){
        petService.delete(id);
    }

    @GetMapping("/pets")
    public List<Hospedagem> hospedagemList(@PathVariable Integer id){
       return petService.hospedagemList(id);
    }
}
