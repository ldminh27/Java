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
public class Lab1Bai3 {
    public static void main(String[] args) {
        System.out.println("The tich khoi lap phuong");
        Scanner sc = new Scanner(System.in);
        int canh, theTich;
        System.out.println("Nhap vao canh: ");
        canh = sc.nextInt();
        theTich = canh * canh * canh;
        System.out.println("The tich: "+ theTich);
    }
}
