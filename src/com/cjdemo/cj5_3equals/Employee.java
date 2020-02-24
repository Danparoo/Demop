package com.cjdemo.cj5_3equals;

import java.time.LocalDate;
import java.util.Objects;


public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month,int day){
        this.name=name;
        this.salary=salary;
        hireDay=LocalDate.of(year,month,day);
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

    public boolean equals(Object otherObject){
        if (this==otherObject) return true;

        if(otherObject==null) return false;

        if(getClass()!=otherObject.getClass()) return false;//区分Employee和Manager，即使域值均相同也认为他们不是一个人
        //if(!(otherObject instanceof Employee)) return false;//不管Employee还是Manager，域值相同就认为他们是一个人

        Employee other= (Employee) otherObject;

        return Objects.equals(name,other.name)
                &&salary==other.salary
                &&Objects.equals(hireDay,other.hireDay);
    }

    public int hashCode(){
        return Objects.hash(name,salary,hireDay);
    }

    public String toString(){
        return getClass().getName()+"[name="+name+"Salary="+salary+", hireDay="+hireDay+"]";
    }
}
