package com.mapsa.session03.practice;

public class MainClass {

    public static void main(String[] args) {
//        PracticeInAction prc = new PracticeInAction();
//
//        prc.fillArray(100);

        int[] array = new int[]{3,2,5,8,1};
        int[] array2 = new int[]{2,5,6,8,3};

//        int smallestNumber = array[0];
//
//        for (int i =1; i < array.length ; i++ ) {
//            if (smallestNumber > array[i]){
//                smallestNumber = array[i];
//
//            }
//        }
//        System.out.println(smallestNumber);


        for (int i = 0; i <array.length ; i++) {

            System.out.println(array[i] * array2[i]);

        }

    }
}
