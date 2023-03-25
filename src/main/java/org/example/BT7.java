package org.example;

public class BT7 {

    public static int minimumnum(int[] arr){

        int min = arr[0];

        for(int i=1; i< arr.length; i++){

            if(arr[i]<min){
                min = arr[i];
            }
        }


        return min;
    }

    public static void main(String[] args){
        int[] Array = {12,5,23,8,11};
        int minValue = minimumnum(Array);
        System.out.println(minValue);
    }


}
