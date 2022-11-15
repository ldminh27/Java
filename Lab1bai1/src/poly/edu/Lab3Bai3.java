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
public class Lab3Bai3 {
    // sort array
    public static void sort(int[] a)
    {
        for (int i = 0; i < a.length - 1; i++)
        {
            for (int j = i + 1; j < a.length; j++)
            {
                if (a[i] > a[j])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    // bai 3
    public static void nhap_mang()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang: ");
        int n = sc.nextInt(), sum = 0, count = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
        {
            System.out.println("Nhap phan tu thu " + (i + 1) + ": ");
            a[i] = new Scanner(System.in).nextInt();
            if (a[i] % 3 == 0)
            {
                sum += a[i];
                count++;
            }
        }
        sort(a);
        System.out.println("Mang vua nhap: ");
        for (int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.printf("\nPhan tu nho nhat: %d", a[0]);
        System.out.printf("\nTrung binh cong so chia het cho 3: %.2f\n", (float) (sum / count));
    }

    public static void main(String[] args) throws Exception {
        nhap_mang();
    }
}
