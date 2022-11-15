/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo;

/**
 *
 * @author LeMinh
 */
public class HinhChuNhat extends Hinh{
    private double chieudai;
    private double chieurong;

    public double getChieudai() {
        return chieudai;
    }

    public void setChieudai(double chieudai) {
        this.chieudai = chieudai;
    }

    public double getChieurong() {
        return chieurong;
    }

    public void setChieurong(double chieurong) {
        this.chieurong = chieurong;
    }
    @Override
    public double getChuVi() {
        return (chieudai + chieurong)* 2;
    }

    @Override
    public double getDienTich() {
        return chieudai * chieurong;
    }

    void getName(String hinh_chu_nhat) {
        
    }
    
}
