package com.mapsa.session03.inheritance;

public class SameAsUsual {

    private int age ;
    private String name;


    public void setAge(int age){
        if (age > 150){
            System.out.println("you should .....");
        }else {

            this.age = age;

        }

    }
    public int getAge(){
        return this.age;
    }


}
