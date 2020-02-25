package com.cjdemoII.cj4_1_4InetAddress;

import java.io.IOException;
import java.net.InetAddress;

public class InetAddressTest {
    public static void main(String[] args) throws IOException{
        if(args.length>0){
            String host = args[0];
            InetAddress[] address= InetAddress.getAllByName(host);
            for(InetAddress a: address){
                System.out.println(a);
            }
        }else{
            InetAddress localHostAddress= InetAddress.getLocalHost();
            System.out.println(localHostAddress);
        }
    }
}
