package com.cjdemo.cj5_4arrayList;

import java.time.LocalDate;
import java.util.ArrayList;

public class EmplyeeTest {
    public static void main(String[] args) {


        ArrayList<Employee> staff=new ArrayList<>();
        staff.add( new Employee("Cracker", 7500, 1987, 12,15));
        staff.add(new Employee("Cracktrd", 700, 1887, 12,1));
        staff.add(new Employee("Aracker", 750, 1897, 1,15));


        for(Employee e : staff)  //这里和用普通数组一样
            e.raiseSalary(5);

        for(Employee e : staff)
            System.out.println("name:"+e.getName()+", salary:"+e.getSalary()+", hireDay:"+e.getHireDay());

    }
}

