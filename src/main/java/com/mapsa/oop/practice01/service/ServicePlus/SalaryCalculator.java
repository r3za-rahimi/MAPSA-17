package com.mapsa.oop.practice01.service.ServicePlus;

import com.mapsa.oop.practice01.model.Employee;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SalaryCalculator<T extends Employee> {
    
    default Double calculateTax(T employee){

        return (double) (employee.getSalary() * employee.getTaxRate()) / 100;
    }
    
    double calculateSalary(T employee);

    default Map<Long , Double> calculateSalary(List<T> employeeList){

        Map<Long , Double> result = new HashMap<>();
        for (T e : employeeList) {

            result.put(e.getNational_Id() ,  calculateSalary(e));
        }

        return result;
    }
}
