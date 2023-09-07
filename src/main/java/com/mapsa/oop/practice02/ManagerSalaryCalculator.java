package com.mapsa.oop.practice02;

import com.mapsa.oop.practice02.model.Employee;

public class ManagerSalaryCalculator implements SalaryCalculatorPlus{
    @Override
    public Double calculateSalary(Employee employee) {
        return employee.getSalary() -  calculateTax(employee) + 50002;
    }

    @Override
    public Double calculateTax(Employee employee) {
        return employee.getSalary() * employee.getTaxRate() /100 ;
    }
}
