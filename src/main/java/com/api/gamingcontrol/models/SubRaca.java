package com.api.gamingcontrol.models;

import javax.persistence.*;


@Entity
public class SubRaca {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "id_habildiade_id")
    private Habilidade id_habildiade;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Habilidade getId_habildiade() {
        return id_habildiade;
    }

    public void setId_habildiade(Habilidade id_habildiade) {
        this.id_habildiade = id_habildiade;
    }
}

