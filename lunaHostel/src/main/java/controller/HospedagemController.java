package controller;

import entity.Hospedagem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.IHospedagemService;

import java.util.List;

@RestController
@RequestMapping("/hospedagens")
public class HospedagemController {

    @Autowired
    private IHospedagemService hospedagemService;
    private Object Hospedagens;

    @GetMapping("/getAll")
    public ResponseEntity<List<Hospedagem>> getAll(){
        return new ResponseEntity<>(hospedagemService.getAll(), HttpStatus.OK);
    }

    @PostMapping
    public Hospedagem create(@RequestBody Hospedagem hospedagem) {
        return hospedagemService.create(hospedagem);
    }

    @PutMapping("/{idPet/hospedagens}")
    public Hospedagem putHospedagem(@RequestBody Hospedagem hospedagem) {
        return hospedagemService.putHospedagem(hospedagem);
    }
    @DeleteMapping("/{idPet/hospedagens}")
    public Hospedagem deleteHospedagem(@RequestBody Hospedagem hospedagem) {
        return hospedagemService.deleteHospedagem(hospedagem);
    }

}

