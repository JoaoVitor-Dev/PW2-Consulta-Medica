package com.ifto.mapeamento.model.repository;

import com.ifto.mapeamento.model.entity.Consulta;
import com.ifto.mapeamento.model.entity.Medico;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ConsultaRepository {
    @PersistenceContext
    private EntityManager em;

    public List<Consulta> consultas(){
        Query query = em.createQuery("from Consulta");
        return query.getResultList();
    }

    public Consulta consulta(Long id){
        return em.find(Consulta.class, id);
    }

    public double total(){
        Query query = em.createQuery("SELECT SUM(VALOR) FROM CONSULTA");
        return query.getFirstResult();
    }

    public double vTotal(){
        Query query = em.createQuery("select sum(valor) from Consulta ");
        List total;
        total = query.getResultList();
        return (Double) total.get(0);
    }

}
