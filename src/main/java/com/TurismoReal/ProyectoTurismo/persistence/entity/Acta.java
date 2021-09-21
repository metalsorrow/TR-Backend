package com.TurismoReal.ProyectoTurismo.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ACTA")
public class Acta {
    @Id
    @Column(name = "ID_ACTA")
    private Integer idActa;
    @Column(name = "NOMBRE_ACTA")
    private String nomActa;
    @Column(name = "DESCRIPCION_MULTA")
    private String descMulta;
    @Column(name = "SUBTOTAL_MULTA")
    private Integer subtotalMulta;

    public Acta(Integer idActa, String nomActa, String descMulta, Integer subtotalMulta) {
        this.idActa = idActa;
        this.nomActa = nomActa;
        this.descMulta = descMulta;
        this.subtotalMulta = subtotalMulta;
    }

    public Integer getIdActa() {
        return idActa;
    }

    public String getNomActa() {
        return nomActa;
    }

    public String getDescMulta() {
        return descMulta;
    }

    public Integer getSubtotalMulta() {
        return subtotalMulta;
    }

    public void setIdActa(Integer idActa) {
        this.idActa = idActa;
    }

    public void setNomActa(String nomActa) {
        this.nomActa = nomActa;
    }

    public void setDescMulta(String descMulta) {
        this.descMulta = descMulta;
    }

    public void setSubtotalMulta(Integer subtotalMulta) {
        this.subtotalMulta = subtotalMulta;
    }
}
