package com.api.veiculos;

import com.api.veiculos.model.Usuario;
import com.api.veiculos.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario insert(Usuario id){
        return usuarioRepository.save(id);
    }
}
