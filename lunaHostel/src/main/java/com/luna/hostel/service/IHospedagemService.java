package com.luna.hostel.service;

import com.luna.hostel.entity.Hospedagem;

import java.time.LocalDate;
import java.util.List;

public interface IHospedagemService {

    List<Hospedagem> getAll(String date);

    Hospedagem getById(Long id);

    Hospedagem putHospedagem(Hospedagem hospedagem);

    Hospedagem create(Hospedagem hospedagem);

    void deleteHospedagem(Long id);


}
