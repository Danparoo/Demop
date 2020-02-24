package com.cjdemo.cj5_2abstractClasses;

public abstract class Person {

    public abstract String getDescription();
    public String name;          //shouldnt be public, (just for equals

    public Person(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

}
