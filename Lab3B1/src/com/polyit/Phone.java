/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polyit;

/**
 *
 * @author LeMinh
 */
public class Phone {
    private String name;
    private double Price;
    private String trademark;

    public Phone() {
    }

    public Phone(String name, double Price, String trademark) {
        this.name = name;
        this.Price = Price;
        this.trademark = trademark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

}
