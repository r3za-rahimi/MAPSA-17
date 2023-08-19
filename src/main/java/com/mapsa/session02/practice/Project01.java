package com.mapsa.session02.practice;

public class Project01 {

    public void printEqual(int a , int b , int c){

        if (a < 0 || b < 0 || c < 0){

            System.out.println("invalid value");

        }else if(a == b && b == c ){

            System.out.println(" All number are equal ");

        }else if (a != b && b != c && a != c ){

            System.out.println(" All number are different ");
        }else {

            System.out.println(" Neither all are equal or different ");
        }


    }

    public static void main(String[] args) {

        Project01 pr01 = new Project01();
        pr01.printEqual(1,2,1);

    }
}
