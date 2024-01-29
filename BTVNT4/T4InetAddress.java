
package jdev.tuan1demo1.Tuan4;

import java.net.InetAddress;

public class T4InetAddress {
    public static void main(String[] args) {
        try {
            //Tao doi tuong InetAddress bang ten may chu
            InetAddress addByName= InetAddress.getByName("www.google.com");
            //Tao doi tuong InetAdress bang dia chi IP
            InetAddress addByIP=InetAddress.getByName("192.168.31.59");
            System.out.println("Address By Name: "+addByName);
            System.out.println("Address By IP: "+ addByIP);
            //Su dung getter, setter de lay thong tin ve dai chi IP
            //lay ten may chu:
            InetAddress addByName1= InetAddress.getByName("www.facebook.com");
            String hostname=addByName1.getHostName();
            System.out.println("Host Name: "+hostname);
            //Lay dia chi IP
            String ip=addByName1.getHostAddress();
            System.out.println("Dia chi IP: "+ip);
            //----------------------
            InetAddress addByName2= InetAddress.getByName("www.facebook.com");
            //Kiem tra dia chi IP cos phair IP4 khong?
            boolean isIP4=addByName2 instanceof java.net.Inet4Address;
            System.out.println("Co Phai IP4 khong? "+isIP4);
            //Kiem tra dia chi IP cos phair IP6 khong?
            boolean isIP6=addByName2 instanceof java.net.Inet6Address;
            System.out.println("Co phai IP6 khong? "+isIP6);
        } catch (Exception e) {
        }
        
    }
}
