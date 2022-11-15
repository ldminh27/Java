/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thangnqph23069;

/**
 *
 * @author NQT
 */
public class Student {
    private String name,major;
    private Double marks;

    public Student(String name, String major, Double marks) {
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

    public Double getMarks() {
        return marks;
    }

    public void setMarks(Double marks) {
        this.marks = marks;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    public String getGrade(){
        if(marks<3){
            return "Kém";
        }
        if(marks<5){
            return "yếu";
        }
        if(marks<6.5){
            return "trung bình";
        }
        if(marks<7.5){
            return "Khá";
        }
        if(marks<9){
            return "giỏi";
        }
        return "Xuất sắc";
    }
}
