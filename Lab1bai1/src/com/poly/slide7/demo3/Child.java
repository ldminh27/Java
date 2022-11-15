/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.slide7.demo3;

/**
 *
 * @author LeMinh
 */
public class Child extends Dad{
    
    String lastName;
    public Child(String lastName){
        System.out.println(this.firstName);
        this.lastName = "Nghia";
    }
    
    public static void main(String[] args) {
        Child child = new Child("Nghia");
        child.getHo();
    }
}
