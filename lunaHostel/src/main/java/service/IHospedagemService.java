package service;

import entity.Hospedagem;

import java.util.List;

public interface IHospedagemService {

    Hospedagem putHospedagem(Hospedagem hospedagem);

    List<Hospedagem> getAll();

    Hospedagem create(Hospedagem hospedagem);

    Hospedagem deleteHospedagem(Hospedagem hospedagem);


}
