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

    @Column(name = "NOMBRE_MULTA")
    private String nombreMulta;
    @Column(name = "DESCRIPCION_MULTA")
    private String descripcionMulta;
    @Column(name = "VALOR_MULTA")
    private Integer valorMulta;
    @Column(name = "SUBTOTAL_MULTA")
    private Integer subtotalMulta;

    public Acta() {
    }

    public Acta(Integer idActa, String nombreMulta, String descripcionMulta, Integer valorMulta, Integer subtotalMulta) {
        this.idActa = idActa;
        this.nombreMulta = nombreMulta;
        this.descripcionMulta = descripcionMulta;
        this.valorMulta = valorMulta;
        this.subtotalMulta = subtotalMulta;
    }

    public Integer getIdActa() {
        return idActa;
    }

    public void setIdActa(Integer idActa) {
        this.idActa = idActa;
    }

    public String getNombreMulta() {
        return nombreMulta;
    }

    public void setNombreMulta(String nombreMulta) {
        this.nombreMulta = nombreMulta;
    }

    public String getDescripcionMulta() {
        return descripcionMulta;
    }

    public void setDescripcionMulta(String descripcionMulta) {
        this.descripcionMulta = descripcionMulta;
    }

    public Integer getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(Integer valorMulta) {
        this.valorMulta = valorMulta;
    }

    public Integer getSubtotalMulta() {
        return subtotalMulta;
    }

    public void setSubtotalMulta(Integer subtotalMulta) {
        this.subtotalMulta = subtotalMulta;
    }
}
