/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ASM;

/**
 *
 * @author LeMinh
 */
public class NhanVienHanhChinh extends NhanVien{
    private double ngayCong;

    public NhanVienHanhChinh(String ID, String hoTen, double luongCoBan, String phongBan, double ngayCong) {
        super(ID, hoTen, luongCoBan, phongBan);
        this.ngayCong = ngayCong;
    }

    public double getNgayCong() {
        return ngayCong;
    }

    public void setNgayCong(double ngayCong) {
        this.ngayCong = ngayCong;
    }

    @Override
    double getLuong() {
        return luongCoBan * ngayCong;
    }
}
