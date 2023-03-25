package org.example;

public class BT8 {

    public static void main(String[] arr){
        Character c = 'b';
       System.out.println(Character.isLetter(c));
        if(Character.isLetter(c)){
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                System.out.println(c+ " là nguyên âm");
            }else{
                System.out.println(c+ " là phụ âm");
            }

        }else{
            System.out.println(c+ " ko phải là chữ cái");
        }

    }
}
