package jdev.tuan1demo1.Tuan3;
//TIẾN TRÌNH TREO 2
public class VD05 {
    private final Object monitor = new Object();
    public void doi() throws InterruptedException{
        monitor.wait();//doi
    }
    public void danhThuc(){
        synchronized (monitor) {
            monitor.notify();//danh thuc
        }
    }
}
