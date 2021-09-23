package com.TurismoReal.ProyectoTurismo.persistence.crud;

import com.TurismoReal.ProyectoTurismo.persistence.entity.Acta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActaCrudRepository extends CrudRepository<Acta,Integer> {

}
