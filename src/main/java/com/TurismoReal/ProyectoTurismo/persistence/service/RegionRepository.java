package com.TurismoReal.ProyectoTurismo.persistence.service;

import com.TurismoReal.ProyectoTurismo.persistence.crud.RegionCrudRepository;
import com.TurismoReal.ProyectoTurismo.persistence.entity.Region;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RegionRepository {
    private RegionCrudRepository regionCrudRepository;

    public List<Region> getAll(){
        return (List<Region>) regionCrudRepository.findAll();
    }
}
