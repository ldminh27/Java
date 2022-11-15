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
public class Lab4Bai4 {
    private String tenSP;
    private double donGia;
    private double giamGia;

    public Lab4Bai4() {
    }

    public Lab4Bai4(String tenSP, double donGia, double giamGia) {
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        setTenSP(sc.nextLine());
        System.out.println("Gia san pham: ");
        setDonGia(sc.nextDouble());
        System.out.println("Giam gia: ");
        setGiamGia(sc.nextDouble());
    }
    public void output(){
        System.out.println("Ten SP: "+ getTenSP());
        System.out.println("Gia SP: "+ getDonGia());
        System.out.println("Giam Gia: "+ getGiamGia());
    }
    public static void main(String[] args) {
        Lab4Bai4 sp1 = new Lab4Bai4();
        System.out.println("------------------------------");
        sp1.input();
        System.out.println("------------------------------");
        sp1.output();
        System.out.println("------------------------------");
        //
        Lab4Bai4 sp2 = new Lab4Bai4("Samsung", 30000, 100);
        sp2.output();
        System.out.println("------------------------------");
    }
}