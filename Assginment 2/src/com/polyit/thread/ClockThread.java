/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polyit.thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class ClockThread implements Runnable {

    JLabel clockLabel;

    public ClockThread(JLabel clockLabel) {
        this.clockLabel = clockLabel;
    }

    @Override
    public void run() {
        while (true) {
            Date now = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss aa");
            clockLabel.setText(dateFormat.format(now));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
    }

}
