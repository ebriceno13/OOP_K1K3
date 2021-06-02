package com.ucreativa;

import com.ucreativa.familia.Guiss;

public class Main {

    public static void main(String[] args) {

        Guiss mama = new Guiss("Diay Pa");

        mama.setAge();

        int edad = mama.getAge();

        System.out.println("La edad de mi mama Guiss es: " + edad);
        System.out.println("El hobby de mi mama es: " + mama.getHobby());
    }
}
