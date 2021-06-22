package com.ucreativa.vacunacion.services;

import com.ucreativa.vacunacion.entities.Amigo;
import com.ucreativa.vacunacion.entities.Familiar;
import com.ucreativa.vacunacion.entities.Persona;
import com.ucreativa.vacunacion.repositories.Repository;
import com.ucreativa.vacunacion.ui.ErrorEnEdadException;

import java.io.IOException;
import java.util.Date;
import java.util.List;

public class BitacoraService {

    private Repository repository;
    private ContadorRiesgo contador;

    public BitacoraService(Repository repository){
        this.repository = repository;
        this.contador = ContadorRiesgo.getInstance();
    }

    public void save(String nombre, String cedula, String txtEdad,
                     boolean riesgo, boolean isAmigo, String relacion,
                     String facebook, String parenteso,
                     String marca) throws ErrorEnEdadException {

        int edad;
        try {
            edad = Integer.parseInt(txtEdad);
        } catch (NumberFormatException x){
            throw new ErrorEnEdadException(txtEdad);
        }

        if(riesgo){
            this.contador.SumarRiesgo();
        }

        Persona persona;
        if (isAmigo){
            persona = new Amigo(nombre, cedula, edad,
                    riesgo, relacion, facebook);
        } else {
            persona = new Familiar(nombre, cedula, edad,
                    riesgo, parenteso);
        }
        try {
            this.repository.save(persona, marca, new Date());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> get(){
        System.out.println("La cantidad de Personas con Riesgo es: " + this.contador.getCantidadRiesgo());
        return this.repository.get();
    }
}
