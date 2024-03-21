
package Tuan91;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
public class RMIServer {
    public static void main(String[] args) {
        try {
            //Khoi tao may chu
            LocateRegistry.createRegistry(1097);
            //tao doi tuong lop Remote
            StudentService obj = new StudentServiceImp();
            //Dang ky
            Naming.rebind("//localhost: 1097/studentService", obj);
            System.out.println("Server da san sang");
        } catch (Exception e) {
            System.err.println("Loi" + e.toString());
            e.printStackTrace();
        }
    }
}
