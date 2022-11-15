/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.java2.lab1;

import java.util.Scanner;

/**
 *
 * @author LeMinh
 */
public class MainClass2 {

    public static void main(String[] args) {
        Product a[] = new Product[3];
        for (int i = 0; i < 3; i++) {
            if (i != 0) {
                Scanner sc = new Scanner(System.in);
                System.out.printf("Nhap ten san pham %d: ", i + 1);
                String name = sc.nextLine();
                System.out.printf("Nhap gia san pham %d: ", i + 1);
                double price = sc.nextDouble();
                a[i] = new Product(name, price);
            } else {
                Scanner sc = new Scanner(System.in);
                System.out.printf("Nhap ten san pham %d: ", i + 1);
                String name = sc.nextLine();
                System.out.printf("Nhap gia san pham %d: ", i + 1);
                double price = sc.nextDouble();
                a[i] = new NoTaxProduct(name, price);
            }

        }
        for (int i = 0; i < 3; i++) {
            System.out.printf("Ten san pham : %s - Gia san pham: %.2f - Thue: %.2f \n", a[i].getName(), a[i].getPrice(), a[i].getImportTax());
        }
    }
}
