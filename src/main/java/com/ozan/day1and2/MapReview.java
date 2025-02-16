package com.ozan.day1and2;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class MapReview {
    public static void main(String[] args) {
        //create hashmap
        Map<Integer, String> studentsMap = new HashMap<>();
        studentsMap.put(1,"hasan");
        studentsMap.put(2,"julia");
        studentsMap.put(6,"sarah");

        System.out.println(findFirstNonRepeating("JJavvaDeveloper"));


    }
    public static Character findFirstNonRepeating(String str){
        //Create a map: this will cost me space complexity
        Map<Character,Integer> map = new TreeMap<>(); // space complexity O(n)
        //count
        int count=0;
        //from the beginnning and check if there is a char with frq=1
        for (Character ch:str.toCharArray()) {
            if (map.containsKey(ch)) {
                count=map.get(ch);
                map.put(ch,count+1);
            }else map.put(ch,1);

        }
        for (Character ch:str.toCharArray()){
            if (map.get(ch)==1){
                return ch;
            }
        }

        return null;
    }

}
