package com.mapsa.session02;

public class SwichTest {


    public void switch1(String day){

        switch (day){

            case "monday" : {
                System.out.println(" روز دوشنبه");
            }

            case "SUNDAY" : {
                System.out.println(MyEnum.SUNDAY);
            }
        }


    }
}
