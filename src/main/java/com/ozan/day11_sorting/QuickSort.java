package com.ozan.day11_sorting;

public class QuickSort {
    public static void quickSort(int[] arr, int start, int end) {
        // handle the termination first
        if (start >= end) return;
        int boundary = partition(arr,start,end);
        quickSort(arr,start,boundary-1); //1st part
        quickSort(arr,boundary+1,end); //2nd part
    }
    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int boundary = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] <= pivot) swap (arr,i, boundary++);
        }
        return boundary-1;
    }
    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
