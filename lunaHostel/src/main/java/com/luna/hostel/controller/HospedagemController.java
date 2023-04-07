package com.luna.hostel.controller;

import com.luna.hostel.entity.Hospedagem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.luna.hostel.service.IHospedagemService;

import javax.websocket.server.PathParam;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/hospedagens")
public class HospedagemController {

    @Autowired
    private IHospedagemService hospedagemService;

    @GetMapping
    public ResponseEntity<List<Hospedagem>> getAll(@RequestParam(value = "date", required = false) String date){
        List<Hospedagem> hospedagemList = hospedagemService.getAll(date);
        return new ResponseEntity<>(hospedagemList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Hospedagem> getById(@PathVariable Long id){
        Hospedagem hospedagem = hospedagemService.getById(id);
        if (hospedagem != null){
            return new ResponseEntity<>(hospedagem, HttpStatus.OK);
        }else {
            return new ResponseEntity<>(hospedagem, HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Hospedagem> create(@RequestBody Hospedagem hospedagem) {
        Hospedagem criarHospedagem = hospedagemService.create(hospedagem);
        return new ResponseEntity<>(criarHospedagem, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Hospedagem> putHospedagem(@RequestBody Hospedagem hospedagem) {
        Hospedagem hospedagemAtual = hospedagemService.putHospedagem(hospedagem);
        return new ResponseEntity<>(hospedagemAtual, HttpStatus.OK);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteHospedagem(@PathVariable Long id) {
        hospedagemService.deleteHospedagem(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}


