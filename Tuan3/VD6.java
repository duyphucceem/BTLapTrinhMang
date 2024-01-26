package jdev.tuan1demo1.Tuan3;
//VD TIẾN TRÌNH TREO: KIẾM TIỀN - TIÊU TIỀN.
public class VD6 {
    private final Object monitor = new Object();
    private boolean isCoTien = false;//Kiem tra tien
    public void kiemTien() throws InterruptedException{//ham kiem tien
        synchronized (monitor) {//giu khoa
            while (isCoTien){
                monitor.wait();//doi
            }
            //lap lai viec kiem tien
            System.out.println("Kiem tien...");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            //sau khi kiem tien xong
            isCoTien = true;
            monitor.notify();//bao chuan bi tieu
        }
    }
    //ham tieu tien
    public void tieuTien() throws InterruptedException{
        synchronized (monitor) {
            while (!isCoTien){
                monitor.wait();
            }
            System.out.println("Tieu tien...");
            Thread.sleep(2000);
            isCoTien = false;//tieu het tien
            monitor.notify();//bao da het tien
        }
    }
    public static void main(String[] args) {
        VD6 ex = new VD6();
        Thread kt = new Thread(()->{//tao tien trinh kiem tien
            try {
                while (true) {                    
                    ex.kiemTien();
                }
            } catch (Exception e) {
            }
        });
        Thread tt = new Thread(()->{
            try {
                while (true) {                    
                    ex.tieuTien();
                }
            } catch (Exception e) {
            }
        });
        //chay tien trinh
        kt.start();
        tt.start();
    }
}
