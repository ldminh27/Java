/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polyit;

import java.util.ArrayList;
import java.util.List;

public class MainClass2 {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();//mảng chứa dữ liệu ghi vào file
        List<Student> list1 = new ArrayList<>();//mảng chứa dữ liệu lấy được từ file
        String path = "students.dat";//Đường dẫn file
        //them đối tượng sinh viên vào mảng để ghi vào file
        list.add(new Student("Hoang", 5, "Biz"));
        list.add(new Student("Nam", 4, "Biz"));
        list.add(new Student("Truc", 1, "CNTT"));
        list.add(new Student("Mai", 7, "QTKD"));
        list.add(new Student("Duong", 3, "Data"));
       
        try {
            //Ghi dữ liệu vào file
            XFile.writeObj(path, list);
            
            //đọc dữ liệu từ file
            list1 = (List<Student>) XFile.readObj(path);
            for (Student sv1 : list1) {
                System.out.println("Name: " + sv1.getName());
                System.out.println("Mark: " + sv1.getMark());
                System.out.println("Major: " + sv1.getMajor());
                System.out.println("-----------------------");
            }

        } catch (Exception ex) {
            ex.getMessage();
        }

    }
}
