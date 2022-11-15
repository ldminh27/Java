/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LeMinh
 */
public class FileOutputStreamDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("D:/FileOutputStreamDemo.txt");
            String txt = "Hello FileOutputStream";
            byte[] txtToByte = txt.getBytes();
            fos.write(txtToByte);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileOutputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileOutputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
