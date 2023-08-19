package com.mapsa.session03.inheritance;

public class Cat extends Animal{

    String tailColor;

    public Cat(String tailColor) {
        this.tailColor = tailColor;
    }

    public Cat(String name, int age, String tailColor) {
        super(name, age);
        this.tailColor = tailColor;
    }

    @Override
    public void makeSound() {
        System.out.println(" meow  meow ");
    }
}
