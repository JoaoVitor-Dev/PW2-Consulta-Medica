package com.ifto.mapeamento.model.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
public class Paciente implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String nome, telefone;

    @OneToMany(mappedBy = "paciente")
    private List<Consulta> consultas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
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
