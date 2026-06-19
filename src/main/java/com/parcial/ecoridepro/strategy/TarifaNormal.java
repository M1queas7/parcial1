package com.parcial.ecoridepro.strategy;

public class TarifaNormal implements TarifaStrategy {

    @Override
    public double calcular(int minutos, double tarifaBase) {
        return minutos * tarifaBase;
    }
}