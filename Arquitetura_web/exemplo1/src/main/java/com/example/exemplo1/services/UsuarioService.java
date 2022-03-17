package com.example.exemplo1.services;

import com.example.exemplo1.Models.Usuario;
import com.example.exemplo1.repositories.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;

public class UsuarioService {

    //Injeçao pelo construtor
    private UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public void inserir(Usuario usuario){
        if(validar(usuario)){
            usuarioRepository.inserir(usuario);
        }
    }
    public boolean validar(Usuario usuario){
        return true;
    }
}
