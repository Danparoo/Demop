package com.cjdemo.cj4_3onstructerTest;

import java.util.Random;



//4.6 各种构造
public class Employee {
    private static int nextId;

    private int id;
    private String name="";
    private double salary;

    static{
        Random generator = new Random();
        nextId = generator.nextInt(10000);
    }

    {
        id=nextId;
        nextId++;

    }


    public Employee(String n, double s){
        name = n;
        salary = s;
    }

    public Employee(double s){
        this("Employee#"+nextId,s);
    }

    public Employee(){

    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public int getId(){
        return id;
    }

}
