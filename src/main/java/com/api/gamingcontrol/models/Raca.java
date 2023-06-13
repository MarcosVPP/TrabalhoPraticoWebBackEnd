package com.api.gamingcontrol.models;

import javax.persistence.*;

@Entity
public class Raca {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String nome;
    private String idioma;
    private Integer id_habilidade;
    private Integer id_subraca;/**/

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

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public Integer getId_habilidade() {
        return id_habilidade;
    }

    public void setId_habilidade(Integer id_habilidade) {
        this.id_habilidade = id_habilidade;
    }

    public Integer getId_subraca() {
        return id_subraca;
    }

    public void setId_subraca(Integer id_subraca) {
        this.id_subraca = id_subraca;
    }
}

