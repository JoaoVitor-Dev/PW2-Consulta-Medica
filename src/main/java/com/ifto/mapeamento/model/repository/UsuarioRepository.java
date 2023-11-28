package com.ifto.mapeamento.model.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

public class UsuarioRepository {
    @PersistenceContext
    private EntityManager em;


}
