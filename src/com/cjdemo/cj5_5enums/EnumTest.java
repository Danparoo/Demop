package com.cjdemo.cj5_5enums;

import java.util.Scanner;

public class EnumTest {
    public static void main(String[] args) {
        /*通过输入来定size
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a size:(SMALL,MEDIUM...)");

        String input=in.next().toUpperCase();
        Size size=Enum.valueOf(Size.class,input);*/



       /* 直接通过valueof定size
        Size size=Enum.valueOf(Size.class,"SMALL");*/

       //直接通过Size.SMALL
        Size size=Size.SMALL;
        System.out.println("size="+size);
        System.out.println("abbreviation="+size.getAbbreviation());



        /*这也太无聊了吧
        if(size==Size.EXTRA_LARGE)
            System.out.println("Good job--you paid attention to the _.");*/




    }
}

enum Size{
    SMALL("S"),MEDIUM("M"),LARGE("L"),EXTRA_LARGE("XL");

    private Size(String abbreviation){this.abbreviation=abbreviation;}
    public String getAbbreviation(){return abbreviation;}

    private String abbreviation;
}
