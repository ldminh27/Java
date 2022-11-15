/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.minhld_ph23123;

/**
 *
 * @author LeMinh
 */
public class ChuyenNganhJava extends ChuyenNganh {
    private int soSinhVien;
    
//    constructors
    public ChuyenNganhJava(){}

    public ChuyenNganhJava(int soSinhVien) {
        this.soSinhVien = soSinhVien;
    }

    public ChuyenNganhJava(int soSinhVien, String ten, int maChuyenNganh, int soGiangVien) {
        super(ten, maChuyenNganh, soGiangVien);
        this.soSinhVien = soSinhVien;
    }
    
}
