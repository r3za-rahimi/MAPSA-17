package com.mapsa.oop.practice01;

import com.mapsa.oop.practice01.model.Driver;
import com.mapsa.oop.practice01.model.Employee;
import com.mapsa.oop.practice01.model.Manager;
import com.mapsa.oop.practice01.model.Secretary;
import com.mapsa.oop.practice01.service.SalaryCalculator;
import com.mapsa.oop.practice01.service.ServicePlus.DriverSalaryCalculator;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {

        SalaryCalculator salaryCalculator = new SalaryCalculator();
        DriverSalaryCalculator<Driver> driverSalaryCalculator = new DriverSalaryCalculator<>();
        List<Driver> employees = new ArrayList<>();

//        Employee e1 = new Manager( 123456L,"javad" , 50000L ,  2);
//        Employee e2 = new Secretary(565646L,"mona" , 80000L ,  5);
        Driver e3 = new Driver(5782120L,"sara" , 80000L ,  5);
        Driver e4 = new Driver(5541212100L,"farshid" , 80000L ,  8);

        employees.add(e3);
        employees.add(e4);

        System.out.println(salaryCalculator.calculateSalary(e3));
//        System.out.println(salaryCalculator.calculateSalary(employees));
        System.out.println(driverSalaryCalculator.calculateSalary( employees));

    }
}
