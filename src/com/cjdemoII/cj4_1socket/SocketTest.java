package com.cjdemoII.cj4_1socket;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;


/**
 * 该程序等同于telnet time-a.nist.gov 13
 * 但老师的要求是要合理捕获异常而非抛出。
 */
public class SocketTest {
    public static void main(String[] args) throws IOException {
        try(Socket s = new Socket("time-a.nist.gov",13);
            Scanner in = new Scanner(s.getInputStream(),"UTF-8"))
        {
            while(in.hasNext()){
                String line = in.nextLine();
                System.out.println(line);
            }
        }


    }
}
