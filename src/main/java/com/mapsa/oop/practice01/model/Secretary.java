package com.mapsa.oop.practice01.model;

public class Secretary extends Employee{

    public Secretary() {
    }

    public Secretary(Long national_Id, String name, Long salary, Integer taxRate) {
        super(national_Id, name, salary, taxRate);
    }
}
