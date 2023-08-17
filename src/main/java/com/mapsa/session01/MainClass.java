package com.mapsa.session01;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class MainClass {


    public static void main(String[] args) {

        Person firstPerson = new Person();

        firstPerson.name = "reza";
        firstPerson.speak("hi my name is john , i am java developer");
        System.out.println(firstPerson.name);

        //////////////////////////////


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String input = scanner.next();

        System.out.println(input);




    }
}
