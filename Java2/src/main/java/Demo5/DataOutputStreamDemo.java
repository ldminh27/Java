package Demo5;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataOutputStreamDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("D:/DataFileOutputStreamDemo.txt");
            DataOutputStream dos = new DataOutputStream(fos);

            dos.writeUTF("Hello DataOutputStream");
            dos.writeInt(8);
            dos.writeBoolean(true);
            dos.writeDouble(7.5);

            //dòng kết nối với file
            
            dos.close();
            fos.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(DataOutputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DataOutputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
