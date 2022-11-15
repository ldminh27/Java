/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestNew;

import java.io.Serializable;

/**
 *
 * @author USER
 */
public class DienThoai implements Serializable{
    private String TenSp;
    private String hangSP;
    private double giaSP;
    private String trangthai;

    public DienThoai() {
    }

    public DienThoai(String TenSp, String hangSP, double giaSP, String trangthai) {
        this.TenSp = TenSp;
        this.hangSP = hangSP;
        this.giaSP = giaSP;
        this.trangthai = trangthai;
    }

    public String getTenSp() {
        return TenSp;
    }

    public void setTenSp(String TenSp) {
        this.TenSp = TenSp;
    }

    public String getHangSP() {
        return hangSP;
    }

    public void setHangSP(String hangSP) {
        this.hangSP = hangSP;
    }

    public double getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(double giaSP) {
        this.giaSP = giaSP;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }
    
    

  


    

    
    
}
