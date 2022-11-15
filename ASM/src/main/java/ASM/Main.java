/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ASM;

/**
 *
 * @author LeMinh
 */
public class Main {
    public static void main(String[] args) {
        DanhSachNhanVien dsnv = new DanhSachNhanVien();
        NhanVien nv01 = new NhanVienHanhChinh("NV01", "Cuong", 5000, "Hanh Chinh", 3);
        NhanVien nv02 = new NhanVienHanhChinh("NV02", "Nam", 4000, "Hanh Chinh", 3);
        NhanVien nv03 = new NhanVienHanhChinh("NV03", "Hoang", 7000, "Hanh Chinh", 4);
        NhanVien nv04 = new NhanVienKinhDoanh("NV04", "Trong", 9000, "Kinh Doanh", 50000);
        NhanVien nv05 = new NhanVienKinhDoanh("NV05", "Van", 8966, "Kinh Doanh", 40000);
        NhanVien nv06 = new NhanVienKinhDoanh("NV06", "Dung", 4578, "Kinh Doanh", 20000);
        dsnv.list.add(nv01);
        dsnv.list.add(nv02);
        dsnv.list.add(nv03);
        dsnv.list.add(nv04);
        dsnv.list.add(nv05);
        dsnv.list.add(nv06);
        dsnv.menu();
    }
}
