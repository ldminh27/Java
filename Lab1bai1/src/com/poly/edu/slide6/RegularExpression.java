/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.edu.slide6;

import java.util.Scanner;

/**
 *
 * @author LeMinh
 */
public class RegularExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true){
            String phone = sc.nextLine();
            
            Boolean isOk =phone.matches("0[0-9]{9,10}");
            if(isOk){
                System.out.println("Ban da nhap dung");
            }else{
                System.err.println("Ban da nhap sai");
            }
        }
    }
}
