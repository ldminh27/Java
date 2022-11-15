/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java02_cp17310;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * @author THUYVU
 */
public class DemoCollection {
    public static void main(String[] args) {
//        // LIST
//        List<Integer> listInt = new ArrayList<>();
//        // Them phan tu vao list
//        listInt.add(1);
//        listInt.add(2);
//        listInt.add(1);
//        listInt.add(4);
//        listInt.add(5);
//        listInt.add(8);
//        
//        // Hien thi list
//        System.out.println("List: " + listInt.toString());
//        
//        // SET
//        Set<Integer> setInt = new HashSet<>();
//        setInt.add(1);
//        setInt.add(1);
//        setInt.add(2);
//        setInt.add(4);
//        
//        // Hien thi list
//        System.out.println("Set: " + setInt.toString());
//        // Them list vao set
////        setInt.addAll(listInt);
////        System.out.println("Set add list: " +setInt.toString());
//        // THEM SET VAO LIST
////        listInt.addAll(setInt);
////        System.out.println("List add set: " +listInt.toString());
//        List<Integer> listInt2 = new ArrayList<>();
//        listInt2.add(10);
//        listInt2.add(6);
//        listInt.addAll(listInt2);
//        
//        System.out.println("List add list2:" +listInt.toString());
//        
//        List<String> listStr = new ArrayList<>();
//        // CAC HAM HO TRO
//        System.out.println("List co du lieu hay khong: " + listStr.isEmpty());
//        System.out.println("Dem so phan tu trong list: " + listInt.size());
//        
//        // XOA LISTINT2 TRONG LIST
//        listInt.removeAll(listInt2);
//        System.out.println("Xoa listInt2 trong list: " +listInt.toString());
//        
//        listStr.add("CP17308");
//        listStr.add("CP17310");
//        listStr.add("CP17325");
//        
//        // XOA PHAN TU TRONG LIST
//        listStr.remove("CP17310");
//        System.out.println("List sau khi remove: " +listStr.toString());
//        
//        // GIAO HAI COLLECTION
//        // ??? 
//        listInt.retainAll(listInt2);
//        System.out.println("Giao hai collection: " + listInt.toString()); 
//        
//        System.out.println("Kiem tra CP17325 co trong listStr hay khong: " +listStr.contains("CP17325"));
//        System.out.println("Kiem tra CP17310 co trong listStr hay khong: " +listStr.contains("CP17310"));
//        
//        List<String> listStr2 = new ArrayList<>();
//        listStr2.add("CP17325");
//        System.out.println("Kiem tra cac phan tu trong listStr2 co trong listStr hay không: " 
//                +listStr.containsAll(listStr2));
        
        // DANH SACH STUDENT
        List<Student> listStudent = new ArrayList<>();
        Student student1 = new Student();
        student1.setStudentNo("PH02575");
        student1.setStudentName("Vu Thi Thuy");
        student1.setGender("Nu");
        student1.setClassName("CP17308");
        student1.setFinalGrade(7.5);
        student1.setStatus(true);
        
        Student student2 = new Student();
        student2.setStudentNo("PH02733");
        student2.setStudentName("Nguyen Van Luong");
        student2.setGender("Nam");
        student2.setClassName("CP17308");
        student2.setFinalGrade(8.5);
        student2.setStatus(true);
        
        // THEM DOI TUONG VAO DANH SACH
        listStudent.add(student2);
        listStudent.add(student1);
        for (Student student : listStudent) {
            System.out.println(">> Student No: " + student.getStudentNo());
        }
        // C1 : Collections.sort(listStudent);
        // C2 
        Comparator<Student> sort = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getFinalGrade().compareTo(o2.getFinalGrade());
            }
        };
        
        Collections.sort(listStudent, sort);
        for (Student student : listStudent) {
            System.out.println(">> New Student No: " + student.getStudentNo());
        }
        
//        // DUYET DANH SACH
//        // C1:
//        for (int i = 0; i < listStudent.size(); i ++) {
//            Student studentInList = listStudent.get(i);
//            System.out.println(">> Student thu " + i + ": " + studentInList.getStudentNo());
//        }
//        
//        // C2:
//        for (Student student: listStudent) {
//            System.out.println(">> C2: Student No: " + student.getStudentNo() );
//        }
//        
//        // C3: 
//        Iterator<Student> iterator = listStudent.iterator();
//        while (iterator.hasNext()) {
//            Student std = iterator.next();
//            System.out.println(">> C3: Student No: " + std.getStudentNo());
//        }
//        
        List<Integer> listInt = new ArrayList<>();
        listInt.add(1);
        listInt.add(5);
        listInt.add(1);
        listInt.add(8);
        listInt.add(2);
      
//        System.out.println("List: " + listInt.toString());
//        // Sap xep cac phan tu theo gia tri tang dan
//        Collections.sort(listInt);
//        System.out.println("List after sort: " + listInt.toString());
//        
//        // Sao tron
//        Collections.shuffle(listInt);
//        System.out.println("List after shuffle: " +listInt.toString());
//        
//        // Sap xep nguoc lai
//        Collections.sort(listInt, (a,b) -> b - a);
//        System.out.println("List after reverse sort: " +listInt.toString());
//        
        // Tim kiem phan tu trong danh sach
        System.out.println(Collections.binarySearch(listInt, 8));
        if (Collections.binarySearch(listInt, 8) >= 0) {
            System.out.println("8 in list");
        } else {
            System.out.println("8 not in list");
        }
        
        
        Comparator<Student> com = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getFinalGrade().compareTo(o2.getFinalGrade());
            }
        };

        Collections.sort(listStudent, com);
        System.out.println("List after sort: ");
        for (Student std: listStudent) {
            System.out.println(">> student: " + std.getStudentName());
        }
        
        
        // TIM KIEM VA LOC PHAN TU THEO DIEU KIEN
        List<Integer> newList = 
                listInt.stream().filter(item -> item == 1).collect(Collectors.toList());
        System.out.println("New List " + newList.toString());
        List<Student> newListStudent = listStudent.stream()
                .filter(std -> std.getGender().equals("Nu"))
                .collect(Collectors.toList());
        for (Student s : newListStudent) {
            System.out.println("Student " + s.getStudentName());
        }

        //MAP: -Key -> Value
        Map<String, Double> map = new HashMap<>();
        map.put("PH23123", 7.0);
        map.put("PH23124", 6.0);
        map.put("PH23125", 8.0);
        System.out.println("Map: " + map.toString());
        //Lay toan bo gia tri cua key nam trong MAP
        Set<String> key = map.keySet();
        for (String k : key){
            System.out.println("Key: " + k);
            Double diem = map.get(k);
            System.out.println("Value: " + diem);
        }
    }
}
