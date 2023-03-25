package org.example;

import java.util.Calendar;
import java.util.Date;

public class choichoivecalendar {

    public static void main(String[] args){
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        System.out.println("Thời gian hiện tại của hệ thống là: "+date);
    }


}
