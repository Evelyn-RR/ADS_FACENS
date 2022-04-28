package com.example.demo.services;

import com.example.demo.dto.DadosUsuariosDTO;
import com.example.demo.dto.UsuarioDTO;
import com.example.demo.entity.Usuario;

public interface UsuarioService {
    Usuario salvar(UsuarioDTO dto);
    DadosUsuariosDTO obterUsuarioPorID(Integer id);
    void remove(Integer id);
    void editar(Integer id, UsuarioDTO dto);
}
