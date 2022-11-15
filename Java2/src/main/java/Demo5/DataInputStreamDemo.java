package Demo5;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataInputStreamDemo {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("D:/DataFileOutputStreamDemo.txt");
            DataInputStream dis = new DataInputStream(fis);

            String name = dis.readUTF();
            int mark = dis.readInt();
            boolean isStudent = dis.readBoolean();
            double finalGrade = dis.readDouble();

            System.out.println("Name: " + name);
            System.out.println("Mark: " + mark);
            System.out.println("IsStudent: " + isStudent);
            System.out.println("FinalGrade: " + finalGrade);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(DataInputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DataInputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
