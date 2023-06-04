package com.Proyecto.ProyectoProgra.dao;

import com.Proyecto.ProyectoProgra.models.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional

public class UsuarioDaoImp implements UsuarioDao  {


    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List<Usuario> getUsuarios() {
        String query = "FROM Usuario";
      return entityManager.createQuery (query).getResultList();

    }
}
