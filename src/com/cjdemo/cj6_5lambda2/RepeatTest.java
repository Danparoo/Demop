package com.cjdemo.cj6_5lambda2;

import java.util.function.IntConsumer;

public class RepeatTest {
    public static void main(String[] args) {

        Repeat.repeat(10, i -> System.out.println("Countdown:" + (9-i)));// lambada


    }
}

 class Repeat{
    public static void repeat ( int n, IntConsumer action){
        for (int i = 0; i < n; i++) action.accept(i);
    }
}

