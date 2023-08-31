package com.mapsa.session03.practice;

public class RemoveArrayDuplicate {

   static int[] numbers = new int[]{1,4,6,5,1,2,4,5,8,2,1,5,6,2,8,4};


    public static void removeDuplicate(){

        int[] unique = new int[numbers.length];
        int index = 0;

        for (int i = 0 ; i<numbers.length ; i++){

            boolean isNotUnique = false;
            for (int j = 0 ; j < unique.length ; j++ ){

                if (numbers[i] == unique[j]){

                    isNotUnique = true;
                    break;
                }

            }
            if (!isNotUnique){
                unique[index] = numbers[i];
//                unique[index++] = numbers[i];
                index++;
            }
        }

        for (int x : unique){
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        removeDuplicate();
    }
}
