/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab1;

/**
 *
 * @author LeMinh
 */
public class Spider extends Animal{
    public Spider(int legs){
        super(legs);
    }
    @Override
    public void eat() {
        super.walk();
        System.out.println("Spider eat Flies");
    }
}
