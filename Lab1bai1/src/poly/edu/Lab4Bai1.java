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
public class Lab4Bai1 {
    public String tenSP;
    public double donGia;
    public double giamGia;
    public void input (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten san pham: ");
        tenSP = sc.next();
        System.out.println("Nhap don gia: ");
        donGia = sc.nextDouble();
        System.out.println("Nhap giam gia: ");
        giamGia = sc.nextDouble();
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
    public static void main(String[] args) {
        Lab4Bai1 sp = new Lab4Bai1();
        sp.input();
        sp.output();
    }
}
