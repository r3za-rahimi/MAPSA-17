package com.mapsa.oop.practice01.service.ServicePlus;

import com.mapsa.oop.practice01.model.Employee;

public class DriverSalaryCalculator<T extends Employee> implements  SalaryCalculator<T>{

    private double giveDriverSomeMoney(){

        return 250;
    }

    @Override
    public double calculateSalary(T employee) {

        return employee.getSalary() - calculateTax(employee) + giveDriverSomeMoney();
    }
}
