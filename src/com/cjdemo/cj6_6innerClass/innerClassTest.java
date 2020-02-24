package com.cjdemo.cj6_6innerClass;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class innerClassTest {
    public static void main(String[] args){


        TalkingClock clock = new TalkingClock(1000,true);
        clock.start();

        JOptionPane.showMessageDialog(null,"Quit program?");
        System.exit(0);


    }
}

class TalkingClock{
    private int interval;
    private boolean beep;


    //构造函数
    public TalkingClock(int interval,boolean beep){
        this.interval=interval;
        this.beep=beep;
    }


    public void start(){
        ActionListener listener= new TimePrinter(); //构造了一个内部类的对象，完整语法：this.new TimePrinter()
        Timer t=new Timer(interval,listener);
        t.start();
    }

    //内部类
    public class TimePrinter implements ActionListener{
        public void actionPerformed(ActionEvent event){
            System.out.println("At the tone, the time is "+new Date());
            if(beep) Toolkit.getDefaultToolkit().beep();//beep的完整语法：TalkingClock.this.beep
        }
    }


}
