package com.TurismoReal.ProyectoTurismo.persistence.entity;

import javax.persistence.*;
import java.io.File;

public class Departamento {
    @SequenceGenerator(name="DEPARTAMENTO_ID_GENERATOR", sequenceName="DEPARTAMENTO_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "DEPARTAMENTO_ID_GENERATOR")
    @Id
    @Column(name = "ID_DEPTO")
    private Integer idDepto;
    @Column(name = "NOM_DEPTO")
    private String nomDepto;
    @Column(name = "DIRECCION_DEPTO")
    private String dirDepto;
    @Column(name = "CANT_HABITACIONES")
    private Integer cantHabitaciones;
    @Column(name = "CANT_ESTACIONAMIENTOS")
    private Integer cantEstacionamientos;
    @Column(name = "CANT_BANOS")
    private Integer cantBaños;
    @Column(name = "INTERNET")
    private boolean internet;
    @Column(name = "CABLE")
    private boolean cable;
    @Column(name = "CALEFACCION")
    private boolean calefaccion;
    @Column(name = "AMOBLADO")
    private boolean amoblado;
    @Column(name = "FOTO_DEPTO")
    private File fotoDepto;
    @Column(name = "PRECIO_DEPTO")
    private Integer precioDepto;
    @Column(name = "ESTADO_DEPTO")
    private char estadoDepto;
    @Column(name = "DESCRIPCION_DEPTO")
    private String descDepto;
    @Column(name = "COMUNA_ID_COMUNA")
    private Comuna comuna;

    public Departamento(Integer idDepto, String nomDepto, String dirDepto, Integer cantHabitaciones, Integer cantEstacionamientos,
                        Integer cantBaños, boolean internet, boolean cable, boolean calefaccion, boolean amoblado,
                        File fotoDepto, Integer precioDepto, char estadoDepto, String descDepto, Comuna comuna) {
        this.idDepto = idDepto;
        this.nomDepto = nomDepto;
        this.dirDepto = dirDepto;
        this.cantHabitaciones = cantHabitaciones;
        this.cantEstacionamientos = cantEstacionamientos;
        this.cantBaños = cantBaños;
        this.internet = internet;
        this.cable = cable;
        this.calefaccion = calefaccion;
        this.amoblado = amoblado;
        this.fotoDepto = fotoDepto;
        this.precioDepto = precioDepto;
        this.estadoDepto = estadoDepto;
        this.descDepto = descDepto;
        this.comuna = comuna;
    }

    public Integer getIdDepto() {
        return idDepto;
    }

    public String getNomDepto() {
        return nomDepto;
    }

    public String getDirDepto() {
        return dirDepto;
    }

    public Integer getCantHabitaciones() {
        return cantHabitaciones;
    }

    public Integer getCantEstacionamientos() {
        return cantEstacionamientos;
    }

    public Integer getCantBaños() {
        return cantBaños;
    }

    public boolean isInternet() {
        return internet;
    }

    public boolean isCable() {
        return cable;
    }

    public boolean isCalefaccion() {
        return calefaccion;
    }

    public boolean isAmoblado() {
        return amoblado;
    }

    public File getFotoDepto() {
        return fotoDepto;
    }

    public Integer getPrecioDepto() {
        return precioDepto;
    }

    public char getEstadoDepto() {
        return estadoDepto;
    }

    public String getDescDepto() {
        return descDepto;
    }

    public Comuna getComuna() {
        return comuna;
    }

    public void setIdDepto(Integer idDepto) {
        this.idDepto = idDepto;
    }

    public void setNomDepto(String nomDepto) {
        this.nomDepto = nomDepto;
    }

    public void setDirDepto(String dirDepto) {
        this.dirDepto = dirDepto;
    }

    public void setCantHabitaciones(Integer cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public void setCantEstacionamientos(Integer cantEstacionamientos) {
        this.cantEstacionamientos = cantEstacionamientos;
    }

    public void setCantBaños(Integer cantBaños) {
        this.cantBaños = cantBaños;
    }

    public void setInternet(boolean internet) {
        this.internet = internet;
    }

    public void setCable(boolean cable) {
        this.cable = cable;
    }

    public void setCalefaccion(boolean calefaccion) {
        this.calefaccion = calefaccion;
    }

    public void setAmoblado(boolean amoblado) {
        this.amoblado = amoblado;
    }

    public void setFotoDepto(File fotoDepto) {
        this.fotoDepto = fotoDepto;
    }

    public void setPrecioDepto(Integer precioDepto) {
        this.precioDepto = precioDepto;
    }

    public void setEstadoDepto(char estadoDepto) {
        this.estadoDepto = estadoDepto;
    }

    public void setDescDepto(String descDepto) {
        this.descDepto = descDepto;
    }

    public void setComuna(Comuna comuna) {
        this.comuna = comuna;
    }
}
