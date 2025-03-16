package com.ozan.day01_02_collectionsReview.arrayList;

import java.util.*;

public class ArrayListReview {
    public static void main(String[] args) {
        //Create ArrayList and class
        //Create Student Class
        List<Student> students = new ArrayList<>();
        // Add elements to ArrayList
        students.add(new Student(1, "ozan"));
        students.add(new Student(2, "julia"));
        students.add(new Student(3, "mike"));
        students.add(new Student(4, "mary"));

        //Iteration on ArrayList
        //1. Use For Loop
        System.out.println(".....printing with legacy for-loop......");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
        //2. Use Iterator
        System.out.println(".....printing with iterator.forward.....");
        Iterator iterator = students.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println(".....printing with iterator.backward.....");
        //you need to state qualifier and cast to use hasPrevious()
        while (((ListIterator<?>) iterator).hasPrevious()) {
            System.out.println(((ListIterator<?>) iterator).previous());
        }
        //3. Use For Each loop
        System.out.println("......printing with for each loop..");
        for (Student s : students) {
            System.out.println(s);
        }

        //4. Lambda
        System.out.println(".....printing with lambda.....");
        students.forEach(student -> System.out.println(student));

        //Sorting Elements in List by using comparator interface
        //To do this I need my custom comparator class

        System.out.println("---sorting with Comparator Interface byIdDesc--");
        Collections.sort(students, new sortByIdDesc());
        students.forEach(p -> System.out.println(p));

        System.out.println("---sorting with Comparator Interface sortByNameDescending--");
        Collections.sort(students, new sortByNameDesc());
        students.forEach(p -> System.out.println(p));

    }

    static class sortByIdDesc implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o2.getId() - o1.getId();
        }

    }

    static class sortByNameDesc implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o2.getName().compareToIgnoreCase(o1.getName());
        }
    }
}


