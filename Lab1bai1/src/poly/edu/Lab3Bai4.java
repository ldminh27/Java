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
public class Lab3Bai4 {
    static String IsName[] = new String[50];
    static double IsPoint[] = new double [50];
    static int index = 0;
    static void inputs(){
        Scanner sc;
        String choice = "y";
        do {
            sc = new Scanner(System.in);
            System.out.println("Input Name: ");
            IsName[index] = sc.nextLine();
            System.out.println("Input Point: ");
            IsPoint[index] = sc.nextDouble();
            index++;
            System.out.println("Continue?(Y/N)");
            choice = sc.next();
        } while (choice.equalsIgnoreCase("y"));
    }
    static void outputs(){
        for (int i = 0; i < index; i++){
            System.out.println("Name: "+ IsName[i] 
                    + " - Point: "+ IsPoint[i]
                    + " - Hoc Luc: "+ hocLuc(IsPoint[i]));
        }
    }
    
    static String hocLuc(double point){
        String xepLoai = "";
        if (point < 5) {
            xepLoai = "YEU";
        }else{
            //ko yeu
            if (point < 6.5) {
                xepLoai = "TRUNG BINH";
            }else{
                //kha, gioi, xuat sac
                if (point < 7.5 ) {
                    xepLoai = "KHA";
                }else{
                    if(point < 9){
                        xepLoai = "GIOI";
                    }else{
                        xepLoai = "XUAT SAC";
                    }
                }
            }
        }
        
        return xepLoai;    
    }
    public static void sapXep(){
        System.out.println("-----Sau khi sap xep -----");
        for (int i = 0; i <index -1; i++){
            for(int j = i + 1; j < index; j++){
                if (IsPoint[i] > IsPoint[j]){
                    double tempPoint = IsPoint[i];
                    IsPoint[i] = IsPoint[j];
                    IsPoint[j] = tempPoint;
                    //hooan vi name
                    String tempName = IsName[i];
                    IsName[i] = IsName[j];
                    IsName[j] = tempName;
                }
            }
        }//ket thuc for
        outputs();
    }
    
    
    
    public static void main(String[] args) {
        inputs();
        outputs();
        sapXep();
    }
}
