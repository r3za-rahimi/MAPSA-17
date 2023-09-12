package com.mapsa.functionalprograming.practice02;

import java.util.function.BiFunction;

public class MainClass {

    public static void main(String[] args) {

        BiFunction<Double , Double , Double> sum = Double::sum;
        BiFunction<Double , Double , Double> min = Double::min;

        MathOperation sumOperator = Double::sum;

        mathOp(5 ,6 ,sum);
        mathOp(5 ,6 ,min);
        mathOp(5 ,6 ,sumOperator);

    }

    public static  void mathOp(double x , double y , BiFunction function){

        System.out.println(function.apply(x, y));
    }

    public static  void mathOp(double x , double y , MathOperation function){

        System.out.println(function.performOperation(x, y));
    }
}
