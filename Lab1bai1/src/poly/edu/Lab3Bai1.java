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
public class Lab3Bai1 {
    public static void main(String[] args) {
        int temp;
        boolean isPrime = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số cần kiểm tra: ");
        int number=sc.nextInt();
        sc.close();
        for(int i = 2; i <= number/2; i++)
        {
            temp = number%i;
            if(temp == 0)
            {
                isPrime = false;
                break;
            }
        }
        if(isPrime)
            System.out.println(number + " Là số nguyên tố!");
        else
            System.out.println(number + " Không phải là số nguyên tố!");
    }
}
