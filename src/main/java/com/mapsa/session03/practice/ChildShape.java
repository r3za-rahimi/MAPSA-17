package com.mapsa.session03.practice;

import com.mapsa.session04.MyInterface;
import com.mapsa.session04.MyInterface2;

public class ChildShape extends Shap implements MyInterface , MyInterface2 {

    public ChildShape(String color, Boolean filled) {
        super(color, filled);
    }

    @Override
    public void doSomethings() {

    }

    @Override
    public void sum() {

    }

    @Override
    public Double getArea() {
        return null;
    }
}
