package com.cjdemo.cj3fundamental;
import java.io.Console;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import static java.lang.Math.*;
public class Main {

    public static void main(String[] args) throws IOException {

        /*  码点和代码单元
        char A0 = 'A';
        System.out.println(A0);
        System.out.println("\uD835\uDD46");
        String O = "𝕆2";
        System.out.println(O);
        System.out.println(O.length());    //𝕆 代码单元  2
        System.out.println(O.codePointCount(0,O.length()));    //𝕆 码点  1
        System.out.println(O.charAt(0));
        System.out.println(O.codePointAt(0));
        */

        /*构建字符串
        String greeting = "hello";
        StringBuilder B = new StringBuilder(); //构建一个字符串构建器
        B.append(greeting+"123\uD835\uDD46");  //调用其中的append方法添加一部分字符串，返回值为组合好的字符串
        System.out.println(B);            //hello123𝕆
        String complete = B.toString();   //将B中的值赋给Complete
        System.out.println(complete);     //hello123𝕆
        */

        /* 输入（java中做事，都需要创建对象，让这个对象来做事情）
        Scanner in = new Scanner(System.in);  //构造一个Scanner对象in，并与标准输出流System.in关联
        System.out.println("What is your name?");
        String name = in.nextLine();      //输入一行
        System.out.println("How old are you?");
        int age = in.nextInt();           //输入数字
        System.out.println("Hello, "+ name + ". Next year, you'll be "+ (age + 1));  //输出
        */

        /*密码输入（调试不出来）
        Console cons = System.console();
        String username = cons.readLine("User name: ");
        char[] passwd = cons.readPassword("Password: ");
        */

        /*输出
        double x = -1000.0/3.0;
        System.out.println(x);
        System.out.printf("%,(8.2f\n",x);     //printf还是可以用
        System.out.printf("%tc", new Date()); //过时了，应该使用java.time
         */

        /* 文件输入输出
        String dir=System.getProperty("user.dir");   //找到启动路径位置
        System.out.println(dir);

        Scanner in = new Scanner(Paths.get("myfile.txt"),"UTF-8");  //读取前，需要构造一个Scanner对象，其中myfile.txt必须存在
        String name = in.nextLine();   //将文件的第一行赋给了name
        System.out.println(name);      //输出name

        PrintWriter out = new PrintWriter("myfile2.txt","UTF-8");   //输出前需要构造一个PrintWriter对象，myfile2.txt不必存在
        out.print("daipeng");
        //without using the following statement, the file name can be write out, but the content of the file is empty.
        out.close();
        */


        /* 多少年退休
        Scanner in = new Scanner(System.in);

        System.out.println("你需要多少钱才能退休？");
        double goal = in.nextDouble();

        System.out.println("你每年存多少钱？");
        double payment = in.nextDouble();

        System.out.println("Interest Rate(%)?");
        double interestRate = in.nextDouble();

        double balance = 0;
        int year = 0;
        while ( balance < goal)
        {
            balance+=payment;
            double interest = balance *interestRate/100;
            balance += interest;
            year++;
        }
        System.out.println("你可以在"+year+"年之后退休");
        */

       /*计算抽奖概率
        Scanner in =new Scanner(System.in);

        System.out.println("HOW MUCH NUMBERS DO YOU NEED TO DRAW?");
        int k =in.nextInt();
        System.out.println("WHAT IS THE HIGHTEST NUMBER YOU CAN DRAW?");
        int n =in.nextInt();

        int lotteryOdds = 1;
        for(int i = 1; i <= k; i++)
            lotteryOdds = lotteryOdds * ( n - i + 1 ) / i;
        System.out.println("Your odds are 1 in " + lotteryOdds + ". Good luck!");
        */


        /* 数组输入输出
        String[] a = new String [10];  //对象数组，初始化为null
        for(String element : a) System.out.println(element);   //for each语句输出。（结果为null...）
        System.out.println(Arrays.toString(a));   //用toString方法打印所有数组元素：[null, null, null, null, null, null, null, null, null, null]
        int[] b = {1,2,3,4,5};
        System.out.println(Arrays.toString(b));   //用toString方法打印所有数组元素：[1, 2, 3, 4, 5]
        */
        /*数组拷贝（常用来增加长度
        int[] b = {1,2,3,4,5};
        int[] copyb = Arrays.copyOf(b,10); //常用来增加长度
        System.out.println(Arrays.toString(copyb));
        */

        /* 随机选择数据
        Scanner in =new Scanner(System.in);

        System.out.println("HOW MUCH NUMBERS DO YOU NEED TO DRAW?");
        int k =in.nextInt();
        System.out.println("WHAT IS THE HIGHTEST NUMBER YOU CAN DRAW?");
        int n =in.nextInt();

        int[] numbers = new int[n];
        for(int i = 1;i <= n;i++){
            numbers[i-1] = i;
        }
        int[] result = new int[k];
        for(int i = 0;i<result.length;i++){
            int r = (int)(Math.random()*n);
            result[i] = numbers[r];
            numbers[r] = numbers[n-1];
            n--;
        }
        Arrays.sort(result);
        System.out.println("Bet the following combination. It'll make you rich!");
        for (int r:result)
            System.out.println(r);
        */

/*
   1
   1   1
   1   2   1
   1   3   3   1
   1   4   6   4   1
   1   5  10  10   5   1
   1   6  15  20  15   6   1
   1   7  21  35  35  21   7   1
   1   8  28  56  70  56  28   8   1
   1   9  36  84 126 126  84  36   9   1
   1  10  45 120 210 252 210 120  45  10   1

        final int NMAX = 10;
        int[][] odds = new int [NMAX+1][];
        for (int n = 0; n <= NMAX; n++)
            odds[n]=new int[n+1];

        for(int n = 0; n<odds.length;n++)
            for (int k = 0; k<odds[n].length;k++){
                int lotteryOdds = 1;
                for(int i = 1;i <= k ; i++){
                    lotteryOdds=lotteryOdds*(n-i+1)/i;
                }
                odds[n][k] = lotteryOdds;
            }
            for(int[] row : odds){
                for(int odd : row)
                    System.out.printf("%4d",odd);
                System.out.println();
            }


 */




    }
}
