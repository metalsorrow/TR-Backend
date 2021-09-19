package Datos;

import Entidad.DepartamentoMOD;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DepartamentoDTO extends JpaRepository<DepartamentoMOD,Long> {
    @Query("select e from departamentes")
    public List<DepartamentoMOD>Listardepartamentos(@Param("ID_DEPTO") Integer id);

}
