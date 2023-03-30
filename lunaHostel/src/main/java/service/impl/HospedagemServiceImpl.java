package service.impl;

import entity.Hospedagem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.HospedagemRepository;
import service.IHospedagemService;
import java.util.List;

@Service
public class HospedagemServiceImpl implements IHospedagemService {

    @Autowired
    private HospedagemRepository hospedagemRepository;

    //esse método será chamado no metodo GET na classe HospedagemController
    @Override
    public List<Hospedagem> getAll() {
        return hospedagemRepository.findAll();
    }

    @Override
    public Hospedagem putHospedagem(Hospedagem hospedagem) {
        return hospedagemRepository.save(hospedagem);
    }

    @Override
    public Hospedagem create(Hospedagem hospedagem) {
        return hospedagemRepository.save(hospedagem);
    }

    @Override
    public Hospedagem deleteHospedagem(Hospedagem hospedagem) {
        return hospedagemRepository.delete();
    }

}
