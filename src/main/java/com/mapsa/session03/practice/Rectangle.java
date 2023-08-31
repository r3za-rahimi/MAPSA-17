package com.mapsa.session03.practice;

public class Rectangle extends  Shap {

    private Double width;
    private  Double height;

    public Rectangle(String color, Boolean filled, Double width, Double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, Boolean filled) {
        super(color, filled);
    }

    @Override
    public Double getArea() {
        return  width * height;
    }



}