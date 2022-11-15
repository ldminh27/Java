/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LeMinh
 */
public class Lab5Bai1 {
    
    public static void main(String[] args) {
        ArrayList<Double> arrDouble = new ArrayList<>();
        arrDouble = nhapMang();
        xuatMang(arrDouble);
    }
    
    public static ArrayList<Double> nhapMang() {
        ArrayList<Double> arrDouble1 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Nhap vao so : ");
            Double x = sc.nextDouble();
            arrDouble1.add(x);
            sc.nextLine();
            System.out.println("Nhap them (Y/N)");
            if(sc.nextLine() .equalsIgnoreCase("N")){
                break;
            }
        }
        return arrDouble1;
    }
    
    public static void xuatMang(ArrayList<Double> arrayDouble2){
        System.out.println("Cac gia tri cua mang: ");
        double tong = 0;
        for(Double d:arrayDouble2){
            System.out.println(d + "\t");
            tong = tong + d;
        }
        System.out.println("Tong cua mang: " + tong);
    }
}