package com.mapsa.session03.practice;

import java.util.Random;

public class PracticeInAction {



    public void fillArray(int size){

        Random random = new Random();
        int[] numbers = new int[size];

        for (int i = 0 ; i< numbers.length ; i++){

            numbers[i] = random.nextInt(1,1000);
        }

        double avrage = 0;
        for (  int num : numbers   ) {
            avrage += num;
        }

        System.out.println(avrage / numbers.length);

    }

}
