package org.example;

public class BT6 {


    public static int kiemsomax(int[] arr){
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i]   ;
            }

        }

        return max;
    }


    public static void main(String[] args){

        int[] Array = {14, 3, 9, 16, 4};
        int maxVal = kiemsomax(Array);
        System.out.println(maxVal);

    }

}
