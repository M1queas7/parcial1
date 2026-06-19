package com.parcial.ecoridepro.comparator;

import java.util.Comparator;
import com.parcial.ecoridepro.model.Vehiculo;

public class ComparadorTarifa implements Comparator<Vehiculo> {

    @Override
    public int compare(Vehiculo v1, Vehiculo v2) {

        return Double.compare(
                v2.getTarifaBase(),
                v1.getTarifaBase());
    }
}