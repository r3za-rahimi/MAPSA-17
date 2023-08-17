package com.mapsa.session02;

public class MainClass {

    public static void main(String[] args) {

        System.out.println(KeyWord.y);
        KeyWord.y = 60;
        System.out.println(KeyWord.y);

        KeyWord keyWord = new KeyWord(50);

//        keyWord.a 80;

        System.out.println(keyWord.a);


    }




}
