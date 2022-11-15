package Demo8;

import java.util.logging.Level;
import java.util.logging.Logger;

public class EMoney {
    int currentMoney = 20000;

    public synchronized void withdraw(int money) {
        System.out.println("Ban dang rut so tien la: " + money);
        if (currentMoney < money) {
            System.out.println("Bot si di nap tien vao =))");
        }
        try {
            wait();
        } catch (InterruptedException ex) {
            Logger.getLogger(EMoney.class.getName()).log(Level.SEVERE, null, ex);
        }
        currentMoney = currentMoney - money;
        //currentMoney -= money
        System.out.println("Ban da rut tien thanh cong, so tien con la la: " + currentMoney);
    }
    public synchronized void deposit(int money){
        System.out.println("Ban dang nap tien: " + money);
        currentMoney = currentMoney + money;
        //currentMoney += money
        System.out.println("So tien hien tai cua ban la: " + currentMoney);
        notify();
    }
}
