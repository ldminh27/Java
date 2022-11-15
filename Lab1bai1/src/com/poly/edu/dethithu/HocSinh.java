/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.edu.dethithu;

/**
 *
 * @author LeMinh
 */
public class HocSinh {
    private String ID;
    private int MaHS;
    private String TruongHoc;   
    
    public void inThongTin(){
        System.out.println("this");
    }

    @Override
    public String toString() {
        return "HocSinh{" + "ID=" + ID + ", MaHS=" + MaHS + ", TruongHoc=" + TruongHoc + '}';
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getMaHS() {
        return MaHS;
    }

    public void setMaHS(int MaHS) {
        this.MaHS = MaHS;
    }

    public String getTruongHoc() {
        return TruongHoc;
    }

    public void setTruongHoc(String TruongHoc) {
        this.TruongHoc = TruongHoc;
    }
}

