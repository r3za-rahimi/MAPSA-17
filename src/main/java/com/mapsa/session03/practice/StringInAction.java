package com.mapsa.session03.practice;

public class StringInAction {

    String[] names =
            new String[]{"salam" ,"ali" ,"hi" ,"hava" , "hello" , "javad" ,"esfandiyar"};


    public void findIndex(){

        String name ;

        for (int i = 0; i < names.length ; i++) {

          if ( names[i].equals("hello")){

              System.out.println(i);
              break;
          }
        }
    }

    public static void main(String[] args) {

        StringInAction stringInAction = new StringInAction();

        stringInAction.findIndex();

    }

}
