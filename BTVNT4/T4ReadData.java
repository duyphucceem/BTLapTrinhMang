package jdev.tuan1demo1.Tuan4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class T4ReadData {
    public static void main(String[] args) {        
        try {
            //Tao doi tuong url tu 1 dia chi
            URL url=new URL("https://www.google.com");
            //mo ket noi den url
            URLConnection uRLConnection=url.openConnection();
            //Doc du lieu tu ket noi
            BufferedReader reader=new BufferedReader(
            new InputStreamReader(uRLConnection.getInputStream()));
            //Doc tung dong
            String line;
            while ((line=reader.readLine())!=null) {
                System.out.println(line);//In ra luong du lieu doc duoc
            }
            //Dong luong
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
