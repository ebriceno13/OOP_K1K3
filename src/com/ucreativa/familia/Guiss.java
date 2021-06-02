package com.ucreativa.familia;

public class Guiss {

    private int age;
    private String hobby;

    public Guiss(String saludo) {
        this.age = 69;
        this.hobby = "Jardineria";
        System.out.println(saludo);
    }

    public String getHobby() {
        return hobby;
    }

    public void setAge() {
        this.age = this.age + 1;
    }

    public int getAge() {
        return this.age;
    }
}
