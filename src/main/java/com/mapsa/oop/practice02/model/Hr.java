package com.mapsa.oop.practice02.model;

public class Hr extends Employee{

    public Hr() {
    }

    public Hr(String nId, String name, Double salary, Double taxRate) {
        super(nId, name, salary, taxRate);
    }

    @Override
    public void sum() {
        System.out.println("hrrrrrrrrrr");
    }

    @Override
    public void run() {

    }
}
