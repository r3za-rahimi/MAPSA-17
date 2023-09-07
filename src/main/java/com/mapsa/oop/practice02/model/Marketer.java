package com.mapsa.oop.practice02.model;

public class Marketer extends Employee{
    public Marketer() {
    }

    public Marketer(String nId, String name, Double salary, Double taxRate) {
        super(nId, name, salary, taxRate);
    }

    @Override
    public void sum() {
        System.out.println("Marketerrrr");
    }

    @Override
    public void run() {

    }
}
