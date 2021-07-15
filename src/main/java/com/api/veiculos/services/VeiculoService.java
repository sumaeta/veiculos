package com.api.veiculos.services;

import com.api.veiculos.model.Veiculo;
import com.api.veiculos.repositories.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class VeiculoService {

    @Autowired
    private VeiculoRepository veiculoRepository;

    public Veiculo insert(Veiculo id){
        return veiculoRepository.save(id);
    }
}
