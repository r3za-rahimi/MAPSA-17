package com.mapsa.session01;

public class Primitive {
    public static void main(String[] args) {
        int myInt = 100;

        int myMaxInt = Integer.MAX_VALUE;
        int myMinInt = Integer.MIN_VALUE;

        System.out.println("max int value is : " + myMaxInt);
        System.out.println("min int value is : " + myMinInt);
        //----------------------------------------------
        byte myByte = 120;
//      byte myByte = (byte)123456 ;


        System.out.println(myByte);

        byte myMaxB = Byte.MAX_VALUE;
        byte myMinB = Byte.MIN_VALUE;

        System.out.println("max byte value is : " + myMaxB);
        System.out.println("min byte value is : " + myMinB);
        //------------------------------

        long mylong = 2147483648L;

        long myMaxL = Long.MAX_VALUE;
        long myMinL = Long.MIN_VALUE;

        System.out.println("max long value is : " + myMaxL);
        System.out.println("min long value is : " + myMinL);
        //--------------------------------

        float f = 123456789.123456789f;
        System.out.println("f : " + f);

        //---------------------------
        //convert pounds to kilogram :
        //NOTE: 1 Pound equals to 0.45359237 of kilogram

        int pound = 5;
        double uniValue = 0.45359237d;
        double myKilogram = pound * uniValue;
        System.out.println(" 5 pound is : " + myKilogram + " kilogram");
        //-------------------------

        char myChar = '\u0021';
//        char myChar = '!';
        char myChar2 = 80;

        System.out.println("my char : " + myChar);
        System.out.println("my char2 : " + myChar2);

        //---------------------------
        boolean isEmpty = true;
        boolean isNotEmpty = false;
    }
}