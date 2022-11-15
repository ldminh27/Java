package Demo5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ObjectOutputStreamDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("D:/ObjectOutputStreamDemo.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            // Student[] students = { new Student("Minh", 8, "Mobile"),
            //         new Student("Cuong", 10, "Java"),
            //         new Student("Thanh", 9, "UDPM") };

            // List<Student> listStudents = Arrays.asList(students);

            List<Student> listStudents = new ArrayList<>();
            
            listStudents.add(new Student("Minh", 8, "Mobile"));
            listStudents.add(new Student("Minh", 8, "Mobile"));
            listStudents.add(new Student("Minh", 8, "Mobile"));
            listStudents.add(new Student("Minh", 8, "Mobile"));
            listStudents.add(new Student("Minh", 8, "Mobile"));

            oos.writeObject(listStudents);
            oos.close();
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ObjectOutputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ObjectOutputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
