package com.TurismoReal.ProyectoTurismo.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "RESERVA")
public class Reserva {
    @Id
    @Column(name = "ID_RESERVA")
    private Integer idReserva;
    @Column(name = "CHECK_IN")
    private Date checkIn;
    @Column(name = "CHECK_OUT")
    private Date checkOut;
    @Column(name = "CANT_DIAS")
    private Integer cantDias;
    @Column(name = "CANT_ADULTOS")
    private Integer cantAdultos;
    @Column(name = "CANT_NINOS")
    private Integer cantNiños;
    @Column(name = "TOTAL_RESERVA")
    private Integer totalReserva;
    @Column(name = "ESTADO_RESERVA")
    private Character estadoReserva;
    @Column(name = "FUNCIONARIO_ID_FUNCIONARIO")
    private Funcionario idFuncionario;
    @Column(name = "DEPARTAMENTO_ID_DEPARTAMENTO")
    private Departamento idDepartamento;
    @Column(name = "USUARIO_ID_USUARIO")
    private Usuario idUsuario;

    public Reserva(Integer idReserva, Date checkIn, Date checkOut, Integer cantDias, Integer cantAdultos,
                   Integer cantNiños, Integer totalReserva, Character estadoReserva, Funcionario idFuncionario,
                   Departamento idDepartamento, Usuario idUsuario) {
        this.idReserva = idReserva;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.cantDias = cantDias;
        this.cantAdultos = cantAdultos;
        this.cantNiños = cantNiños;
        this.totalReserva = totalReserva;
        this.estadoReserva = estadoReserva;
        this.idFuncionario = idFuncionario;
        this.idDepartamento = idDepartamento;
        this.idUsuario = idUsuario;
    }

    public Integer getIdReserva() {
        return idReserva;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public Integer getCantDias() {
        return cantDias;
    }

    public Integer getCantAdultos() {
        return cantAdultos;
    }

    public Integer getCantNiños() {
        return cantNiños;
    }

    public Integer getTotalReserva() {
        return totalReserva;
    }

    public Character getEstadoReserva() {
        return estadoReserva;
    }

    public Funcionario getIdFuncionario() {
        return idFuncionario;
    }

    public Departamento getIdDepartamento() {
        return idDepartamento;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdReserva(Integer idReserva) {
        this.idReserva = idReserva;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    public void setCantDias(Integer cantDias) {
        this.cantDias = cantDias;
    }

    public void setCantAdultos(Integer cantAdultos) {
        this.cantAdultos = cantAdultos;
    }

    public void setCantNiños(Integer cantNiños) {
        this.cantNiños = cantNiños;
    }

    public void setTotalReserva(Integer totalReserva) {
        this.totalReserva = totalReserva;
    }

    public void setEstadoReserva(Character estadoReserva) {
        this.estadoReserva = estadoReserva;
    }

    public void setIdFuncionario(Funcionario idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public void setIdDepartamento(Departamento idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }
}
