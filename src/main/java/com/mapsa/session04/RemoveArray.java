package com.mapsa.session04;

public class RemoveArray {


    int[] numbers = new int[]{1,0,2,3,5,6,7,2,6,4,3};

    public  void remove(int index) {

        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers.length ; j++) {

                if (i == j){
                    continue;
                }
                if (numbers[i] == numbers[j]){
                    shiftArray(i);
                }

            }
        }

    }

    public void shiftArray(int index){

        for (int i = index; i < numbers.length ; i++) {

            if (index == numbers.length-1){
                makeNewArray();
                break;
            }
          numbers[index]=numbers[index+1];
          index++;
        }

    }


    public void makeNewArray(){

        int[] newNumbers = new int[numbers.length-1];

        for (int i = 0; i <numbers.length-1 ; i++) {

            newNumbers[i] = numbers[i];
        }
        numbers = newNumbers;

        System.out.println("my new numbers is :");
        for (int num: numbers) {
            System.out.print(num +",");
        }
        System.out.println("");

    }

}
