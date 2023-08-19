package com.mapsa.session02.practice;

public class Project04 {

    public static boolean hasEqualSum(int a , int b , int c){

        if ( (a + b) == c ){
            return true;
        }else {
            return false;
        }

    }

    public static void main(String[] args) {

        System.out.println(Project04.hasEqualSum(1, -1, 0));

    }

}
