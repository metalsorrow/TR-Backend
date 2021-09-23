package com.TurismoReal.ProyectoTurismo.persistence.crud;

import com.TurismoReal.ProyectoTurismo.persistence.entity.Region;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionCrudRepository extends CrudRepository<Region, Integer> {

}
