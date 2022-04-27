package com.example.demo.services;

import com.example.demo.dto.UsuarioDTO;
import com.example.demo.entity.Usuario;

public interface UsuarioService {
    Usuario salvar(UsuarioDTO dto);
}
