package com.cjdemo.cj5_2abstractClasses;

import java.time.*;

public class Student extends Person {
    private String major;

    public Student(String name,String major){
        super(name);
        this.major=major;

    }


    public String getDescription(){
        return "a student major in "+major;
    }


}
