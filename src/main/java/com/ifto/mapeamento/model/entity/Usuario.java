package com.ifto.mapeamento.model.entity;

import jakarta.persistence.*;

import org.springframework.data.annotation.Id;
import java.io.Serializable;
import java.util.List;
import java.util.Set;


@Entity
public class Usuario implements Serializable {
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String login;
    private String senha;
    @ManyToMany(cascade = {CascadeType.MERGE})
    private Set<Perfil> perfis;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


}
