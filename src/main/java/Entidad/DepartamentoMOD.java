package Entidad;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.File;

@Entity
public class DepartamentoMOD {
    @Id
    private Integer id_depto;
    private String nom_depto;
    private String dir_depto;
    private Integer cant_habitaciones;
    private Integer cant_estacionamientos;
    private Integer cant_baños;
    private boolean internet;
    private boolean cable;
    private boolean calefaccion;
    private boolean amoblado;
    private File foto_depto;
    private Integer precio_depto;
    private char estado_depto;
    private String desc_depto;
    private ComunaMOD comuna;


    public DepartamentoMOD(Integer id_depto, String nom_depto, String dir_depto, Integer cant_habitaciones, Integer cant_estacionamientos, Integer cant_baños, boolean internet, boolean cable, boolean calefaccion, boolean amoblado, File foto_depto, Integer precio_depto, char estado_depto, String desc_depto, ComunaMOD comuna) {
        this.id_depto = id_depto;
        this.nom_depto = nom_depto;
        this.dir_depto = dir_depto;
        this.cant_habitaciones = cant_habitaciones;
        this.cant_estacionamientos = cant_estacionamientos;
        this.cant_baños = cant_baños;
        this.internet = internet;
        this.cable = cable;
        this.calefaccion = calefaccion;
        this.amoblado = amoblado;
        this.foto_depto = foto_depto;
        this.precio_depto = precio_depto;
        this.estado_depto = estado_depto;
        this.desc_depto = desc_depto;
        this.comuna = comuna;
    }

    public Integer getId_depto() {
        return id_depto;
    }

    public String getNom_depto() {
        return nom_depto;
    }

    public String getDir_depto() {
        return dir_depto;
    }

    public Integer getCant_habitaciones() {
        return cant_habitaciones;
    }

    public Integer getCant_estacionamientos() {
        return cant_estacionamientos;
    }

    public Integer getCant_baños() {
        return cant_baños;
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

    public File getFoto_depto() {
        return foto_depto;
    }

    public Integer getPrecio_depto() {
        return precio_depto;
    }

    public char getEstado_depto() {
        return estado_depto;
    }

    public String getDesc_depto() {
        return desc_depto;
    }

    public ComunaMOD getComuna() {
        return comuna;
    }
}
