package com.TurismoReal.ProyectoTurismo.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.File;

@Entity
@Table(name = "SERVICIOS")
public class Servicios {
    @Id
    @Column(name = "id_servicio")
    private Integer idServicio;
    @Column(name = "nom_servicio")
    private String nomServicio;
    @Column(name = "foto")
    private File foto;

    public Servicios(Integer idServicio, String nomServicio, File foto) {
        this.idServicio = idServicio;
        this.nomServicio = nomServicio;
        this.foto = foto;
    }

    public Integer getIdServicio() {
        return idServicio;
    }

    public String getNomServicio() {
        return nomServicio;
    }

    public File getFoto() {
        return foto;
    }

    public void setIdServicio(Integer idServicio) {
        this.idServicio = idServicio;
    }

    public void setNomServicio(String nomServicio) {
        this.nomServicio = nomServicio;
    }

    public void setFoto(File foto) {
        this.foto = foto;
    }


}
