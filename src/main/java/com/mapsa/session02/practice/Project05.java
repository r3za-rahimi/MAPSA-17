package com.mapsa.session02.practice;

public class Project05 {

    public static boolean shouldBark(boolean barking, int hourOfDay) {


        if (!barking || hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else if (hourOfDay < 8 || hourOfDay > 22) {
            return true;
        }else {
            return false;
        }

    }


    public static void main(String[] args) {


        System.out.println(Project05.shouldBark(true, 23));

    }
}
