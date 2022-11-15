/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polyit;

public class MainClass {
    public static void main(String[] args) {
        try {
            byte[] data = XFile.read("D:\\Data\\file1.txt");
            XFile.write("D:\\Data\\file2.txt", data);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
    }
}
