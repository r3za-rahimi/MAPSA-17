package com.mapsa.oop.practice02.model;

public abstract class Employee implements BaseRaftar{

    protected String nId;
    private String name;
    private Double salary;
    private Double taxRate;

    public Employee() {
    }

    public Employee(String nId, String name, Double salary, Double taxRate) {
        this.nId = nId;
        this.name = name;
        this.salary = salary;
        this.taxRate = taxRate;
    }

    public String getnId() {
        return nId;
    }

    public void setnId(String nId) {
        this.nId = nId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }

    public abstract void sum();
}
