/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.minhld_ph23123;

/**
 *
 * @author LeMinh
 */
public class ChuyenNganh {
    private String ten;
    private int maChuyenNganh;
    private int soGiangVien;

    public ChuyenNganh() {
    }

    public ChuyenNganh(String ten, int maChuyenNganh, int soGiangVien) {
        this.ten = ten;
        this.maChuyenNganh = maChuyenNganh;
        this.soGiangVien = soGiangVien;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getMaChuyenNganh() {
        return maChuyenNganh;
    }

    public void setMaChuyenNganh(int maChuyenNganh) {
        this.maChuyenNganh = maChuyenNganh;
    }

    public int getSoGiangVien() {
        return soGiangVien;
    }

    public void setSoGiangVien(int soGiangVien) {
        this.soGiangVien = soGiangVien;
    }
    
    
    
    public void inThongTin(){
        System.out.println("--------------------------------");
        System.out.println("Ten: " + ten);
        System.out.println("Ma chuyen nganh: " + maChuyenNganh);
        System.out.println("So giang vien: " + soGiangVien);
        System.out.println("--------------------------------");
    }
}
