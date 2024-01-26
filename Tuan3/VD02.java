
package jdev.tuan1demo1.Tuan3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;//tao khoa
//ĐỒNG BỘ LUỒNG 2
public class VD02 {
    private int count=0;
    private Lock lc=new ReentrantLock();//tao khoa
    public void demTang()
    {
        lc.lock();//khoa lai
        try {
            count++;//thuc hien dem
        } catch (Exception e) {
        }
        finally
        {
            lc.unlock();//dem xong can mo khoa
        }
    }
}
