/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu;

import java.util.Scanner;

/**
 *
 * @author LeMinh
 */
public class Lab1Bai4 {
    public static void main(String[] args) {
        System.out.println("GIAI PHUONG TRINH BAC 2");
        Scanner sc = new Scanner(System.in);
        double a,b,c,denta,x1,x2;
//        a = 4; b = 6; c = -2;  
        System.out.println("Nhap a:");
        a = sc.nextDouble();
        System.out.println("Nhap b:");
        b = sc.nextDouble();
        System.out.println("Nhap c:");
        c = sc.nextDouble();
        denta = (b * b) - (4 * a * c);
        System.out.println("denta: "+ denta);
        x1 = (-b + Math.sqrt(denta))/(2*a);
        System.out.println("x1 = "+ x1);
        x2 = (-b - Math.sqrt(denta))/(2*a);
        System.out.println("x2 = "+ x2);
    }
}
