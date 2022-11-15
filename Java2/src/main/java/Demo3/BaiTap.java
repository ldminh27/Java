/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo3;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author LeMinh
 */
public class BaiTap {
    public static void main(String[] args) {
        Set<String> setInt = new HashSet<>();
        setInt.add("PH02575");
        setInt.add("PH17343");
        setInt.add("PH33395");
        setInt.add("PH81772");
        
        Set<String> setInt2 = new HashSet<>();
        setInt2.add("PH22233");
        setInt2.add("PH028345");
        setInt2.add("PH02575");
        
        //Cau1
        System.out.println("Dem cac phan tu trong Set1 va Set2");
        //Cau2
        setInt.remove("PH17343");
        System.out.println("Xoa phan tu PH17343 trong Set1" + setInt.toString());
        
        //Cau3
        System.out.println("Kiem tra phan tu PH22233 co xuat hien trong Set1 hay khong: " + setInt.contains("PH22233"));
        System.out.println("Kiem tra phan tu PH22233 co xuat hien trong Set2 hay khong: " + setInt2.contains("PH22233"));
    }
}
