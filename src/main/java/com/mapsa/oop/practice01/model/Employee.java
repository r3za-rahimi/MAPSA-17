package com.mapsa.oop.practice01.model;

public abstract class Employee {

    private Long national_Id;
    private String name;
    private Long salary;
    private Integer taxRate;

    public Employee() {
    }

    public Employee(Long national_Id, String name, Long salary, Integer taxRate) {
        this.national_Id = national_Id;
        this.name = name;
        this.salary = salary;
        this.taxRate = taxRate;
    }

    public Long getNational_Id() {
        return national_Id;
    }

    public void setNational_Id(Long national_Id) {
        this.national_Id = national_Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public Integer getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Integer taxRate) {
        this.taxRate = taxRate;
    }
}
