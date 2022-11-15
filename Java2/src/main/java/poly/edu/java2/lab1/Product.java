/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.java2.lab1;

/**
 *
 * @author LeMinh
 */
public class Product implements DAO{
    
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product() {
        name = "";
        price = 0;
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
    public double getImportTax(){
        return price * 0.1;
    }

    @Override
    public void insert() {
        System.out.println("Them moi thanh cong");
    }

    @Override
    public void update() {
        System.out.println("Cap nhat thanh cong");
    }

    @Override
    public void delete() {
        System.out.println("Xoa thanh cong");
    }

    @Override
    public void select() {
        System.out.println("Chon thanh cong");
    }
}
