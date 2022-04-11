package br.com.api.calculadoras.service;

import br.com.api.calculadoras.model.Imc;
import br.com.api.calculadoras.repository.ImcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImcService {

@Autowired
    private ImcRepository imcRepository;

    public void registrarImc( Imc imc) {
        imcRepository.save(imc);
    }

    public List<Imc> listarTodos(){
        return imcRepository.findAll();
    }

}
