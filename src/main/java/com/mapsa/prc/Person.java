package com.mapsa.prc;

public final class Person {

     String name;
    static String EYE = "GREEN";
    private String family;
    private int age;
    private final int rank  ;


    public Person(String name , String family, int rank){

        this.name = name;
        this.family = family;

        this.rank = rank;
    }

    public Person(String name, String family, int age, int rank) {
        this.name = name;
        this.family = family;
        this.age = age;
        this.rank = rank;
    }

    public Person(int age, int rank) {
        this.age = age;
        this.rank = rank;
    }

    public Person(int rank){

        this.rank = rank;
    }


    public int getAge(int sen){
        int age = this.age ;
        return age;
    }

    public final long getAge(long sen){
        name = "kkkk";

        return sen *3;
    }


    public static boolean staticMethod(){
        System.out.println(" this is static method");
        return false;
    }


}
