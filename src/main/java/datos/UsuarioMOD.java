package datos;

import org.springframework.stereotype.Repository;

import java.sql.Date;

@Repository

public class UsuarioMOD {

    private int id;
    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private Date fechaNacimiento;
    private String email;
    private String celular;
    private ComunaMOD comuna;
}
