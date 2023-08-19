package com.mapsa.session02.practice;

public class Project02 {

    public static double area(double radius){

        if (radius < 0){
            return -1.0;
        }
        return radius * radius * Math.PI;

    }

    public static double area(double x , double y){
        if (x < 0 || y < 0){
            return -1.0;
        }
        return x * y;
    }


    public static void main(String[] args) {

        double area = Project02.area(-1);
        double area2 = Project02.area(-5.0 , 4.0);

        System.out.println(area);
        System.out.println(area2);

    }
}
