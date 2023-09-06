package com.mapsa.oop.practice01.model;

public class Manager extends Employee{

    public Manager() {
    }

    public Manager(Long national_Id, String name, Long salary, Integer taxRate) {
        super(national_Id, name, salary, taxRate);
    }
}
