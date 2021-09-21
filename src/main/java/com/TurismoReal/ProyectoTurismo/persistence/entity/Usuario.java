package com.TurismoReal.ProyectoTurismo.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "USUARIO")
public class Usuario {
    @Id
    @Column(name = "ID_USU")
    private Integer idUsu;
    @Column(name = "NOM_USU")
    private String nomUsu;
    @Column(name = "APP_USU")
    private String appUsu;
    @Column(name = "APM_USU")
    private String apmUsu;
    @Column(name = "FNACIMIENTO_USU")
    private Date fnacimientoUsu;
    @Column(name = "EMAIL_USU")
    private String emailUsu;
    @Column(name = "CELULAR_FUNC")
    private Integer celUsu;
    @Column(name = "CONTRASEÑA_USU")
    private String contraseñaUsu;
    @Column(name = "COMUNA_ID_COMUNA")
    private Comuna idComuna;

    public Usuario(Integer idUsu, String nomUsu, String appUsu, String apmUsu, Date fnacimientoUsu, String emailUsu,
                   Integer celUsu, String contraseñaUsu, Comuna idComuna) {
        this.idUsu = idUsu;
        this.nomUsu = nomUsu;
        this.appUsu = appUsu;
        this.apmUsu = apmUsu;
        this.fnacimientoUsu = fnacimientoUsu;
        this.emailUsu = emailUsu;
        this.celUsu = celUsu;
        this.contraseñaUsu = contraseñaUsu;
        this.idComuna = idComuna;
    }

    public Integer getIdUsu() {
        return idUsu;
    }

    public void setIdUsu(Integer idUsu) {
        this.idUsu = idUsu;
    }

    public String getNomUsu() {
        return nomUsu;
    }

    public void setNomUsu(String nomUsu) {
        this.nomUsu = nomUsu;
    }

    public String getAppUsu() {
        return appUsu;
    }

    public void setAppUsu(String appUsu) {
        this.appUsu = appUsu;
    }

    public String getApmUsu() {
        return apmUsu;
    }

    public void setApmUsu(String apmUsu) {
        this.apmUsu = apmUsu;
    }

    public Date getFnacimientoUsu() {
        return fnacimientoUsu;
    }

    public void setFnacimientoUsu(Date fnacimientoUsu) {
        this.fnacimientoUsu = fnacimientoUsu;
    }

    public String getEmailUsu() {
        return emailUsu;
    }

    public void setEmailUsu(String emailUsu) {
        this.emailUsu = emailUsu;
    }

    public Integer getCelUsu() {
        return celUsu;
    }

    public void setCelUsu(Integer celUsu) {
        this.celUsu = celUsu;
    }

    public String getContraseñaUsu() {
        return contraseñaUsu;
    }

    public void setContraseñaUsu(String contraseñaUsu) {
        this.contraseñaUsu = contraseñaUsu;
    }

    public Comuna getIdComuna() {
        return idComuna;
    }

    public void setIdComuna(Comuna idComuna) {
        this.idComuna = idComuna;
    }
}
