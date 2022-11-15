/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab1;

/**
 *
 * @author LeMinh
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("--------Spider--------");
        Spider s = new Spider(8);
        s.eat();
        System.out.println("--------Cat--------");
        Cat c = new Cat("Meo ba tu",4);
        c.eat();
        c.play();
        System.out.println("--------Fish--------");
        Fish f = new Fish(0);
        f.walk();
        f.eat();
    }
}
