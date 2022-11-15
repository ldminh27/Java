/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab1;

/**
 *
 * @author LeMinh
 */
abstract public class Animal {
    
    protected int legs;
    
    protected Animal (int legs){
        this.legs = legs;
    }
    
    abstract public void eat();
    
    public void walk(){
        System.out.println("So chan: " + this.legs);
    }
}
