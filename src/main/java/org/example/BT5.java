package org.example;
import java.sql.SQLOutput;
import java.util.Scanner;

public class BT5 {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] arg){

        System.out.println("Nhập số cần đảo: ");
        int n = sc.nextInt();
        int reverseNumber = 0;

        while(n!=0){
            int digit = n%10;
            reverseNumber = reverseNumber*10 + digit;
            n/=10;

        }

        System.out.println("Số cần đảo: "+reverseNumber);

    }

}
