package com.cjdemo.cj5_1inheritance;

public class ManagerTest {
    public static void main(String[] args){

        Manager boss=new Manager("cc",80000,1990,12,1);
        boss.setBonus(5000);

        Employee[] staff = new Employee[3];

        staff[0]=boss;
        staff[1]=new Employee("aa",3500,2000,1,1);
        staff[2]=new Employee("bb",3000,2010,1,1);

        for(Employee e:staff){
            System.out.println("name:"+e.getName()+", salary:"+e.getSalary());
        }

    }
}
