package com.api.gamingcontrol.models;

import javax.persistence.*;


@Entity
public class Classe {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String nome;
    private Integer vida;
    private String pericia;
    private String armas;
    private String armaduras;
    private String ferramentas;
    private Integer id_habilidade;

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

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public String getPericia() {
        return pericia;
    }

    public void setPericia(String pericia) {
        this.pericia = pericia;
    }

    public String getArmas() {
        return armas;
    }

    public void setArmas(String armas) {
        this.armas = armas;
    }

    public String getArmaduras() {
        return armaduras;
    }

    public void setArmaduras(String armaduras) {
        this.armaduras = armaduras;
    }

    public String getFerramentas() {
        return ferramentas;
    }

    public void setFerramentas(String ferramentas) {
        this.ferramentas = ferramentas;
    }

    public Integer getId_habilidade() {
        return id_habilidade;
    }

    public void setId_habilidade(Integer id_habilidade) {
        this.id_habilidade = id_habilidade;
    }
}


