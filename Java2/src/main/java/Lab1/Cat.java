/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab1;

/**
 *
 * @author LeMinh
 */
public class Cat extends Animal implements Pet{
    private String name;
    
    public Cat(String name, int legs){
        super(legs);
        this.name = name;
    }
     public String getName(){
         return name;
     }
     public void setName(String name){
         this.name = name;
     }

    @Override
    public void eat() {
        super.walk();
        System.out.println("Name: " + this.name);
        System.out.println("Cat eat mouse");
    }

    
    @Override
    public void play() {
        System.out.println("Cat playing football");
    }
     
}
