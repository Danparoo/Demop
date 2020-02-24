package com.cjdemo.cj6_2timer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.util.Date;


public class TimerTest {
    public static void  main (String [] arg){
        ActionListener listener = new TimePrinter();

        Timer t=new Timer(5000,listener);
        t.start();

        JOptionPane.showMessageDialog(null,"Quit program?");
        System.exit(0);

    }
}


class TimePrinter implements ActionListener{
    public void actionPerformed(ActionEvent event){
        System.out.println("At the tone, the time is "+new Date());
        Toolkit.getDefaultToolkit().beep();
    }
}

