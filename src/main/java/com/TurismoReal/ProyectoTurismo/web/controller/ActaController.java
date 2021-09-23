package com.TurismoReal.ProyectoTurismo.web.controller;

import com.TurismoReal.ProyectoTurismo.persistence.crud.ActaCrudRepository;
import com.TurismoReal.ProyectoTurismo.persistence.entity.Acta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/acta")
public class ActaController {
    @Autowired
    private ActaCrudRepository actaCrudRepository;

    @GetMapping("/all")
    public Iterable<Acta> getAl(){ return actaCrudRepository.findAll() ;}

    @RequestMapping("/new")
    public ResponseEntity<Acta> newActa(@RequestBody Acta acta){
        ResponseEntity<Acta> responseEntityActa = new ResponseEntity<Acta>(actaCrudRepository.save(acta), HttpStatus.ACCEPTED);
        return responseEntityActa;
    }
}
