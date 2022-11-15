/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.edu.slide6;

/**
 *
 * @author LeMinh
 */
public class StringSplit {
    public static void main(String[] args) {
        String text = "Day la cau van mau de test bao nhieu tu";
        
        String[] term = text.split(" ");
        
        System.out.println(term.length);
        
        System.out.println(text.startsWith("Day"));
        
        System.out.println(text.toUpperCase());
    }
}
