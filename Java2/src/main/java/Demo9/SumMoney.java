/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo9;

/**
 *
 * @author LeMinh
 */
public class SumMoney {
    public static void main(String[] args) {
        //
        ParkingArea[] parkings = ParkingArea.values();

        for (ParkingArea pa : parkings) {
            System.out.println(pa);
        }
        // lay ra ten hang so
        ParkingArea pa1 = ParkingArea.valueOf("SUV");
        ParkingArea pa2 = ParkingArea.SEDAN;

        System.out.println(pa1);
        System.out.println(pa1);

        // lay ra gia tri ham so

        System.out.println(">> Money pa1: " + pa1.getMoney());
        System.out.println(">> Vi tri hang so: " + pa2.ordinal());
        System.out.println(">> So sanh 2 voi nhau: " + pa1.compareTo(pa2));

        //boxing: chuyen doi du lieu nguyen thuy sang wrapper class

        int int1 = 10;
        String str1 = "10";
        Integer integer1 = Integer.parseInt(str1);
        Integer integer2 = Integer.valueOf(int1);

        System.out.println(integer1);
        System.out.println(integer2);

        //unboxing: wrapper class sang du lieu nguyen thuy
        System.out.println(integer1.intValue());
        System.out.println(integer1.doubleValue());

        // Double, Float, Boolean, Long

        //Auto Boxing
        Integer integer3 = Integer.valueOf(100);
        int int3 = integer3;
        System.out.println(integer3);
        System.out.println(int3);
        
        //Auto Unboxing
        integer3++;
        int3++;
    }
}
