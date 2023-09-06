package com.mapsa.oop.practice01.model;

public class Driver extends Employee{
    public Driver() {
    }

    public Driver(Long national_Id, String name, Long salary, Integer taxRate) {
        super(national_Id, name, salary, taxRate);
    }
}
