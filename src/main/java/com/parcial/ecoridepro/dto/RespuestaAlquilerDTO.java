package com.parcial.ecoridepro.dto;

public class RespuestaAlquilerDTO {

    private String patente;
    private double costoFinal;
    private int minutos;
    private String estado;

    public RespuestaAlquilerDTO() {
    }

    public RespuestaAlquilerDTO(String patente,
                                double costoFinal,
                                int minutos,
                                String estado) {

        this.patente = patente;
        this.costoFinal = costoFinal;
        this.minutos = minutos;
        this.estado = estado;
    }

    public String getPatente() {
        return patente;
    }

    public double getCostoFinal() {
        return costoFinal;
    }

    public int getMinutos() {
        return minutos;
    }

    public String getEstado() {
        return estado;
    }
}