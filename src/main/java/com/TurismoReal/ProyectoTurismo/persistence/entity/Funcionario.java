package com.TurismoReal.ProyectoTurismo.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "FUNCIONARIO")
public class Funcionario {
    @Id
    @Column(name = "ID_FUNC")
    private Integer idFunc;
    @Column(name = "NOM_FUNC")
    private String nomFunc;
    @Column(name = "APP_FUNC")
    private String appFunc;
    @Column(name = "APM_FUNC")
    private String apmFunc;
    @Column(name = "FNACIMIENTO_FUNC")
    private Date fnacimientoFunc;
    @Column(name = "GENERO_FUNC")
    private String generoFunc;
    @Column(name = "DIRECCION_FUNC")
    private String dirFunc;
    @Column(name = "CELULAR_FUNC")
    private Integer celFunc;
    @Column(name = "TELEFONO_FUNC")
    private Integer telefonoFunc;
    @Column(name = "CONTRASEÑA_FUNC")
    private String contraseñaFunc;
    @Column(name = "COMUNA_ID_COMUNA")
    private Comuna idComuna;

    public Funcionario(Integer idFunc, String nomFunc, String appFunc, String apmFunc, Date fnacimientoFunc,
                       String generoFunc, String dirFunc, Integer celFunc, Integer telefonoFunc, String contraseñaFunc,
                       Comuna idComuna) {
        this.idFunc = idFunc;
        this.nomFunc = nomFunc;
        this.appFunc = appFunc;
        this.apmFunc = apmFunc;
        this.fnacimientoFunc = fnacimientoFunc;
        this.generoFunc = generoFunc;
        this.dirFunc = dirFunc;
        this.celFunc = celFunc;
        this.telefonoFunc = telefonoFunc;
        this.contraseñaFunc = contraseñaFunc;
        this.idComuna = idComuna;
    }

    public Integer getIdFunc() {
        return idFunc;
    }

    public String getNomFunc() {
        return nomFunc;
    }

    public String getAppFunc() {
        return appFunc;
    }

    public String getApmFunc() {
        return apmFunc;
    }

    public Date getFnacimientoFunc() {
        return fnacimientoFunc;
    }

    public String getGeneroFunc() {
        return generoFunc;
    }

    public String getDirFunc() {
        return dirFunc;
    }

    public Integer getCelFunc() {
        return celFunc;
    }

    public Integer getTelefonoFunc() {
        return telefonoFunc;
    }

    public String getContraseñaFunc() {
        return contraseñaFunc;
    }

    public Comuna getIdComuna() {
        return idComuna;
    }

    public void setIdFunc(Integer idFunc) {
        this.idFunc = idFunc;
    }

    public void setNomFunc(String nomFunc) {
        this.nomFunc = nomFunc;
    }

    public void setAppFunc(String appFunc) {
        this.appFunc = appFunc;
    }

    public void setApmFunc(String apmFunc) {
        this.apmFunc = apmFunc;
    }

    public void setFnacimientoFunc(Date fnacimientoFunc) {
        this.fnacimientoFunc = fnacimientoFunc;
    }

    public void setGeneroFunc(String generoFunc) {
        this.generoFunc = generoFunc;
    }

    public void setDirFunc(String dirFunc) {
        this.dirFunc = dirFunc;
    }

    public void setCelFunc(Integer celFunc) {
        this.celFunc = celFunc;
    }

    public void setTelefonoFunc(Integer telefonoFunc) {
        this.telefonoFunc = telefonoFunc;
    }

    public void setContraseñaFunc(String contraseñaFunc) {
        this.contraseñaFunc = contraseñaFunc;
    }

    public void setIdComuna(Comuna idComuna) {
        this.idComuna = idComuna;
    }
}
