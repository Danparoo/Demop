package com.cjdemo.cj4_2employeeTest;

import java.time.LocalDate;

class Employee{
    public static int xx;// static初值为0
    private String name;
    private double salary;
    private LocalDate hireDay;


    public Employee(String n, double s, int year, int month, int day){
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public LocalDate getHireDay(){
        return hireDay;
    }

    public void raiseSalary(double byPercent){
        double raise = this.salary * byPercent/ 100;
        this.salary += raise;
    }



}
