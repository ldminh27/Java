/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo8;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LeMinh
 */
public class CounterThread extends Thread{
    @Override
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.print(" " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(CounterThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
