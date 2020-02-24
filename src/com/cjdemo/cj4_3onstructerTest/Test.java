package com.cjdemo.cj4_3onstructerTest;

public class Test {
    public static void main(String[] args) /*throws InvocationTargetException, IllegalAccessException, NoSuchMethodException*/ {


        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Cracker", 7500);
        staff[1] = new Employee(700);
        staff[2] = new Employee();


        for(Employee e : staff)
            System.out.println("name:"+e.getName()+", salary:"+e.getSalary()+", Id:"+e.getId());





        /*利用反射调用任何方法CJ P206（相关Exception也被注释了）
        Method m1=Employee.class.getMethod("getName");
        String n = (String) m1.invoke(staff[0]);
        System.out.println(n);
        */

    }
}
