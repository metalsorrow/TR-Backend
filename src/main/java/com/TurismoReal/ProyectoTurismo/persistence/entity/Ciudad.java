package com.TurismoReal.ProyectoTurismo.persistence.entity;


import javax.persistence.*;

@Entity
@Table(name="CIUDAD")
public class Ciudad {
    @Id
    @Column(name = "ID_CIUDAD")
    private Integer idCiudad;
    @Column(name = "NOM_CIUDAD")
    private String nomCiudad;
    @Column(name = "ID_REGION")
    private Region region;

    public Ciudad(int idCiudad, String nomCiudad, Region region) {
        this.idCiudad = idCiudad;
        this.nomCiudad = nomCiudad;
        this.region = region;
    }

    public int getIdCiudad() {
        return idCiudad;
    }

    public String getNomCiudad() {
        return nomCiudad;
    }

    public Region getRegion() {
        return region;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    public void setNomCiudad(String nomCiudad) {
        this.nomCiudad = nomCiudad;
    }

    public void setRegion(Region region) {
        this.region = region;
    }
}
