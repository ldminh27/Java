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
public class Lab2Bai1 {

    public static void main(String[] args) {
        giaiPTB1();
    }//ket thuc main

    public static void giaiPTB1() {
        //bx + c = 0
        Scanner sc = new Scanner(System.in);
        double b, c, x;
        System.out.println("Nhap a:");
        b = sc.nextDouble();
        System.out.println("Nhap b:");
        c = sc.nextDouble();
        if (b == 0) {
            // vo so nghiem, vo nghiem
            if (c == 0) {
                System.out.println("Vo so nghiem");
            } else {
                System.out.println("Vo nghiem");
            }
        } else {
            x = -c / b;
            System.out.println("x= " + x);
        }
    }
}
