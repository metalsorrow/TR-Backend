package com.TurismoReal.ProyectoTurismo.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SERVICIO_EXTRA")
public class ServicioExtra {
    @Id
    @Column(name = "ID_SERV")
    private Integer idServ;
    @Column(name = "DESC_SERV")
    private String descServ;
    @Column(name = "VALOR_SERV")
    private Integer valorServ;

    public ServicioExtra(Integer idServ, String descServ, Integer valorServ) {
        this.idServ = idServ;
        this.descServ = descServ;
        this.valorServ = valorServ;
    }

    public Integer getIdServ() {
        return idServ;
    }

    public String getDescServ() {
        return descServ;
    }

    public Integer getValorServ() {
        return valorServ;
    }

    public void setIdServ(Integer idServ) {
        this.idServ = idServ;
    }

    public void setDescServ(String descServ) {
        this.descServ = descServ;
    }

    public void setValorServ(Integer valorServ) {
        this.valorServ = valorServ;
    }
}
