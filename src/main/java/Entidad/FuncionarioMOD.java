package Entidad;

import java.sql.Date;

public class FuncionarioMOD {
    private Integer id;
    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private Date fNacimiento;
    private String genero;
    private String celular;
    private String direccion;
    private String password;
    private ComunaMOD comuna;

    public FuncionarioMOD(Integer id, String nombre, String apPaterno, String apMaterno, Date fNacimiento, String genero, String celular, String direccion, String password, ComunaMOD comuna) {
        this.id = id;
        this.nombre = nombre;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.fNacimiento = fNacimiento;
        this.genero = genero;
        this.celular = celular;
        this.direccion = direccion;
        this.password = password;
        this.comuna = comuna;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public Date getfNacimiento() {
        return fNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public String getCelular() {
        return celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getPassword() {
        return password;
    }

    public ComunaMOD getComuna() {
        return comuna;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public void setfNacimiento(Date fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setComuna(ComunaMOD comuna) {
        this.comuna = comuna;
    }
}
