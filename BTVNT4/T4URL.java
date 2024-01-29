package jdev.tuan1demo1.Tuan4;

import java.net.URL;

public class T4URL {
    public static void main(String[] args) {
        try {
            //Tao doi tuong URL tu1 dia chi URL
            //host?thamso1=giatri1&thamso2=giatri2
            URL url=new URL("https://myaccount.google.com/?utm_source=OGB&utm_medium=app&pli=1");
            //Phan tich thong tin tu URL
            System.out.println("Protocol: "+url.getProtocol());
            System.out.println("Host: "+url.getHost());
            System.out.println("Port: "+url.getPort());
            System.out.println("Path: "+url.getPath());
            System.out.println("Truy van: "+url.getQuery());
            System.out.println("Tham Chieu: "+url.getRef());
        } catch (Exception e) {
        }
    }
}
