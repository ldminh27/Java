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
public class Nhanvien {
    private String maNV;
    private String hoTen;
    private double luong;

    // constructors
    public Nhanvien() {}
    public Nhanvien(String maNV, String hoTen, double luong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luong = luong;
    }
    
    // getters
    public double getThuNhap() {return luong;}
    public double getThueTN() {return (luong < 9000000) ? 0 : ((luong < 15000000) ? (luong * 0.1) : (luong * 0.12));}
    
    // nhap thong tin
    public void nhapThongTin() {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap ho ten nhan vien: ");
        this.hoTen = in.nextLine();
        System.out.print("Nhap ma nhan vien: ");
        this.maNV = in.nextLine();
        System.out.print("Nhap luong nhan vien: ");
        this.luong = in.nextDouble();
        in.close();
    }

    // xuat thong tin
    public void xuatThongTin() {
        System.out.println("MaNV: " + maNV);
        System.out.println("HoTen: " + hoTen);
        System.out.println("ThuNhap: " + luong);
        System.out.println("ThueTN: " + getThueTN());
    }
}
