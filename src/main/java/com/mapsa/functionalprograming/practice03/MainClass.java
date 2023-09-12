package com.mapsa.functionalprograming.practice03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {


        ListAggregator<String , List<Integer>> stringListToInteger = list -> {

            List<Integer> numbers = new ArrayList<>();
            for (String str : list) {
                numbers.add(Integer.parseInt(str));
            }
            return numbers;
        };

        List<String> list = Arrays.asList("2", "52", "25", "5", "3", "255", "989", "20002", "1000");
        transformer(list , stringListToInteger);

    }

    public  static  void  transformer(List<String> list , ListAggregator listAggregator){

        System.out.println(listAggregator.aggregate(list));

    }
}
