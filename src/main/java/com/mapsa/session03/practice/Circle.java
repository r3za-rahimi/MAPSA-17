package com.mapsa.session03.practice;

public class Circle extends  Shap{

    private Double radius;
    public Circle(Double radius ,String color, Boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public Double getArea(){
        if(radius == null) {
            return null;
        }
        return  radius * radius * Math.PI;
    }



}
