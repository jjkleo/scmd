package com.cxytiandi.web.util;

import java.net.InetAddress;
import java.net.Socket;

public class NetUtils {


    public static boolean isLoclePortUsing(int port){
        boolean flag = true;
        try {
            flag = isPortUsing("127.0.0.1", port);
        } catch (Exception ignored) {
        }
        return flag;
    }

    public static boolean isPortUsing(String host,int port) {
        boolean flag = false;
        try {
            InetAddress theAddress = InetAddress.getByName(host);
            Socket socket = new Socket(theAddress,port);
            socket.close();
            flag = true;
        } catch (Exception ignored) {

        }
        return flag;
    }

}
