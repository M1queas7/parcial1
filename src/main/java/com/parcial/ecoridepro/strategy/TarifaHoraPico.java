package com.parcial.ecoridepro.strategy;

public class TarifaHoraPico implements TarifaStrategy {

    @Override
    public double calcular(int minutos, double tarifaBase) {
        return (minutos * tarifaBase) * 1.4;
    }
}