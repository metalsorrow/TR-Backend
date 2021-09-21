package com.TurismoReal.ProyectoTurismo.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TRANSPORTE")
public class Transporte {
    @Id
    @Column(name = "ID_TRANS")
    private Integer idTrans;
    @Column(name = "LUGAR_TRANS")
    private String lugarTrans;
    @Column(name = "HORARIO_TRANS")
    private String horarioTrans;
    @Column(name = "VEHICULO_TRANS")
    private String vehiculoTrans;
    @Column(name = "FUNCIONARIO_ID_FUNC")
    private Funcionario idFuncionario;
    @Column(name = "RESERVA_ID_RESERVA")
    private Reserva idReserva;

    public Transporte(Integer idTrans, String lugarTrans, String horarioTrans, String vehiculoTrans,
                      Funcionario idFuncionario, Reserva idReserva) {
        this.idTrans = idTrans;
        this.lugarTrans = lugarTrans;
        this.horarioTrans = horarioTrans;
        this.vehiculoTrans = vehiculoTrans;
        this.idFuncionario = idFuncionario;
        this.idReserva = idReserva;
    }

    public Integer getIdTrans() {
        return idTrans;
    }

    public String getLugarTrans() {
        return lugarTrans;
    }

    public String getHorarioTrans() {
        return horarioTrans;
    }

    public String getVehiculoTrans() {
        return vehiculoTrans;
    }

    public Funcionario getIdFuncionario() {
        return idFuncionario;
    }

    public Reserva getIdReserva() {
        return idReserva;
    }

    public void setIdTrans(Integer idTrans) {
        this.idTrans = idTrans;
    }

    public void setLugarTrans(String lugarTrans) {
        this.lugarTrans = lugarTrans;
    }

    public void setHorarioTrans(String horarioTrans) {
        this.horarioTrans = horarioTrans;
    }

    public void setVehiculoTrans(String vehiculoTrans) {
        this.vehiculoTrans = vehiculoTrans;
    }

    public void setIdFuncionario(Funcionario idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public void setIdReserva(Reserva idReserva) {
        this.idReserva = idReserva;
    }
}
