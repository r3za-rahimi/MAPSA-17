package com.mapsa.session02.practice;

public class Project03 {

    public static boolean hasTeen(int o1 , int o2 , int o3){

        if (( o1 >= 13 && o1 <= 19) || ( o2 >= 13 && o2 <= 19) || ( o3 >= 13 && o3 <= 19) ){
            return true;
        }else {
            return false;
        }
    }

    public static boolean hasTeen(int o){

        if (( o >= 13 && o <= 19)  ){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {

        boolean result = Project03.hasTeen(19);

        System.out.println(result);
    }


}
