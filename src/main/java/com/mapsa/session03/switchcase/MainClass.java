package com.mapsa.session03.switchcase;

public class MainClass {

    public static void main(String[] args) {

        SwitchCaseInAction sw = new SwitchCaseInAction();

        Month month = sw.getMonth(2);

        System.out.println(month);


        sw.monthWeather(Month.FEB);

    }

}
