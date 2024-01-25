package com.ozan;

import java.util.Arrays;

public class Assignment1_TwoSumSolution1 {
    public static void main(String[] args) {
        int[] array = new int[]{4, 7, 2, 11};
        System.out.println(Arrays.toString(twoSumSolution1(array, 9)));
    }
    //Brute force solution of two sum problem.
    public static int[] twoSumSolution1(int[] array, int targetValue) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (i != j) {
                    if (array[i] + array[j] == targetValue) return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
//effectiveness of this solution is n^2
//index j must start with 1 because we may not use the same element twice
//and we need to check if i and j values are equal or not. if i and j is not equal do the following



