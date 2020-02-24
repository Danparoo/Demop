package com.cjdemo.cj6_3comparator;

import java.time.LocalDate;
import java.util.Comparator;

class Employee implements Comparable<Employee>{
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

    public int compareTo(Employee other){
        return Double.compare(salary,other.salary);
    }
}

class LengthComparator implements Comparator<String> {
    public int compare(String first , String second){
        return first.length()-second.length();
    }
}