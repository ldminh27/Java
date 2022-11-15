package Demo8;

public class MainEMoney {
    public static void main(String[] args) {
        EMoney em = new EMoney();
        Thread t1 = new Thread(){
            @Override
            public void run(){
                em.withdraw(100000);
            }
        };
        t1.start();
        
        Thread t2 = new Thread(){
            @Override
            public void run(){
                em.withdraw(200000);
            }
        };
        t2.start();
        
        Thread t3 = new Thread(){
            @Override
            public void run(){
                em.withdraw(300000);
            }
        };
        t3.start();
    }
}
