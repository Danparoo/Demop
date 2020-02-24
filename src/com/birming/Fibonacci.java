package com.birming;

public class Fibonacci {

    public static void main(String[] args) {
        int prev = 1;
        int prev2 = 0;
        System.out.println(prev);
        int sum = 0;
        for (int iter = 1; iter < 1000; iter++) {
            sum = prev + prev2;
            System.out.println(sum);
            prev2 = prev;
            prev = sum;
        }
    }
}