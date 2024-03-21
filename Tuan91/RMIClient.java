
package Tuan91;

import java.rmi.Naming;
import java.util.List;


public class RMIClient {
    public static void main(String[] args) {
        try {
            //Tim doi tuong
            StudentService obj = (StudentService)
                    Naming.lookup("//localhost: 1097/StudentService");
            //Goi cac phuong thuc tu xa
            obj.addStudent("Nguyen Ngoc Hai", 24);
            obj.addStudent("Dang Bich Thuy", 23);
            List<Student> students = obj.getAllStudent();
            //in ra ket qua
            System.out.println("List Sinh Vien");
            for(Student std:students)
            {
                System.out.println("Name: " + std.getName() +
                        " - Age: " + std.getAge());
            }
            //Xoa ket qua
            System.out.println("Xoa ket qua");
            obj.removeStudent("Dang Bich Thuy");
            System.out.println("Sau khi xoa");
            for(Student std:students)
            {
                System.out.println("Name: " + std.getName() +
                        " - Age: " + std.getAge());
            }
        } catch (Exception e) {
            System.err.println("Loi: " + e.toString());
            e.printStackTrace();
        }
    }
}
