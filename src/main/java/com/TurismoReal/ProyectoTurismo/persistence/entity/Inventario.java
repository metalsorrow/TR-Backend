package com.TurismoReal.ProyectoTurismo.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "INVENTARIO")
public class Inventario {
    @Id
    @Column(name = "ID_OBJ")
    private Integer idObj;
    @Column(name = "NOMBRE_OBJ")
    private String nombreObj;
    @Column(name = "DESC_OBJ")
    private String descObj;

    public Inventario(Integer idObj, String nombreObj, String descObj) {
        this.idObj = idObj;
        this.nombreObj = nombreObj;
        this.descObj = descObj;
    }

    public Integer getIdObj() {
        return idObj;
    }

    public String getNombreObj() {
        return nombreObj;
    }

    public String getDescObj() {
        return descObj;
    }

    public void setIdObj(Integer idObj) {
        this.idObj = idObj;
    }

    public void setNombreObj(String nombreObj) {
        this.nombreObj = nombreObj;
    }

    public void setDescObj(String descObj) {
        this.descObj = descObj;
    }
}
