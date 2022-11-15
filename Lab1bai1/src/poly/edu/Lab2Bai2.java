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
public class Lab2Bai2 {

    public static void main(String[] args) {
        giaiPTB2();

    }//ketthuc main
    
    public static void giaiPTB2(){
        Scanner sc = new Scanner(System.in);
        //bx + c = 0
        double a, b, c, x1, x2;
        double delta = 0;
        System.out.println("Nhap a:");
        a = sc.nextDouble();
        System.out.println("Nhap b:");
        b = sc.nextDouble();
        System.out.println("Nhap c:");
        c = sc.nextDouble();
        if (a == 0) {
            System.out.println("Giai phuong trinh bac 1");
            if (b == 0) {
                // vo so nghiem, vo nghiem
                if (c == 0) {
                    System.out.println("Vo so nghiem");
                } else {
                    System.out.println("Vo nghiem");
                }
            } else {
                x1 = -c / b;
                System.out.println("x= " + x1);
            }
        } else {
            delta = b * b - 4 * a * c;
            System.out.println("delta: " + delta);
            if (delta <= 0) {
                if (delta < 0) {
                    System.out.println("Phuong trinh vo nghiem");
                } else {
                    System.out.println("Phuong trinh co nghiem kep");
                    x1 = x2 = -b / (2 * a);
                    System.out.println("x1: " + x1);
                    System.out.println("x2: " + x2);
                }
            } else {
                //tinh nghiem
                x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
                x2 = ((-b) - Math.sqrt(delta)) / (2 * a);

                System.out.println("x1: " + x1);
                System.out.println("x2: " + x2);
            }
        }
    }
}
