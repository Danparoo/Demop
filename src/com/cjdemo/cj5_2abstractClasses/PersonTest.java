package com.cjdemo.cj5_2abstractClasses;



public class PersonTest {
    public static void main(String[] args){

        Person[] people = new Person[3];

        people[0]=new Student("lihua","computer science");
        people[1]=new Employee("aa",3500,2000,1,1);
        people[2]=new Manager("aa",3500,2000,1,1);
        for(Person p:people){
            System.out.println(p.getName()+", "+p.getDescription());
        }
        System.out.println(people[0].getName());
        /*测试getclass和instanceof
        System.out.println();
        System.out.println(people[0].getClass());
        System.out.println(people[1].getClass());
        System.out.println(people[2].getClass());
        if(people[2] instanceof Manager) System.out.println("it is a person");

        System.out.println();
        if(people[1].getClass()==people[2].getClass()) System.out.println("Manager and Employee are in a same class");*/






    }

}
