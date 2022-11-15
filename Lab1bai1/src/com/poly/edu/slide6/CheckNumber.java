/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.edu.slide6;

/**
 *
 * @author LeMinh
 */
public class CheckNumber {
    public static void main(String[] args) {
        
        String input = "354403733";
        
        System.out.println("input ok = :" + input.matches("\\d+"));
        
        String input2 = "354403733ssss";
        
        System.out.println("input ok = :" + input2.matches("\\d+"));
    }
}
