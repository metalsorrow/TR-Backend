package com.TurismoReal.ProyectoTurismo.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name="COMUNA")
public class Comuna {
    //@SequenceGenerator(name="", sequenceName="", initialValue = 1, allocationSize = 1)
    //@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "")
    @Id
    @Column(name="ID_COMUNA")
    private Integer idComuna;
    @Column(name = "NOM_COMUNA")
    private String nomComuna;
    @Column(name = "ID_CIUDAD")
    private String idCiudad;

    public Comuna(Integer idComuna, String nomComuna, String idCiudad) {
        this.idComuna = idComuna;
        this.nomComuna = nomComuna;
        this.idCiudad = idCiudad;
    }

    public Integer getIdComuna() {
        return idComuna;
    }

    public String getNomComuna() {
        return nomComuna;
    }

    public String getIdCiudad() {
        return idCiudad;
    }

    public void setIdComuna(Integer idComuna) {
        this.idComuna = idComuna;
    }

    public void setNomComuna(String nomComuna) {
        this.nomComuna = nomComuna;
    }

    public void setIdCiudad(String idCiudad) {
        this.idCiudad = idCiudad;
    }
}
