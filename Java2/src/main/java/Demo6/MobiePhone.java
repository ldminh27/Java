/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo6;

import java.io.Serializable;

/**
 *
 * @author LeMinh
 */
public class MobiePhone implements Serializable{
   private String name;
   private double price;
   private String brand ;
   private boolean check;
   
    
   public MobiePhone() {
    
   }

    public MobiePhone(String name, double price, String brand, boolean check) {
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.check = check;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

}
