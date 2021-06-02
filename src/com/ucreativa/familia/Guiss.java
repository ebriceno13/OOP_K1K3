package com.ucreativa.familia;

public class Guiss {

    private int age;
    private String hobby;

    public Guiss(String saludo, int age,
                 String hobby) {
        this.age = 69;
        this.hobby = hobby;
        System.out.println(saludo);
    }


    public void setAge() {
        this.age = this.age + 1;
    }

    public int getAge() {
        return this.age;
    }
}
