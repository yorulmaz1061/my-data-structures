package com.ozan.day11_sorting;

public class SelectionSort {
    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1 + 1; j < arr.length; j++) {//unsorted 2nd part
                if (arr[j] < arr[minIndex]) minIndex = j;
            }
            swap(arr, minIndex, i);
        }
        return arr;
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
