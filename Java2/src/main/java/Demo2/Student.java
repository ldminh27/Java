/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo2;

/**
 *
 * @author LeMinh
 */
public class Student {
    private String studentNo;
    private String studentName;
    private String gender;
    private String className;
    private double finalGrade;
    private boolean status;

    public Student() {
    }

    public Student(String studentNo, String studentName, String gender, String className, double finalGrade, boolean status) {
        this.studentNo = studentNo;
        this.studentName = studentName;
        this.gender = gender;
        this.className = className;
        this.finalGrade = finalGrade;
        this.status = status;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(double finalGrade) {
        this.finalGrade = finalGrade;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
