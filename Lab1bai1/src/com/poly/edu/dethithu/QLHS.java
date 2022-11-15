/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.edu.dethithu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author LeMinh
 */
public class QLHS {
    ArrayList<HocSinh> listHocSinh = new ArrayList<HocSinh>();
    
//    1.Nhập danh sách đối tượng
    public void nhap(){        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhap ID hoc sinh: ");        
        String id = sc.nextLine();
        
        System.out.println("Nhap ma hoc sinh: "); 
        Integer MaHS = sc.nextInt();
        
        System.out.println("Nhap truong hoc: "); 
        String truonghoc = sc.next();
        
        HocSinh hocsinh = new HocSinh();
        hocsinh.setID(id);
        hocsinh.setMaHS(MaHS);
        hocsinh.setTruongHoc(truonghoc);
        
        listHocSinh.add(hocsinh);
        
        System.out.println("Nhap tiep (1-Y/0-N)?: ");
        Integer traloi = sc.nextInt();
        if(traloi == 1){
            nhap();
        }
    }
    
//    2.Xuất danh sách đối tượng
    public void xuat(){
        for (HocSinh hocsinh : listHocSinh) {
            hocsinh.inThongTin();
        }
    }
//    3.Tìm mã sinh viên theo khoảng do người dùng nhập
    public void tim(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma hoc sinh: ");
        Integer mahsNhap = sc.nextInt();
        for (HocSinh hocsinh : listHocSinh) {
            Integer mahs = hocsinh.getMaHS();
            if(mahsNhap == mahs){
                hocsinh.inThongTin();
            }
        }
    }
//    4.Sắp xếp theo theo A-Z theo TruongHoc(1 đ)
    public void sapxep(){
        Collections.sort(listHocSinh, new Comparator<HocSinh>() {
        
            @Override
            public int compare(HocSinh o1, HocSinh o2){
                return o1.getTruongHoc().compareTo(o2.getTruongHoc());               
            }
        });
    }    
}
