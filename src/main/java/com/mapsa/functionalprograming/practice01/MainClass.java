package com.mapsa.functionalprograming.practice01;

import java.util.function.Function;

public class MainClass {


    public static void main(String[] args) {

        Function<String , String> toUpperCase = String::toUpperCase;
        Function<String , String> toLowerCase = String::toLowerCase;
        Function<String , Integer> compare = x -> x.compareTo("ali");
        StringOperation strop = String::toLowerCase;


//        stringActions("alli" , toUpperCase);
//        stringActions("alliSS" , toLowerCase);
//        stringActions("al" , compare);
        stringActions("alSSFF" , strop);

    }


    public static void  stringActions(String str , StringOperation function){

        System.out.println(function.performOperation(str));

    }
}
