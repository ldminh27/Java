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
public class Lab1Bai2 {
    public static void main(String[] args) {
        System.out.println("CHUONG TINH HINH CHU NHAT");
        Scanner sc = new Scanner(System.in);
        double cd, cr, cv, dt;
        System.out.println("Nhap chieu dai: ");
        cd = sc.nextDouble();
        System.out.println("Nhap chieu rong: ");
        cr = sc.nextDouble();
        cv = 2*(cd + cr);
        dt = cd * cr;
        System.out.println("Chu vi: "+ cv);
        System.out.println("Dien tich : "+ dt);
        double min = Math.min(cd, cr);
        System.out.println("Canh nho nhat: "+ min);
    }
}
