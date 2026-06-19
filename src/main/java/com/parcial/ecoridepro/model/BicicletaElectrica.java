package com.parcial.ecoridepro.model;

public class BicicletaElectrica extends Vehiculo {

    private boolean canasto;

    public BicicletaElectrica(String patente,
                              int bateria,
                              double tarifaBase,
                              boolean canasto) {

        super(patente, bateria, tarifaBase);
        this.canasto = canasto;
    }

    public boolean isCanasto() {
        return canasto;
    }

    public void setCanasto(boolean canasto) {
        this.canasto = canasto;
    }
}