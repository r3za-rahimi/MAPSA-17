package com.mapsa.oop.practice02.model;

public class Manger extends Employee{

    public Manger() {
    }

    public Manger(String nId, String name, Double salary, Double taxRate) {
        super(nId, name, salary, taxRate);
    }

    public void sum(){

        System.out.println("mangerrrrrrrrr");
    }

    @Override
    public void run() {

    }
}
