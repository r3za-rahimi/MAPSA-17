package com.mapsa.session03.practice;

public class Square extends Rectangle{
    private Double sideLength;

    public Square(String color, Boolean filled, Double sideLength) {
        super(color, filled);
        this.sideLength = sideLength;
    }


    @Override
    public Double getArea() {
        return sideLength * 4;
    }
}
