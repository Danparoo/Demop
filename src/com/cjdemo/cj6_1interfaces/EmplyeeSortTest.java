package com.cjdemo.cj6_1interfaces;

import java.time.LocalDate;
import java.util.Arrays;

//用户自定义类
public class EmplyeeSortTest {
    public static void main(String[] args)  {


        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Cracker", 7500, 1987, 12,15);
        staff[1] = new Employee("Cracktrd", 700, 1887, 12,1);
        staff[2] = new Employee("Aracker", 750, 1897, 1,15);


        Arrays.sort(staff);

        for(Employee e : staff)
            System.out.println("name:"+e.getName()+", salary:"+e.getSalary()+", hireDay:"+e.getHireDay());



    }
}

