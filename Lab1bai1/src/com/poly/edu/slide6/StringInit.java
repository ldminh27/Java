/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.edu.slide6;

/**
 *
 * @author LeMinh
 */
public class StringInit {
    public static void main(String[] args) {
        
        //c1
        String s1 = "Java";
        String s2 = "Java";
        
        System.out.println("\" Ket qua cach 1: \"");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        
        //c2
        String s3 = new String("Java");
        String s4 = new String("Java");
        
        System.out.println("\" Ket qua cach 2:  \"");
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));
    }
}
