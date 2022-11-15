package Demo5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ObjectInputStreamDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("D:/ObjectOutputStreamDemo.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            // Student[] students = (Student[]) ois.readObject();
            List<Student> students = (List<Student>) ois.readObject();
            
            for(Student st: students){
                System.out.println("Name: " + st.getName());
                System.out.println("Marks: " + st.getMarks());
                System.out.println("Major: " + st.getMajor());
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ObjectInputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ObjectInputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ObjectInputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
