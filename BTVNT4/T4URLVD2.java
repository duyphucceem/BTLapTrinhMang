package jdev.tuan1demo1.Tuan4;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class T4URLVD2 {
    public static void main(String[] args) {
        try {
            //Tao doi tuong tu dia chi URL
            URL url=new URL("https://www.google.com");
            //Mo lien ket den URL
            URLConnection uRLConnection=url.openConnection();
            //Doc du lieu tu ket noi
            BufferedReader reader=new BufferedReader(
            new InputStreamReader(uRLConnection.getInputStream()));
            //Tao doi tuong ghi
            FileWriter fileWriter=new FileWriter("ourput.html");
            //Doc tung dong
            String line="";
            while((line=reader.readLine())!=null) {
                //Ghi vao fille
                fileWriter.write(line+"\n");
            }
            //Dong luong
            reader.close();
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
