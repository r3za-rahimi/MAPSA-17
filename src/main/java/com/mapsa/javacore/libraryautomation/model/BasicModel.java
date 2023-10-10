package com.mapsa.javacore.libraryautomation.model;

public class BasicModel {

    private Long id;
    private String name;

    public BasicModel() {
    }

    public BasicModel(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public BasicModel setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public BasicModel setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "BasicModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
