/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu;

import java.util.Scanner;

/**
 *
 * @author LeMinh
 */
public class Lab2Bai3 {
    public static void main(String[] args) {
        tinhTienDien();
    }//ket thuc main
    
    public static void tinhTienDien(){
        Scanner sc = new Scanner(System.in);
        int soDien, tienDien = 0;
        System.out.println("Nhap so dien: ");
        soDien = sc.nextInt();
        if (soDien < 50) {
            tienDien = soDien * 1000;
        } else {
            tienDien = 50 * 1000 + (soDien - 50) * 1200;
        }
        //in
        System.out.println("Tien Dien: "+ tienDien);
    }
}
