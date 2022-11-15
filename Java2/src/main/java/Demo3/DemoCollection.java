/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import Demo2.Student;

/**
 *
 * @author LeMinh
 */
public class DemoCollection {

    public static void main(String[] args) {

        // List<Integer> listInt = new ArrayList<>();
        // listInt.add(1);
        // listInt.add(2);
        // listInt.add(3);
        // listInt.add(4);
        // listInt.add(5);
        // listInt.add(6);
        // listInt.add(7);
        // listInt.add(8);
        //
        // List<Integer> listInt2 = new ArrayList<>();
        // listInt2.add(1);
        // listInt2.add(6);
        // listInt2.add(10);
        //
        // listInt.retainAll(listInt2);
        // System.out.println("Retain All: " + listInt.toString());
        //
        // System.out.println("List: " + listInt.toString());
        // System.out.println("List co du lieu hay khong: " + listInt.isEmpty());
        // System.out.println("List co du lieu hay khong: " + listInt.size());
        // //System.out.println("Thêm listInt2 vào listInt: " +
        // listInt.addAll(listInt2));
        // System.out.println("Thêm listInt2 vào listInt: " + listInt.toString());
        //// listInt.remove(8);
        //// System.out.println("Xóa số * trong listInt: " + listInt.toString());
        //
        // List<String> listStr = new ArrayList<>();
        // listStr.add("CP17310");
        // listStr.add("CP17311");
        // listStr.add("CP17312");
        // listStr.add("CP17313");
        //
        // System.out.println("ListStr: " + listStr.toString());
        // listStr.remove(2);
        // System.out.println("ListStr remove: " + listStr.toString());
        //
        // listInt.removeAll(listInt2);
        // System.out.println("Xoa cac phan tu listInt2 trong listInt: " +
        // listInt.toString());
        // System.out.println("Kiem tra có so 2 trong listInt hay khong: " +
        // listInt.contains(2));
        // System.out.println("Kiem tra listInt2 co nam trong listInt hay khong: " +
        // listInt.containsAll(listInt2));
        // listInt.clear();
        // System.out.println("Xoa du lieu" + listInt.toString());
        //
        // //SET
        // Set<Integer> setInt = new HashSet<>();
        // setInt.add(100);
        // setInt.add(100);
        // setInt.add(200);
        // setInt.add(500);
        //
        // System.out.println("Set: " + setInt.toString());
        // setInt.addAll(listInt2);
        // System.out.println("Them listInt2 vao setInt: " + setInt.toString());
        //
        // List<String> listStr2 = new ArrayList<>();
        // listStr2.add("CP17310");
        // listStr2.add("CP17311");
        // listStr2.add("CP17312");
        // listStr2.add("CP17313");
        //
        // System.out.println("Lay phan tu co index = 2: " + listStr2.get(1));
        // listStr2.set(1, "17326");
        // System.out.println("Gia tri cua listStr2 sau khi thay doi: " +
        // listStr2.toString());
        // listStr2.remove(0);
        // System.out.println(listStr2.toString());
        //
        List<Student> listStudent = new ArrayList<>();
        Student student1 = new Student();
        student1.setStudentNo("PH23123");
        student1.setStudentName("Le Duc Minh");
        student1.setFinalGrade(8);
        
        Student student2 = new Student();
        student2.setStudentNo("PH12703");
        student2.setStudentName("NTKT");
        student1.setFinalGrade(9);
        
        listStudent.add(student1);
        listStudent.add(student2);
        //
        // for(int i = 0; i < listStudent.size(); i++){
        // Student student = listStudent.get(i);
        // System.out.println("Student thu tu la: " + i);
        // System.out.println(" >> Student No: " + student.getStudentNo());
        // System.out.println(" >> Student Name: " + student.getStudentName());
        // }
        // //C2:
        // for (Student std : listStudent){
        // System.out.println(" >> C2");
        // System.out.println(" >> Student No: " + std.getStudentNo());
        // System.out.println(" >> Student Name: " + std.getStudentName());
        // }
        // //C3:
        // Iterator<Student> iterator = listStudent.iterator();
        // System.out.println(" >> C3 ");
        // while(iterator.hasNext()){
        // Student std = iterator.next();
        // System.out.println(" >> Student No: " + std.getStudentNo());
        // System.out.println(" >> Student Name: " + std.getStudentName());
        // }
        List<Integer> listInt = new ArrayList<>();
        listInt.add(1);
        listInt.add(2);
        listInt.add(1);
        listInt.add(6);
        listInt.add(8);
        listInt.add(5);
        System.out.println("List: " + listInt.toString());

        // Collections.sort(listInt);
        // System.out.println("List sort: " + listInt.toString());

        // Collections.shuffle(listInt);
        // System.out.println("List shuffle: " + listInt.toString());

        // Collections.sort(listInt, (a, b) -> b - a);
        // System.out.println("List sort desc: " + listInt.toString());

        //
        if( Collections.binarySearch(listInt, 8) >= 0 ){
            System.out.println("8 in list");
        }else{
            System.out.println("8 not in list");
        }

        List<Integer> findList = listInt.stream().filter(item -> item == 1).collect(Collectors.toList());
        System.out.println("Find list: " + findList.toString());

        List<Student> findStudent = listStudent.stream().filter(std -> std.getFinalGrade() >= 5).collect(Collectors.toList());

        
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
    }
}
