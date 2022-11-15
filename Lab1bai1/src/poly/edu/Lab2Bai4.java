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
public class Lab2Bai4 {

    public static void main(String[] args) {
        menu();
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
    
    public static void tinhTienDien(){
        Scanner sc = new Scanner(System.in);
        int soDien, tienDien = 0;
        System.out.println("Nhap so dien: ");
        soDien = sc.nextInt();
        if (soDien < 50) {
            tienDien = soDien * 1000;
        } else {
            tienDien = 50 * 1000 + (soDien - 50) * 1200;
        }
        //in
        System.out.println("Tien Dien: "+ tienDien);
    }
    
    public static void menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------------------");
        System.out.println("1. Giai phuong trinh bac 1");
        System.out.println("2. Giai phuong trinh bac 2");
        System.out.println("3. Tinh tien dien");
        System.out.println("4. Ket thuc");
        System.out.println("---------------------------");
        System.out.println("Ban chon chuc nang: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.println("Giai phuong trinh bac 1");
                giaiPTB1();
                menu();
            }
            case 2 -> {
                System.out.println("Giai phuong trinh bac 2");
                giaiPTB2();
                menu();
            }
            case 3 -> {
                System.out.println("Tinh tien dien");
                tinhTienDien();
                menu();
            }
            case 4 -> {
                System.out.println("Ket thuc");
                System.exit(0);
            }
        }
    }
}
