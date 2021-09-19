package Entidad;

import java.sql.Date;

public class ReservaMOD {
    private Integer id;
    private Date check_in;
    private Date check_out;
    private Integer cant_dias;
    private Integer cant_adultos;
    private Integer cant_niños;
    private Integer total;
    private Character estado;
    private FuncionarioMOD funcionario;
    private DepartamentoMOD departamento;
    private UsuarioMOD usuario;

    public ReservaMOD(Integer id, Date check_in, Date check_out, Integer cant_dias, Integer cant_adultos, Integer cant_niños, Integer total, Character estado, FuncionarioMOD funcionario, DepartamentoMOD departamento, UsuarioMOD usuario) {
        this.id = id;
        this.check_in = check_in;
        this.check_out = check_out;
        this.cant_dias = cant_dias;
        this.cant_adultos = cant_adultos;
        this.cant_niños = cant_niños;
        this.total = total;
        this.estado = estado;
        this.funcionario = funcionario;
        this.departamento = departamento;
        this.usuario = usuario;
    }

    public Integer getId() {
        return id;
    }

    public Date getCheck_in() {
        return check_in;
    }

    public Date getCheck_out() {
        return check_out;
    }

    public Integer getCant_dias() {
        return cant_dias;
    }

    public Integer getCant_adultos() {
        return cant_adultos;
    }

    public Integer getCant_niños() {
        return cant_niños;
    }

    public Integer getTotal() {
        return total;
    }

    public Character getEstado() {
        return estado;
    }

    public FuncionarioMOD getFuncionario() {
        return funcionario;
    }

    public DepartamentoMOD getDepartamento() {
        return departamento;
    }

    public UsuarioMOD getUsuario() {
        return usuario;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCheck_in(Date check_in) {
        this.check_in = check_in;
    }

    public void setCheck_out(Date check_out) {
        this.check_out = check_out;
    }

    public void setCant_dias(Integer cant_dias) {
        this.cant_dias = cant_dias;
    }

    public void setCant_adultos(Integer cant_adultos) {
        this.cant_adultos = cant_adultos;
    }

    public void setCant_niños(Integer cant_niños) {
        this.cant_niños = cant_niños;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public void setEstado(Character estado) {
        this.estado = estado;
    }

    public void setFuncionario(FuncionarioMOD funcionario) {
        this.funcionario = funcionario;
    }

    public void setDepartamento(DepartamentoMOD departamento) {
        this.departamento = departamento;
    }

    public void setUsuario(UsuarioMOD usuario) {
        this.usuario = usuario;
    }
}
