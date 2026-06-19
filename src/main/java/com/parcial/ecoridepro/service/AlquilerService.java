package com.parcial.ecoridepro.service;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.parcial.ecoridepro.model.Vehiculo;

@Service
public class AlquilerService {

    private HashMap<String, Vehiculo> vehiculos =
            new HashMap<>();

    public Vehiculo buscarVehiculo(String patente) {

        return vehiculos.get(patente);
    }
}