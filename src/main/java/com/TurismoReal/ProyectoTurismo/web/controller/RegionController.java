package com.TurismoReal.ProyectoTurismo.web.controller;

import com.TurismoReal.ProyectoTurismo.persistence.crud.RegionCrudRepository;
import com.TurismoReal.ProyectoTurismo.persistence.entity.Region;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/region")
public class RegionController {
    @Autowired
    private RegionCrudRepository regionRepository;

    @GetMapping("/all")
    public List<Region> getAll() {
        return (List<Region>) regionRepository.findAll();
    }


    @PostMapping("/new")
    public ResponseEntity<Region> newRegion(@RequestBody Region region) {
        ResponseEntity<Region> responseEntityRegion =
                new ResponseEntity<Region>(regionRepository.save(region), HttpStatus.ACCEPTED);
        return  responseEntityRegion;
    }

}
