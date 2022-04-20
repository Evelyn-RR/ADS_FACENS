package com.example.demo.services;

import com.example.demo.dto.UsuarioDTO;
import com.example.demo.entity.Perfil;
import com.example.demo.entity.Usuario;
import com.example.demo.exceptions.RegraNegocioException;
import com.example.demo.repository.PerfilRepository;
import com.example.demo.repository.UsuarioRepository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {
    private final UsuarioRepository usuarioRepository;
    private final PerfilRepository perfilRepository;    

    @Override
    @Transactional
    public Usuario salvar(UsuarioDTO dto) {
       Perfil perfil = perfilRepository.findById(dto.getPerfil())
        .orElseThrow(()->
 new RegraNegocioException("Código do perfil não encontrado."));

        Usuario usuario = new Usuario();
        usuario.setEmail(dto.getEmail());
        usuario.setNome(dto.getNome());
        usuario.setSenha(dto.getSenha());
        usuario.setPerfil(perfil);

        return usuarioRepository.save(usuario);
    }
}
