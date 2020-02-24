package com.cjdemo.cj5_2abstractClasses;

public class Manager extends Employee {
    private double bonus;
    public Manager(String name, double salary, int year, int month, int day){
        super(name, salary, year,month,day);
        bonus=0;
    }

    public double getSalary(){
        double baseSalary=super.getSalary();
        return baseSalary+bonus;
    }
    public void setBonus(double b){
        bonus=b;
    }

    public double getBonus(){

        return bonus;
    }

    public String getDescription(){
        return String.format("an manager with a salary of $%.2f a bonus of $%.2f",super.getSalary(),getBonus());
    }

}
