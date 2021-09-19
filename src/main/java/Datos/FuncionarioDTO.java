package Datos;

import Entidad.FuncionarioMOD;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FuncionarioDTO extends JpaRepository<FuncionarioMOD,Integer> {
    @Query("select e from funcionarios")
    public List<FuncionarioMOD> a (@Param("ID_FUNC") Integer id);
}
