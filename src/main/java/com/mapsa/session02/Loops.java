package com.mapsa.session02;

public class Loops {

    public void forLoop(){

        for (long i = 100; i > 0 ; i--){
            System.out.println(i);
            if (i == 60){
                break;
            }
        }

    }

    public void whileLoop(){

        int a = 0;

        while (true){

            System.out.println(a);
            if (a == 62){
                break;
            }

            a++;
        }

    }


}
