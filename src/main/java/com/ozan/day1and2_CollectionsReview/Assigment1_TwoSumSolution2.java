package com.ozan.day1and2_CollectionsReview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Assigment1_TwoSumSolution2 {
    public static void main(String[] args) {
        int[] array = new int[]{4,7,2,11};
        System.out.println(Arrays.toString(twoSum(array, 9)));


    }
    public static int[] twoSum(int[]array, int targetValue){
        //create hashmap
        //time complexity of the solution is O(n)
        //space complexity is O(n)
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int potentialMatch = targetValue-array[i];
            if (map.containsKey(potentialMatch)) return new int[]{i,map.get(potentialMatch)};
            else map.put(array[i],i);

        }

        return null;
    }
}
