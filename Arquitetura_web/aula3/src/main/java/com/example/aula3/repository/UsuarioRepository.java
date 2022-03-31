package com.example.aula3.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import com.example.aula3.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class UsuarioRepository {
    private static String INSET = "insert into usuario(nome,email,senha) values(?,?,?)";
    private static String SELECT_ALL = "select * from usuario";
    private static String DELETE = "delete from usuario WHERE id = ?";
    private static String EDIT = "update usuario set nome = admin, email = admin@admin.com, senha = 321 where id = 1";

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public Usuario inserir(Usuario usuario){
        jdbcTemplate.update(INSET, new Object[]
            {usuario.getNome(), usuario.getEmail(), usuario.getSenha()});
        return usuario;
    }

    public void delete(int id){
        jdbcTemplate.update(DELETE, id);
    }

    public Usuario delete(Usuario usuario){
        delete(jdbcTemplate.find(usuario, id));
    }

    public Usuario edit(Usuario usuario){
        this.jdbcTemplate.update(EDIT, new Object[]
            {usuario.getNome(), usuario.getEmail(), usuario.getSenha()});
        return usuario;
    }

    public boolean(String email, String senha){

    }

    public List<Usuario> obterTodos(){
        return jdbcTemplate.query(SELECT_ALL, new RowMapper<Usuario>() {

            @Override
            public Usuario mapRow(ResultSet rs, int rowNum) throws SQLException {
                return new Usuario(
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getString("email"),
                    rs.getString("senha")
                    );
            }            
        });
    }
    
}
