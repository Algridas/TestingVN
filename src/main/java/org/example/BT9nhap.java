package org.example;

public class BT9nhap {

    public static int addNumber(String input1, String input2){
        try{
            int num1= Integer.parseInt(input1);
            int num2= Integer.parseInt(input2);
            int sum = num1 +num2;
            return sum;
        } catch (NumberFormatException e){
            System.out.println("Invalid value, please insert again");
            return 0;
        }
    }

    public static void main(String[] args) {
        String val1 = "123";
        String val2 = "a";
        int result=addNumber(val1, val2);
        System.out.println("Sum of "+ val1 +" and "+ val2 +" is "+result );
    }

}
