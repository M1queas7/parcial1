package com.parcial.ecoridepro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/alquileres")
public class AlquilerController {

    @GetMapping("/hola")
    public String hola() {

        return "EcoRide Pro funcionando";
    }

}