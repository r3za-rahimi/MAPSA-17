package com.mapsa.session03.practice;

public class ArrayMinValue {

   static double[] numbers = new double[]{5.2, 6.2, 3.6, 8.4, 1.3, 2.2, 9.8};

    public static double getMinValue() {

        double minValue = numbers[0];
        for (double x : numbers) {

            if (x < minValue) {
                minValue = x;
            }

        }
        return minValue;
    }

    public static void main(String[] args) {
        System.out.println(getMinValue());
    }
}
