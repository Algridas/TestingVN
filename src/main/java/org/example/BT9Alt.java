package org.example;

import java.util.Scanner;



public class BT9Alt {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Nhập giá trị đầu tiên: ");
        String input1= sc.nextLine();
        int a =0;
        try {
            a = Integer.parseInt(input1);
        } catch (NumberFormatException e){
            System.out.println("Invalid value, insert again");
            return;
        }

        System.out.println("Nhập giá trị thứ 2: ");
        String input2 = sc.nextLine();
        int b=0;
        try{
            b = Integer.parseInt(input2);
        } catch(NumberFormatException e){
            System.out.println("Invalid value, please enter number again");
            return;
        }

        int result = sum(a,b);
        System.out.println("Result: "+result);

    }

    private static int sum(int a, int b) {
        return a+b;
    }



}
