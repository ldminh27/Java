package com.polyit;

import java.io.Serializable;

/**
 *
 * @author MSI
 */

public class Student implements Serializable{

    private String name;
    private float mark;
    private String major;

    public Student(String name, float mark, String major) {
        this.name = name;
        this.mark = mark;
        this.major = major;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getGrade() {
        if (mark < 3) {
            return "Kém";
        }
        if (mark < 5) {
            return "Yếu";
        }
        if (mark < 6.5) {
            return "Trung bình";
        }
        if (mark < 7.5) {
            return "Khá";
        }
        if (mark < 9) {
            return "Giỏi";
        }
        return "Xuất sắc";
    }

}
