/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.testfinals;

/**
 *
 * @author LeMinh
 */
public class SV_UDPM extends SinhVien{
    private double diemJava;

    public SV_UDPM() {
    }

    public SV_UDPM(double diemJava) {
        this.diemJava = diemJava;
    }

    public SV_UDPM(int MaSV, String Ten, int NamSinh, double DiemCsharp, double diemJava) {
        super(MaSV, Ten, NamSinh, DiemCsharp);
        this.diemJava = diemJava;
    }

    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }

    @Override
    public void inThongTin() {
        super.inThongTin(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("Diem Java: " + getDiemJava());
    }  
}
