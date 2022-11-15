/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu;

import java.util.Scanner;

/**
 *
 * @author LeMinh
 */
public class Lab1Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chuong trinh quan ly sinh vien");
        String name;
        int age;
        double html, php, java1, sum, avg;
        System.out.println("input name:");
        name = sc.nextLine();
        System.out.println("input age:");
        age = sc.nextInt();
        System.out.println("input mark HTML:");
        html = sc.nextDouble();
        System.out.println("input mark PHP:");
        php = sc.nextDouble();
        System.out.println("input mark Java1");
        java1 = sc.nextDouble();
        sum = html + php + java1;
        avg = sum/3;
        System.out.println("Name : "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Sum: "+ sum);
        System.out.println("AVG: "+ avg);
    }
}
