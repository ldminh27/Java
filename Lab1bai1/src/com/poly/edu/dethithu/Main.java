/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.edu.dethithu;

import java.util.Scanner;

/**
 *
 * @author LeMinh
 */
public class Main {
    public static void main(String[] args) {
        showMenu();
        Scanner sc = new Scanner(System.in);
        QLHS qlhs = new QLHS();
        while(true){
            int choose = sc.nextInt();
            switch(choose){
                case 1: {
                    qlhs.nhap();
                    showMenu();
                    break;
                }
                case 2: {
                    qlhs.xuat();
                    showMenu();
                    break;
                }
                case 3: {
                    qlhs.tim();
                    showMenu();
                    break;
                }
                case 4: {
                    qlhs.sapxep();
                    showMenu();
                    break;
                }
                case 5: {
                    showMenu();
                    break;
                }
                case 0: {
                    System.exit(0);
                    break;
                }
                default:                
            }
        }
    }
    private static void showMenu(){
       System.out.println("\nMenu chuong trinh");
       System.out.println("1. Nhap danh sach doi tuong");
       System.out.println("2. Xuat danh sach doi tuong");
       System.out.println("3. Tim ma sinh vien theo khoang do nguoi dung nhap");
       System.out.println("4. Sap xep theo A-z theo TruongHoc");
       System.out.println("5. Ke thua");
       System.out.println("0. Thoat");
       System.out.print("Moi ban chon: ");
    }
}

    

