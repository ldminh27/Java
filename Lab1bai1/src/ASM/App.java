/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ASM;

import java.util.Scanner;

/**
 *
 * @author LeMinh
 */
public class App {
    public static void main(String[] args) {
        showMenu();
    }
    
    public static void showMenu() {
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("1. Nhap danh sach nhan vien");
            System.out.println("2. Xuat danh sach nhan vien");
            System.out.println("3. Tim kiem nhan vien theo ma");
            System.out.println("4. Xoa nhan vien theo ma");
            System.out.println("5. Cap nhat thong tin nhan vien");
            System.out.println("6. Tim nhan vien theo khoang luong");
            System.out.println("7. Sap xep nhan vien theo ho va ten");
            System.out.println("8. Sap xep nhan vien theo thu nhap");
            System.out.println("9. Xuat 5 nhan vien co thu nhap cao nhat");
            System.out.println("10. Thoat chuong trinh");
            System.out.print("Nhap lua chon cua ban: ");
            run(in.nextInt());
        } while (true);
    }

    public static void run(int choose) {
        // clear the screen
        for (int i = 0; i < 50; i++) {System.out.println();}
        switch (choose) {
            case 1:
                System.out.println("1. Nhap danh sach nhan vien");
                // goi ham
                break;
            case 2:
                System.out.println("2. Xuat danh sach nhan vien");
                // goi ham
                break;
            case 3:
                System.out.println("3. Tim kiem nhan vien theo ma");
                // goi ham
                break;
            case 4:
                System.out.println("4. Xoa nhan vien theo ma");
                // goi ham
                break;
            case 5:
                System.out.println("5. Cap nhat thong tin nhan vien");
                // goi ham
                break;
            case 6:
                System.out.println("6. Tim nhan vien theo khoang luong");
                // goi ham
                break;
            case 7:
                System.out.println("7. Sap xep nhan vien theo ho va ten");
                // goi ham
                break;
            case 8:
                System.out.println("8. Sap xep nhan vien theo thu nhap");
                // goi ham
                break;
            case 9:
                System.out.println("9. Xuat 5 nhan vien co thu nhap cao nhat");
                // goi ham
                break;
            case 10:
                System.out.println("Bye Bye...");
                System.exit(0);
                break;
            default:
                System.out.println("Nhap sai, vui long nhap lai");
                showMenu();
                break;
        }
    }
}
