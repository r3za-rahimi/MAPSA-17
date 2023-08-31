package com.mapsa.session03.inheritance;

public class Dog extends Animal {

    String muzzleColor ;


    public Dog(String muzzleColor , String name , int age){

        super(name , age);
        this.muzzleColor = muzzleColor;

    }




    @Override
    public void run(){
        System.out.println("**************");
    }
}
