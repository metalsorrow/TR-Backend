package com.TurismoReal.ProyectoTurismo.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "INVITADO")
public class Invitado {
    @Id
    @Column(name = "ID_INV")
    private Integer idInv;
    @Column(name = "NOM_INV")
    private String nomInv;
    @Column(name = "APP_INV")
    private String appInv;
    @Column(name = "EDAD_INV")
    private Integer edadInv;
    @Column(name = "EMAIL_INV")
    private String emailInv;
    @Column(name = "CELULAR_INV")
    private Integer celularInv;

    public Invitado(Integer idInv, String nomInv, String appInv, Integer edadInv, String emailInv, Integer celularInv) {
        this.idInv = idInv;
        this.nomInv = nomInv;
        this.appInv = appInv;
        this.edadInv = edadInv;
        this.emailInv = emailInv;
        this.celularInv = celularInv;
    }

    public Integer getIdInv() {
        return idInv;
    }

    public String getNomInv() {
        return nomInv;
    }

    public String getAppInv() {
        return appInv;
    }

    public Integer getEdadInv() {
        return edadInv;
    }

    public String getEmailInv() {
        return emailInv;
    }

    public Integer getCelularInv() {
        return celularInv;
    }

    public void setIdInv(Integer idInv) {
        this.idInv = idInv;
    }

    public void setNomInv(String nomInv) {
        this.nomInv = nomInv;
    }

    public void setAppInv(String appInv) {
        this.appInv = appInv;
    }

    public void setEdadInv(Integer edadInv) {
        this.edadInv = edadInv;
    }

    public void setEmailInv(String emailInv) {
        this.emailInv = emailInv;
    }

    public void setCelularInv(Integer celularInv) {
        this.celularInv = celularInv;
    }
}
