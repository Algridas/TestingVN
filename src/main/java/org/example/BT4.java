package org.example;

public class BT4 {

    public static void main(String[] args){

        int number = 12345;
        int reversenumber = 0;


        for(int i=number; i !=0; i/=10){
            int digit = i%10;
            reversenumber = reversenumber*10 +digit;
        }
        System.out.println("normal number "+ number);
        System.out.println("reverse number "+ reversenumber);
    }

}
