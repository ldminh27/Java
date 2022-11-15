/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.edu.slide6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author LeMinh
 */
public class QuanLySinhVien {
    static ArrayList<SVPoly> arrayList = new ArrayList<SVPoly>();
	
	public static void main(String[] args) {
		
		//1 menu
		//showMenu();
	
		
		//3 xu ly
		while (true) {
			
			showMenu();
			
			//2 nguoi dung chon
			Scanner scanner = new Scanner(System.in);
			int choose = scanner.nextInt();
			System.out.println(choose);
			
			switch (choose) {
			case 1: {
				System.out.println("1.Nhập sinh viên");
				System.out.println("1.Nhập ten");
				String hoten = scanner.next();
				
				System.out.println("2.Nhập diem");
				Double diem = scanner.nextDouble();
				
				SVPoly poly = new SVPoly();
				poly.setDiemTB(diem);
				poly.setHoten(hoten);
				
				arrayList.add(poly);
				break;
			}
			case 2: {
				for (SVPoly sv : arrayList) {
					System.out.println("Hoten: " + sv.getHoten() + " - " + sv.getDiemTB());
				}
				break;
			}
			case 6: {
				Collections.sort(arrayList, new Comparator<SVPoly>() {
					@Override
					public int compare(SVPoly o1, SVPoly o2) {
						return o1.getDiemTB().compareTo(o2.getDiemTB());
					}
				});
				break;
			}
			case 7: {
				Collections.sort(arrayList, new Comparator<SVPoly>() {
					@Override
					public int compare(SVPoly o1, SVPoly o2) {
						return o2.getDiemTB().compareTo(o1.getDiemTB());
					}
				});
				break;
			}
			case 8: {
				Collections.sort(arrayList, new Comparator<SVPoly>() {
					@Override
					public int compare(SVPoly o1, SVPoly o2) {
						int compareTen = o1.getHoten().compareTo(o2.getHoten());
						if(compareTen == 0) {
							return o1.getDiemTB().compareTo(o2.getDiemTB());
						} else {
							return compareTen;
						}
					}
				});
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choose);
			}
		}
	}

	private static void showMenu() {
		// TODO Auto-generated method stub
		System.out.println("Menu, ban hay lua chon");
		System.out.println("1.Nhập danh sách sinh viên");
		System.out.println("2.Xuất danh sách sinh viên đã nhập");
		System.out.println("3.Xuất danh sách sinh viên theo khoảng điểm");
		System.out.println("4.Tìm sinh viên theo họ tên");
		System.out.println("5.Tìm và sửa sinh viên theo họ tên");
		System.out.println("6.Sap xep sinh vien theo diem thap -> cao");
		System.out.println("7.Sap xep sinh vien theo diem cao -> thap");
		System.out.println("8.Sap xep sinh vien theo ten, diem");
	}
}
