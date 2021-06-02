package com.ucreativa.familia;

public class Kike extends Guiss {

    private String saludo;

    public Kike(String saludo, int age, String hobby) {
        super(saludo, age, hobby);
        this.saludo = saludo;
    }

    public String getSaludo() {
        return this.saludo;
    }
}
