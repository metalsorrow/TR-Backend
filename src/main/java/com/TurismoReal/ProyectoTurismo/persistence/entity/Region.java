package com.TurismoReal.ProyectoTurismo.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name="Region")
public class Region {
    @Id
    @SequenceGenerator(name="REGION_ID_GENERATOR", sequenceName="REGION_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "REGION_ID_GENERATOR")
    @Column(name="id_region")
    private Integer idRegion;
    @Column(name = "nombre_region")
    private String nombreRegion;

    public Integer getIdRegion() {
        return idRegion;
    }

    public String getNombreRegion() {
        return nombreRegion;
    }

    public void setIdRegion(Integer idRegion) {
        this.idRegion = idRegion;
    }

    public void setNombreRegion(String nombreRegion) {
        this.nombreRegion = nombreRegion;
    }
}
