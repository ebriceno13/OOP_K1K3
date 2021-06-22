package com.ucreativa.vacunacion.services;

public class ContadorRiesgo {

    private int cantidadRiesgo;
    private static ContadorRiesgo instancia;

    public static ContadorRiesgo getInstance() {

        if(instancia == null) {
            instancia = new ContadorRiesgo();
        }
        return instancia;


    }

    public void SumarRiesgo() {
        this.cantidadRiesgo++;//suma los riesgos de las personas anhadidas
    }

    public int getCantidadRiesgo() {
        return this.cantidadRiesgo;
    }
}
