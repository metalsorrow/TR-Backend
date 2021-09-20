package com.TurismoReal.ProyectoTurismo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")
public class Dummy {
    public String saludar() {
        return "No pares de aprender";
    }
}

