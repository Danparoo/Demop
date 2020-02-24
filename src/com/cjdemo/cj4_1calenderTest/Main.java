package com.cjdemo.cj4_1calenderTest;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	LocalDate date = LocalDate.now();
	System.out.println(date);
    int month = date.getMonthValue();
    int today = date.getDayOfMonth();

    date = date.minusDays(today-1);  //减去一定天数
        DayOfWeek weekday = date.getDayOfWeek();  //得到星期几
    int value = weekday.getValue();
    System.out.println("Mon Tue Wed Thu Fri Sat Sun");
    for(int i = 1; i < value;i++)
        System.out.print("    ");
    while(date.getMonthValue()==month){
        System.out.printf("%3d", date.getDayOfMonth());
        if(date.getDayOfMonth()==today)
            System.out.print("*");
        else System.out.print(" ");
        if(date.getDayOfWeek().getValue()==7)
            System.out.println();
        date=date.plusDays(1);

    }


    }
}
