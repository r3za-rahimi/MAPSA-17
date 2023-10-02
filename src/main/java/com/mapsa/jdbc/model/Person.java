package com.mapsa.jdbc.model;

public class Person {

    private String id;
    private String firstname;
    private String lastname;
    private Integer age;
    private String gender;
    private String geography;
    private String email;
    private String profession;
    private Double salary;
    private Boolean isAlive;

    public Person(String id, String firstname, String lastname, Integer age, String gender, String geography, String email, String profession, Double salary, Boolean isAlive) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.gender = gender;
        this.geography = geography;
        this.email = email;
        this.profession = profession;
        this.salary = salary;
        this.isAlive = isAlive;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGeography() {
        return geography;
    }

    public void setGeography(String geography) {
        this.geography = geography;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Boolean getAlive() {
        return isAlive;
    }

    public void setAlive(Boolean alive) {
        isAlive = alive;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", geography='" + geography + '\'' +
                ", email='" + email + '\'' +
                ", profession='" + profession + '\'' +
                ", salary=" + salary +
                ", isAlive=" + isAlive +
                '}';
    }
}
