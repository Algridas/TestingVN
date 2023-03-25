package org.example;

public class BT9 {

    public static int addNumber(String input1, String input2){

        try {
            int num1= Integer.parseInt(input1);
            int num2= Integer.parseInt(input2);
            return num1+num2;
        }
        catch (NumberFormatException e){
            System.out.println("Invalid input, please enter number only");
            return 0;

        }

    }

    public static void main(String[] args){

        String first = "abc";
        String second = "20";
        int result= addNumber(first,second);
        System.out.println("The sum of "+ first+ " and "+ second +" is " + result);


    }



}
