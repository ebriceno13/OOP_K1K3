package com.ucreativa;

import com.ucreativa.familia.Guiss;
import com.ucreativa.familia.Kike;

public class Main {

    public static void main(String[] args) {

        Kike yo = new Kike("Tuanis",
                26,
                "Ciclismo");
        Guiss mama = new Guiss("Diay Pa",
                69,
                "Jardineria");

        mama.setAge();

        int edad = mama.getAge();

        System.out.println("La edad de mi mama Guiss es: " + edad);


    }

}