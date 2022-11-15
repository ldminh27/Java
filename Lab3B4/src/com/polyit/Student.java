/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polyit;

/**
 *
 * @author baontq
 */
public class Student {
    private String name, major;
    private double marks;

    public Student(String name, String major, double marks) {
        this.name = name;
        this.major = major;
        this.marks = marks;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
    
    public String getHocLuc() {
        if (marks >= 9) {
            return "Xuất sắc";
        }else if(marks >= 7.5) {
            return "Giỏi";
        }else if (marks >= 6.5) {
            return "Khá";
        }else if (marks >= 5) {
            return "Trung bình";
        }else if(marks >= 3) {
            return "Yếu";
        }else {
            return "Kém";
        }
    }
    
    public boolean isBonus() {
        return marks >= 7.5;
    }
    
}
