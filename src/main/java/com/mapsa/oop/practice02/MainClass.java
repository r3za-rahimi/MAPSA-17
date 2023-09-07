package com.mapsa.oop.practice02;

import com.mapsa.oop.practice02.model.Driver;
import com.mapsa.oop.practice02.model.Employee;
import com.mapsa.oop.practice02.model.Manger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {

        SalaryCalculator salaryCalculator = new SalaryCalculator();
        List<Employee> employeeList = new ArrayList<>();

//        Employee e1 = new Employee("002145879","farid" , 2000d ,3d );
//        Employee e2 = new Employee("454254","sara" , 6000d ,2d );
//        Employee e3 = new Employee("00218000155","hadi" , 85000d ,5d );
//        Employee e4 = new Employee("05454545879","mohammad" , 55000d ,10d );


        Manger manger = new Manger("1","javad" , 1000d ,5d);
        Manger manger2 = new Manger("2","javad" , 2000d ,5d);
        Manger manger3 = new Manger("3","javad" , 3000d ,5d);
        Manger manger4 = new Manger("4","javad" , 4000d ,5d);
//        manger.sum();



        Employee  manager2 = new Manger("50505","Farid" , 100d ,5d);

        Employee  driver = new Driver("n5650244","javad" , 6000d ,5d);

//        System.out.println(salaryCalculator.calculateSalary(driver));


        employeeList.addAll(Arrays.asList(manger, manger2, manger3, manger4));
//        System.out.println(salaryCalculator.calculateSalary(e1));
//        System.out.println("Manager => " +salaryCalculator.calculateSalary(manager2));
//
//        System.out.println(salaryCalculator.calculateSalary(employeeList));




        ManagerSalaryCalculator managerSalaryCalculator = new ManagerSalaryCalculator();
        System.out.println(managerSalaryCalculator.calculateSalary(manger));
        System.out.println(managerSalaryCalculator.calculateSalary(employeeList));

    }
}
