package com.mapsa.oop.practice02;

import com.mapsa.oop.practice02.model.Employee;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalaryCalculator<T extends Employee > {

    public Double calculateSalary(T employee){

     return employee.getSalary() -  calculateTax(employee);

    }

    public Map<String , Double> calculateSalary(List<T> employees){

        Map<String , Double> result = new HashMap<>();
        for (T e :employees) {
            result.put(e.getnId() , calculateSalary(e) );
        }

        return result;
    }

    private Double calculateTax(T employee){

        return employee.getSalary() * employee.getTaxRate() /100 ;
    }


}
