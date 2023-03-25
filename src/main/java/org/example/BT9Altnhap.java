package org.example;
import java.util.Scanner;
public class BT9Altnhap {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        String input1 = sc.nextLine();

        int a =0;
        try{
            a = Integer.parseInt(input1);
        } catch(NumberFormatException e){
            System.out.println("Wrong value, " + input1 + " is not a number");
            return;
        }
        System.out.println("Enter 2st number: ");
        String input2= sc.nextLine();
        int b=0;
        try{
            b= Integer.parseInt(input2);
        } catch (NumberFormatException e){
            System.out.println("Wrong value, " + input2 + " is not a number");
            return;
        }

        int result = sum(a,b);
        System.out.println("Result: "+result);

    }

    public static int sum(int a, int b){
        return a+b;
    }

}
