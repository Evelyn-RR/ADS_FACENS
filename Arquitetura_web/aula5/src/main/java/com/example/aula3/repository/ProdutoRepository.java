package com.example.aula3.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.example.aula3.entity.Produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


public interface ProdutoRepository extends JpaRepository<Produto, Integer>{
   
    @Query("select p from Produto p left join fetch p.categoria where p.id = :id")
    List<Produto> findPerfilByIdFetchUsuarios(@Param("id") int codigo);
}
