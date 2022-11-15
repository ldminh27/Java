/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo;

/**
 *
 * @author LeMinh
 */
public class HinhVuong extends Hinh{
    private double canh;

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }

    @Override
    public double getChuVi() {
        return canh * 4;
    }

    @Override
    public double getDienTich() {
        return canh * canh;
    }

    void getName(String hinh_vuong) {
        
    }
    
}
