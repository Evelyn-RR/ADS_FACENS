package com.example.aula3.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import com.example.aula3.entity.Categoria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class CategoriaRepository {
    @Autowired
    private EntityManager entityManager;

    @Transactional
    public Categoria inserir(Categoria categoria){
        entityManager.persist(categoria);
        return categoria;
    }

    @Transactional
    public Categoria atualizar(Categoria categoria){
        entityManager.merge(categoria);
        return categoria;
    }

    @Transactional
    public void excluir(Categoria categoria){
        entityManager.remove(categoria);
    }

    @Transactional
    public void excluir(int id){
        excluir(entityManager.find(Categoria.class, id));
    }

    @Transactional(readOnly = true)
    public List<Categoria> obterPorNome(String nome){
        String jpql = "select c from categoria c where c.nome like :nome";
        TypedQuery<Categoria> query = entityManager.createQuery(jpql, Categoria.class);
        query.setParameter("nome", "%" + nome  + "%");
        return query.getResultList();
    }

    @Transactional(readOnly = true)
    public List<Categoria> obterTodos(){
          return entityManager.createQuery("from Categoria", Categoria.class).getResultList();        
    }
}
