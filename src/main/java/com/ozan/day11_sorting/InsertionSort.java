package com.ozan.day11_sorting;

public class InsertionSort {
    public static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int  toBeInserted = arr[i]; //temp variable toBeInserted
            int j = i-1; //this is predecessor
            while (j >= 0 && toBeInserted < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = toBeInserted;

        }
        return arr;

    }
}
