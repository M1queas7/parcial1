package com.parcial.ecoridepro.strategy;

public class TarifaClima implements TarifaStrategy {

    @Override
    public double calcular(int minutos, double tarifaBase) {
        return (minutos * tarifaBase) + 150;
    }
}
