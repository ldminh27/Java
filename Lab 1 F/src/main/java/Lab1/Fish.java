/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab1;

/**
 *
 * @author LeMinh
 */
public class Fish extends Animal {
    public Fish(int legs) {
        super(legs);
    }
    @Override
    public void walk(){
        System.out.println("Ca khong the di va khong co chan");
    }

    @Override
    public void eat() {
        System.out.println("Ca an moi");
    }

}
