package com.mapsa.oop.practice02.model;

public class Driver extends Employee{

    public Driver() {
    }

    public Driver(String nId, String name, Double salary, Double taxRate) {
        super(nId, name, salary, taxRate);
    }

    @Override
    public void sum() {
        System.out.println("Driveeeeer");
    }

    @Override
    public void run() {

    }

    @Override
    public void run2() {
        //rafter jadid
    }
}
