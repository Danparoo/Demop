package com.cjdemoII.cj4_1socket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;


public class SocketTest2 {
    public static void main(String[] args) throws IOException {
        try(Socket s = new Socket("www.apple.com",80);
            DataOutputStream toServer =new DataOutputStream(s.getOutputStream());
            Scanner in = new Scanner(s.getInputStream(),"UTF-8"))
        {
            toServer.writeUTF("GET / HTTP/1.1\n" +
                    "Host: www.apple.com\n" +
                    "\n");
            while(in.hasNext()){
                String line = in.nextLine();
                System.out.println(line);
            }
        }


    }
}
