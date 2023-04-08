package com.luna.hostel.service.impl;

import com.luna.hostel.entity.Hospedagem;
import com.luna.hostel.entity.Pet;
import com.luna.hostel.service.IPetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.luna.hostel.repository.HospedagemRepository;
import com.luna.hostel.service.IHospedagemService;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

@Service
public class HospedagemServiceImpl implements IHospedagemService {

    @Autowired
    private HospedagemRepository hospedagemRepository;
    @Autowired
    private IPetService petService;

    @Override
    public List<Hospedagem> getAll(String date) {
        if (date == null){
            return hospedagemRepository.findAll();

        }else {

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate localDate = LocalDate.parse(date, formatter);

            return hospedagemRepository.findByDataDeEntradaLessThanEqualAndDataDeSaidaGreaterThanEqual(localDate, localDate);
        }
    }

    @Override
    public Hospedagem getById(Long id) {
        Optional<Hospedagem> hospedagem = hospedagemRepository.findById(id);
        if (hospedagem.isPresent()){
            return hospedagem.get();
        }else {
            return null;
        }
    }

    @Override
    public Hospedagem putHospedagem(Hospedagem hospedagem) {
        Hospedagem hospedagemAtual = hospedagemRepository.save(hospedagem);
        return hospedagemAtual;
    }

    @Override
    public Hospedagem create(Hospedagem hospedagem) {
        Pet pet = petService.getById(hospedagem.getPet().getId());
        if (pet != null){
            Hospedagem criarHospedagem = hospedagemRepository.save(hospedagem);
            return criarHospedagem;
        }else {
            throw new RuntimeException("Pet não existente.");
        }
    }

    @Override
    public void deleteHospedagem(Long id) {
        hospedagemRepository.deleteById(id);
    }

}
