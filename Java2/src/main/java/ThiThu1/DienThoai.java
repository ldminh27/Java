/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThiThu1;

import java.io.Serializable;

/**
 *
 * @author LeMinh
 */
public class DienThoai implements Serializable{
    private String TenSP, hang, trangThai;
    private double giaSP;

    public DienThoai() {
    }

    public DienThoai(String TenSP, String hang, String trangThai, double giaSP) {
        this.TenSP = TenSP;
        this.hang = hang;
        this.trangThai = trangThai;
        this.giaSP = giaSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public double getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(double giaSP) {
        this.giaSP = giaSP;
    }
    
}
