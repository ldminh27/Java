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
public class Lab4Bai3 {
    private String tenSP;
    private double donGia;
    private double giamGia;

    public Lab4Bai3() {
    }

    public Lab4Bai3(String tenSP, double donGia, double giamGia) {
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public Lab4Bai3(String tenSP, double donGia) {
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = 0;
    }
    public void output(){
        System.out.println("Ten San Pham: "+ tenSP);
        System.out.println("Don Gia: "+ donGia);
        System.out.println("Giam gia: "+ giamGia);
        System.out.println("Thue nhap khau: "+ getThueNhapKhau());
    } 
    public double getThueNhapKhau(){
        return donGia * 0.1;
    }
    public void input (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten san pham: ");
        tenSP = sc.next();
        System.out.println("Nhap don gia: ");
        donGia = sc.nextDouble();
        System.out.println("Nhap giam gia: ");
        giamGia = sc.nextDouble();
    }
    public static void main(String[] args) {
        Lab4Bai3 sp1 = new Lab4Bai3("Iphone 13", 20000, 50);
        sp1.output();
        //
        System.out.println("------------------------------");
        Lab4Bai3 sp2 = new Lab4Bai3();
        sp2.input();
        System.out.println("------------------------------");
        sp2.output();
        System.out.println("------------------------------");
        //
        Lab4Bai3 sp3 = new Lab4Bai3();
        sp3.output();
    }
}
