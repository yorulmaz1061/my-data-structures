package com.ozan.day11_sorting;

public class MergeSort {
    public static void mergeSort(int[] arr) {
        if (arr.length < 2) return; //if you have an array with one element, STOP

        int mid = arr.length / 2;

        int[] leftArray = new int[mid];
        for (int i = 0; i < mid; i++) leftArray[i] = arr[i];

        int[] rightArray = new int[arr.length - mid];
        for (int i = mid; i < arr.length; i++) rightArray[i-mid] = arr[i];

        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, arr);
    }

    public static void merge(int[] left, int[] right, int[] result) {
        // we require 3 different pointers
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) result[k++] = left[i++];
            else result[k++] = right[j++];
        }
        while (i < left.length) result[k++] = left[i++];
        while (j < right.length) result[k++] = right[j++];
    }
}
