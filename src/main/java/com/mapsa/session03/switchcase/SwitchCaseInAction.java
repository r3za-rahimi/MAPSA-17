package com.mapsa.session03.switchcase;

public class SwitchCaseInAction {

    public void getMonth(int month){


        switch (month){
//            case 1 : {
//                return Month.JAN;
//            }
//            case 2 : {
//                return Month.FEB;
//            }
//            case 3 : {
//                return Month.MAR;
//            }
//            case 4 : {
//                return Month.APR;
//            }
//            case 5 : {
//                return Month.MAY;
//            }
//            case 6 : {
//                return Month.JUN;
//            }
//            default: return null;
            case 7 , 8 ,9  -> System.out.println();
//
//            case 8 -> {
//                return Month.AUG;
//            }
//            case 9 -> {
//                return Month.SEP;
//            }
//            case 10 -> {
//                return Month.OCT;
//            }
//            case 11 -> {
//                return Month.NOV;
//            }
//            case 12 -> {
//                return Month.DEC;
//            }
        }

    }



    public void monthWeather(Month month){

        switch (month){

            case MAR -> System.out.println("the weather is great");
            case JAN -> System.out.println("the weather is not bad");
            case FEB -> System.out.println("the weather is soooooo good");
            case DEC -> System.out.println("the weather is hot");
            case JUL -> System.out.println("the weather is cold as freezer");
            default -> System.out.println("--------------");
        }

    }
}
