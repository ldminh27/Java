/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author LeMinh
 */

public class Lab5Bai2Demo {
//Nhap danh sach ho ten
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arrString = new ArrayList<String>();
        ArrayList<String> arrString2 = new ArrayList<String>();
        ArrayList<String> arrString3 = new ArrayList<String>();
        ArrayList<String> arrString4 = new ArrayList<String>();
        arrString = nhapMang();
        xuatMang(arrString);
        
        arrString2 = sapxepMangNN(arrString);
        xuatMang(arrString2);
        
        arrString3 = sapxepMangGD(arrString);
        xuatMang(arrString3);
        
        System.out.print("Họ tên bạn muốn xóa: ");
        String hoTen = sc.nextLine();
        arrString4 = xoaMangGD(arrString, hoTen);
        xuatMang(arrString4);
    }
//Nhập danh sách họ và tên
    public static ArrayList<String> nhapMang() {
        ArrayList<String> arrString = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Nhập vào họ tên: ");
            String x = sc.nextLine();
            arrString.add(x);
//            sc.nextLine();
            System.out.print("Nhập thêm (Y/N)?");
            if(sc.nextLine() .equalsIgnoreCase("N")){
                break;
            }
        }
        return arrString;
    }
//Xuất danh sách vừa nhập
    public static void xuatMang(ArrayList<String> arrString){
        System.out.println("Danh sách họ tên: ");
        for(String d:arrString){
            System.out.println(d + "\n");
        }
    }
    
//Xuất danh sách ngẫu nhiên
    public static ArrayList<String> sapxepMangNN(ArrayList<String> arrString){
        Collections.shuffle(arrString);
        return arrString;
    }
//Sắp xếp giảm dần và xuất danh sách
    public static ArrayList<String> sapxepMangGD(ArrayList<String> arrString){
        Collections.sort(arrString);
        Collections.reverse(arrString);
        return arrString;
    }
//Tìm và xóa họ tên nhập từ bàn phím
    public static ArrayList<String> xoaMangGD(ArrayList<String> arrString, String tenCanXoa){
        arrString.remove(tenCanXoa);
        return arrString;
    }
//Menu
    public static void menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Menu chương trình: ");
        System.out.println("1. Nhập danh sách họ tên");
        System.out.println("2. Hiển thi danh sách họ tên");
        System.out.println("3. Sắp xếp ngẫu nhiên");
        System.out.println("4. Sắp xếp giảm dần");
        System.out.println("5. Xóa tên");
        System.out.println("6. Thoát");
        System.out.print("Moi ban chon: ");
        int choice = sc.nextInt();
        switch (choice){
            case 1: 
                System.out.println("Nhập danh sách họ tên");
                break;
            case 2: 
                System.out.println("Hiển thị danh sách họ tên");
                break;
            case 3: 
                System.out.println("Sắp xếp ngẫu nhiên");
                break;
            case 4: 
                System.out.println("Sắp xếp giảm dần");
                break;
            case 5: 
                System.out.println("Xóa tên");
                break;
            case 6: 
                System.out.println("Thoát");
                System.exit(0);
                break;
        }
    }
}
