/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.minhld_ph23123;

import java.util.Scanner;

/**
 *
 * @author LeMinh
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLCN qlcn = new QLCN();
        while(true) {
            int choose = sc.nextInt();
            switch (choose) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    qlcn.nhap();
                    showMenu();
                    break;
                case 2:
                    qlcn.xuat();
                    showMenu();
                    break;
                case 3:
                    qlcn.tim();
                    showMenu();
                    break;
                case 4:
                    qlcn.sapxep();
                    showMenu();
                    break;
                default:
                    System.out.println("Sai cu phap");
                    break;
            }
        }
    }
    
    public static void showMenu() {
        System.out.println("0. thoat"); 
        System.out.println("1. nhap danh sach doi tuong");
        System.out.println("2. xuat danh sach doi tuong");
        System.out.println("3. tim chuyen nganh theo ma");
        System.out.println("4. sap xep theo so giang vien");
   }
}
