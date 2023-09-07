package com.mapsa.oop.practice02;

import com.mapsa.oop.practice02.model.Employee;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SalaryCalculatorPlus<T extends Employee> {


     Double calculateSalary(T employee);

    default Map<String , Double> calculateSalary(List<T> employees){

        Map<String , Double> result = new HashMap<>();
        for (T e :employees) {
            result.put(e.getnId() , calculateSalary(e) );
        }
        return result;
    }

     Double calculateTax(T employee);


}
