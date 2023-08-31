package com.mapsa.session03.collections;

public class UseArray {


    int[] adadha = new int[10];


    public void sohrabi(){

        System.out.println(adadha.length);

//        for (int i =0;  i<adadha.length ; i++){
//
//            adadha[i] = i;
//        }

        for (int   add  :  adadha){
            System.out.println(add);
        }

    }
}
