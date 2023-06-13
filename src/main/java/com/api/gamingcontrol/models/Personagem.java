package com.api.gamingcontrol.models;

import javax.persistence.*;


@Entity
public class Personagem {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String nome;
    private String sexo;
    private Integer nivel;
    @ManyToOne
    @JoinColumn(name = "id_classe_id")
    private Classe id_classe;
    @ManyToOne
    @JoinColumn(name = "id_raca_id")
    private Raca id_raca;
    @ManyToOne
    @JoinColumn(name = "id_antecedente_id")
    private Antecedente id_antecedente;

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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public Classe getId_classe() {
        return id_classe;
    }

    public void setId_classe(Classe id_classe) {
        this.id_classe = id_classe;
    }

    public Raca getId_raca() {
        return id_raca;
    }

    public void setId_raca(Raca id_raca) {
        this.id_raca = id_raca;
    }

    public Antecedente getId_antecedente() {
        return id_antecedente;
    }

    public void setId_antecedente(Antecedente id_antecedente) {
        this.id_antecedente = id_antecedente;
    }
}

