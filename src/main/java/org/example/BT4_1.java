package org.example;
import java.util.Scanner;
public class BT4_1 {


    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Nhập số cần đảo: ");
        int n = sc.nextInt();

        int reverseNumber = 0;

        for(int i = n; i!=0; i/=10){
            int digit = i%10;
            reverseNumber = reverseNumber*10 + digit;

        }

        System.out.println("Số đảo: "+ reverseNumber);

    }

}
