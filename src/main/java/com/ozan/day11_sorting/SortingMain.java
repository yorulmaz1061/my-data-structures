package com.ozan.day11_sorting;

import java.util.Arrays;

public class SortingMain {
    public static void main(String[] args) {
        int[] numbers = {7,2,4,6,1,9,-1,-2};
      //  System.out.println(Arrays.toString(SelectionSort.selectionSort(numbers)));
      //  System.out.println(Arrays.toString(BubbleSort.BubbleSort(numbers)));
      //  System.out.println(Arrays.toString(InsertionSort.insertionSort(numbers)));
       /* MergeSort.mergeSort(numbers);
        System.out.println(Arrays.toString(numbers));*/
        QuickSort.quickSort(numbers, 0, numbers.length-1);
        System.out.println(Arrays.toString(numbers));


    }
}
