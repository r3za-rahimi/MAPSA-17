package com.mapsa.oop.practice01.service;

import com.mapsa.oop.practice01.model.Employee;
import com.mapsa.oop.practice01.model.Manager;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalaryCalculator {

    private double calculateTax(Employee employee){

//        if (employee instanceof Manager){
//            System.out.println("hahaha");
//        }else {
//            System.out.println("hooohooo");
//        }

        return (double) (employee.getSalary() * employee.getTaxRate()) / 100;

    }


    public double calculateSalary(Employee employee){

        return employee.getSalary() - calculateTax(employee);
    }

    public Map<Long , Double> calculateSalary(List<Employee> employeeList){

        Map<Long , Double> result = new HashMap<>();
        for (Employee e : employeeList) {

            result.put(e.getNational_Id() ,  calculateSalary(e));
        }

        return result;
    }
}
