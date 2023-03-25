package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        kiemTraSoChan(4);
//        kiemTraSoChan(5);
//        kiemTraSoChan(0);

        Integer[] numbers = {1,6,9,2,5,6};


        Arrays.asList(numbers).stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);


//        for(int number: numbers){
//            System.out.println(number);
//        }


    }

    public static boolean kiemTraNguyenAm(Character letter){
        if(Character.isLetter(letter)){
            if(letter == 'e' || letter == 'u' || letter == 'a' || letter == 'o' || letter == 'i'){
                System.out.println(letter + " la nguyen am");
                return true;
            } else{
                System.out.println(letter + " la phu am");
                return false;
            }

        } else{
            System.out.println(letter + " khong phai la letter");
            return false;
        }


    }



    public static boolean kiemTraSoChan(int a){

        if(a % 2 == 0){
            System.out.println(a + " la so chan ");
            return true;
        }else {
            System.out.println( a + " la so le");
            return false;
        }

    }
//Viết 1 đoạn ctrinh kiểm tra 1 số nhập vào có phải số chẳn hay ko?
    //Viết 1 đoạn ctrinh kiểm tra chữ đó là chữ phụ âm hay ko
}

