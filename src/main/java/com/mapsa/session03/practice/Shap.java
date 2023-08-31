package com.mapsa.session03.practice;

public abstract class Shap {
    private String color ;
    private Boolean filled;

    public Shap(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    public Boolean getFilled() {
        return filled;
    }

    public abstract Double getArea();
}
