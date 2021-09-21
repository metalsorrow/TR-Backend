package com.TurismoReal.ProyectoTurismo.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "ADMINISTRADOR")
public class Administrador {
    @Id
    @Column(name = "ID_ADM")
    private Integer idAdm;
    @Column(name = "NOM_ADM")
    private String nomAdm;
    @Column(name = "APP_ADM")
    private String appAdm;
    @Column(name = "APM_ADM")
    private String apmAdm;
    @Column(name = "FNACIMIENTO_ADM")
    private Date fnacimientoAdm;
    @Column(name = "EMAIL_ADM")
    private String emailAdm;
    @Column(name = "CELULAR_ADM")
    private Integer celAdm;
    @Column(name = "TELEFONO_ADM")
    private Integer telefonoAdm;
    @Column(name = "CONTRASEÑA_USU")
    private String contraseñaFunc;

    public Administrador(Integer idAdm, String nomAdm, String appAdm, String apmAdm, Date fnacimientoAdm,
                         String emailAdm, Integer celAdm, Integer telefonoAdm, String contraseñaFunc) {
        this.idAdm = idAdm;
        this.nomAdm = nomAdm;
        this.appAdm = appAdm;
        this.apmAdm = apmAdm;
        this.fnacimientoAdm = fnacimientoAdm;
        this.emailAdm = emailAdm;
        this.celAdm = celAdm;
        this.telefonoAdm = telefonoAdm;
        this.contraseñaFunc = contraseñaFunc;
    }

    public Integer getIdAdm() {
        return idAdm;
    }

    public void setIdAdm(Integer idAdm) {
        this.idAdm = idAdm;
    }

    public String getNomAdm() {
        return nomAdm;
    }

    public void setNomAdm(String nomAdm) {
        this.nomAdm = nomAdm;
    }

    public String getAppAdm() {
        return appAdm;
    }

    public void setAppAdm(String appAdm) {
        this.appAdm = appAdm;
    }

    public String getApmAdm() {
        return apmAdm;
    }

    public void setApmAdm(String apmAdm) {
        this.apmAdm = apmAdm;
    }

    public Date getFnacimientoAdm() {
        return fnacimientoAdm;
    }

    public void setFnacimientoAdm(Date fnacimientoAdm) {
        this.fnacimientoAdm = fnacimientoAdm;
    }

    public String getEmailAdm() {
        return emailAdm;
    }

    public void setEmailAdm(String emailAdm) {
        this.emailAdm = emailAdm;
    }

    public Integer getCelAdm() {
        return celAdm;
    }

    public void setCelAdm(Integer celAdm) {
        this.celAdm = celAdm;
    }

    public Integer getTelefonoAdm() {
        return telefonoAdm;
    }

    public void setTelefonoAdm(Integer telefonoAdm) {
        this.telefonoAdm = telefonoAdm;
    }

    public String getContraseñaFunc() {
        return contraseñaFunc;
    }

    public void setContraseñaFunc(String contraseñaFunc) {
        this.contraseñaFunc = contraseñaFunc;
    }
}
