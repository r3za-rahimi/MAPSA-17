package com.mapsa.session03.inheritance;

public class Animal {

    String name;
    int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound(){

        System.out.println("---***-*--*--*-***---");

    }

    public void run(){
        System.out.println(name + " is running ");
    }
}
