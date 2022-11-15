/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polyit;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author baontq
 */
public class MapDemo {

    public static void main(String[] args) {
        Map<String, Student> map = new HashMap<>();
        Student sv = new Student("Tuan", "IT", 5);
        map.put(sv.getName(), sv);
        
        Set<String> keys = map.keySet();
        
        for (String key : keys) {
            Student sv1 = map.get(key);
            System.out.println("Ho ten: " + sv1.getName());
            System.out.println("Hoc luc: " + sv1.getHocLuc());
        }
    }
}
