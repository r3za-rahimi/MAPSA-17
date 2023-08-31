package com.mapsa.session02;

public class Conditions {


    public void checkNumber(int number){


        if (number < 20){

           method1(number);
        }else if(number == 50){

            System.out.println("your number is 50");

        }else {
            method2(number);
        }
    }

    public void method1(int number){

        System.out.println(number * 3);
    }

    public void method2(int number){

        System.out.println(number *5);
    }
}
