package com.ifto.mapeamento.model.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@DiscriminatorValue("M")
@PrimaryKeyJoinColumn(name = "id")
public class Medico extends Pessoa implements Serializable {
    private String crm;

    @OneToMany(mappedBy = "medico")
    private List<Consulta> consultas;

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    public double valorTotal(){
        double total = 0.00;

        for (Consulta consulta : consultas) {
            total += consulta.getValor();
        }
        return total;
    }
}
