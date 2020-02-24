package com.birming;

public class Mess {
    public static void main(String[] args) {
        /*  测试substring   out：hell
           String s = "hello world";
           System.out.println(s.substring(0,4));
           */


        double[][] a = {
                {1, 2, 2},
                {1, 12, 2}
        };

        double sum = 0, average = 0;
        int counter = 0;

        for (double[] row : a) {
            for (double element : row) {
                sum += element;
                counter++;
            }
        }
        average = sum / counter;
        System.out.println(average);

    }

    //四舍五入保留两位小数的method
    public double roundToTwoDecimal(double f) {
        String str = String.format("%.2f", f);
        double c = Double.parseDouble(str);
        return c;
    }

}