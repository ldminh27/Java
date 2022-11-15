/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.minhld_ph23123;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author LeMinh
 */
public class QLCN {
    ArrayList<ChuyenNganh> listQlcs = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
//    1. nhập danh sách đối tượng
    public void nhap() {
        System.out.println("Nhap vao ho va ten: ");
        String name = sc.nextLine();
        System.out.println("Nhap vao ma chuyen nganh: ");
        int maCn = sc.nextInt();
        System.out.println("Nhap so giang vien: ");
        int soGv = sc.nextInt();
        ChuyenNganh temp = new ChuyenNganh(name, maCn, soGv);
        listQlcs.add(temp);
        System.out.println("Tiep hay ko? (1-y 0-n)");
        int ans = sc.nextInt();
        if (ans == 1) {
            nhap();
        }
    }
//    2. xuất danh sách đối tượng
    public void xuat(){
        for(ChuyenNganh chuyenNganh : listQlcs) {
            chuyenNganh.inThongTin();
        }
    }
//    3. tìm theo chuyên ngành   
    public void tim() {
        int maCn = sc.nextInt();
        for(ChuyenNganh chuyenNganh : listQlcs) {
            if (chuyenNganh.getMaChuyenNganh() == maCn) {
                chuyenNganh.inThongTin();
            }
        }
    }
//    4. sắp xếp danh sách theo số giảng viên
    public void sapxep(){
        xuat();
    }
//    5. ke thua    
    public void kethua(){
        
    }
}
