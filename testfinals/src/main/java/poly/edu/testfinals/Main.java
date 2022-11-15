/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.testfinals;

import java.util.Scanner;

/**
 *
 * @author LeMinh
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        QLSV qlsv = new QLSV();
        do {
            System.out.println("------------------Menu------------------");
            System.out.println("1. Nhap sinh vien");
            System.out.println("2. Xuat danh sach sinh vien");
            System.out.println("3. Xuat danh sinh vien qua mon");
            System.out.println("4. Tim sinh vien theo ma");
            System.out.println("5. Ke thua");
            System.out.println("0. Thoat");
            System.out.println("----------------------------------------");
            System.out.println("Moi ban chon chuc nang: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    qlsv.nhapSV();
                    break;
                case 2:
                    qlsv.xuatDSSV();
                    break;
                case 3:
                    qlsv.xuatDSSVquamon();
                    break;
                case 4:
                    qlsv.timSV();
                    break;
                case 5:
                    qlsv.kethua();
                    break;
                case 0:
                    System.out.println("Xin chao va hen gap lai!");
                    break;
                default:
                    System.out.println("Yeu cau nhap lai chuc nang");
            }
        } while (choice != 0);
    }
}
