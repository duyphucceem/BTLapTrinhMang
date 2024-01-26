package jdev.tuan1demo1.Tuan3;
//TIẾN TRÌNH TREO 1
public class VD04 {
    private final Object lc=new Object();//doi tuong khoa
    public synchronized void pt1(){//phuong thuc dong bo hoa
    
    }
    public synchronized void pt2(){
        synchronized (lc)//giu khoa
        {
            
        }
    }
    public static void main(String[] args) {
        Thread th=new Thread(()->{
            //code
        });
        th.start();
        try {
            //phuong thuc 1 la tien trinh treo
        } catch (Exception e) {
        }
    }
}
