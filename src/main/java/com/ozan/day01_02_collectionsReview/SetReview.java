package com.ozan.day01_02_collectionsReview;

import com.ozan.day01_02_collectionsReview.arrayList.Student;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetReview {
    public static void main(String[] args) {
        //1.Create a set
        Set<Student> set = new LinkedHashSet<>();

        //2. Add element
        set.add(new Student(1,"ozan"));
        set.add(new Student(2,"julia"));
        set.add(new Student(3,"mike"));
        set.add(new Student(4,"mary"));
       // System.out.println(set.add(new Student(4,"mary")));
        // since it is a duplicate it returns false.

        System.out.println(set);

        System.out.println(firstRepeatingChar("Java Developer"));


    }
    public static Character firstRepeatingChar(String str){
        //time complexity of the following code is O(n)
        Set<Character> chars=new HashSet<>(); // in here I have space complexity of O(n)

        for (Character c : str.toCharArray()){
            if (chars.add(c)==false) return c;
        }
    return null;
    }

}
