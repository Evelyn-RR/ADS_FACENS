package com.example.aula3.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.example.aula3.entity.Produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class ProdutoRepository {
    @Autowired
    private EntityManager entityManager;

    @Transactional
    public Produto inserir(Produto produto){
        entityManager.persist(produto);
        return produto;
    }

    @Transactional
    public Produto atualizar(Produto produto){
        entityManager.merge(produto);
        return produto;
    }

    @Transactional
    public void excluir(Produto produto){
        entityManager.remove(produto);
    }

    @Transactional
    public void excluir(int id){
        excluir(entityManager.find(Produto.class, id));
    }

    @Transactional(readOnly = true)
    public List<Produto> obterPorNome(String nome){
        String jpql = "select p from produto p where p.nome like :nome";
        TypedQuery<Produto> query = entityManager.createQuery(jpql, Produto.class);
        query.setParameter("nome", "%" + nome  + "%");
        return query.getResultList();
    }

    @Transactional(readOnly = true)
    public List<Produto> obterTodos(){
          return entityManager.createQuery(" from Produto", Produto.class).getResultList();        
    }
}
