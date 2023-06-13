package com.api.gamingcontrol.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Antecedente {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String nome;
    private String habildiade_antecedente;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHabildiade_antecedente() {
        return habildiade_antecedente;
    }

    public void setHabildiade_antecedente(String habildiade_antecedente) {
        this.habildiade_antecedente = habildiade_antecedente;
    }
}
