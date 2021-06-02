package com.ucreativa;

import com.ucreativa.vacunacion.Amigo;
import com.ucreativa.vacunacion.BitacoraVacunas;
import com.ucreativa.vacunacion.Familiar;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Familiar mama = new Familiar("Guiss", "123", 69,
                true, "Mama");

        Familiar hermano = new Familiar("Chiny", "456", 39,
                false, "Hermano");

        Amigo roommate = new Amigo("Tony", "789", 33,
                false, "Roommate", "No se");

        List<BitacoraVacunas> bitacora = new ArrayList<>();
        bitacora.add(new BitacoraVacunas(mama, "Pfizer",
                new Date()));
        bitacora.add(new BitacoraVacunas(hermano, "AstraZeneca",
                new Date()));
        bitacora.add(new BitacoraVacunas(roommate, "Johnson",
                new Date()));


    }
}