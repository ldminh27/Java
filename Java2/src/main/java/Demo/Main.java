/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo;

/**
 *
 * @author LeMinh
 */
public class Main {
    public static void main(String[] args) {
        HinhVuong hv = new HinhVuong();
        hv.setCanh(5);
        System.out.println("Chu vi hv:" + hv.getChuVi());
        
        System.out.println("Dien tich hv: " + hv.getDienTich());
        
        System.out.printf("Chu vi hv02: %.2f \n", hv.getChuVi());
        
        hv.getName("hinh vuong");
        
        //HINH CHU NHAT
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.setChieudai(2);
        hcn.setChieurong(3);
        System.out.println("Chu vi hcn: " + hcn.getChuVi());
        System.out.println("Dien tich hcn: " + hcn.getDienTich());
        
        hcn.getName("hinh chu nhat");
    }
}
