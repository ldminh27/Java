/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.testfinals;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LeMinh
 */
public class QLSV {

    private ArrayList<SinhVien> list = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

//    1. Nhap sinh vien
    public void nhapSV() {
        String choice;
        do {
            list.add(new SinhVien(Integer.parseInt(getValue("ma sinh vien: ")), getValue("ten sinh vien: "), Integer.parseInt(getValue("nam sinh: ")), Double.parseDouble(getValue("diem C Sharp: "))));
            System.out.println("Nhap 1 de them sinh vien");
            System.out.println("Khac 1 de thoat chuc nang");
            choice = sc.nextLine();
        } while (choice.equals("1"));
    }
//    2. Xuat danh sach sinh vien

    public void xuatDSSV() {
        if (list.isEmpty()) {
            System.out.println("Danh sanh sinh vien trong !");
        } else {
            System.out.println("Danh sach sinh vien la: ");
            int count = 1;
            for (SinhVien sv : list) {
                System.out.println("Sinh vien thu " + count);
                sv.inThongTin();
                count++;
            }
        }
    }
//    3. Xuat danh sinh vien qua mon

    public void xuatDSSVquamon() {
        if (list.isEmpty()) {
            System.out.println("Danh sanh sinh vien trong !");
        } else {
            int count = 0;
            for (SinhVien sinhVien : list) {
                if (sinhVien.getDiemCsharp() >= 5) {
                    count++;
                    System.out.println("Sinh vien thu " + count);
                    sinhVien.inThongTin();
                }
            }
            if (count == 0){;
                System.out.println("Khong co sinh vien nao qua mon C Sharp trong danh sach");
            }
        }
    }
//    4. Tim sinh vien theo ma

    public void timSV() {
        if (list.isEmpty()) {
            System.out.println("Danh sanh sinh vien trong !");
        } else {
            int msv = Integer.parseInt(getValue("ma sinh vien can tim: "));
            for (SinhVien sinhVien : list) {
                if (sinhVien.getMaSV() == msv) {
                    System.out.println("Sinh vien can tim la: ");
                    sinhVien.inThongTin();
                    return;
                }
            }
            System.out.println("Khong tim thay sinh vien co ma: " + msv);
        }
    }
//    5. Ke thua

    public void kethua() {
        System.out.println("Nhap vao thong tin sinh vien UDPM: ");
        SV_UDPM udpm = new SV_UDPM(Integer.parseInt(getValue("ma sinh vien: ")), getValue("ten sinh vien: "), Integer.parseInt(getValue("nam sinh: ")), Double.parseDouble(getValue("diem C Sharp")), Double.parseDouble(getValue("diemJava: ")));
        System.out.println("Thong tin sinh vien UDPM vua nhap la: ");
        udpm.inThongTin();
    }

    private String getValue(String x) {
        System.out.println("Nhap vao " + x);
        return sc.nextLine();
    }
}
