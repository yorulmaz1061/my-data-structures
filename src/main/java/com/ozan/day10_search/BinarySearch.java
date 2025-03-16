package com.ozan.day10_search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
        System.out.println(binarySearchIterative(numbers, 6));
        System.out.println(binarySearchRecursive(numbers, 6));


    }
    public static int binarySearchIterative(int[] arr, int data) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (arr[middle] == data) return middle;
            if(data < arr[middle]) right = middle - 1;
            else left = middle + 1;

        }
        return -1;

    }
    public static int binarySearchRecursive(int[] arr, int data) {
        return binarySearchRecursive(arr, data, 0, arr.length - 1);
    }


    public static int binarySearchRecursive(int[] arr, int data, int left, int right) {
        if (left > right) return -1; //it means I couldn't find that element
        int middle = (left + right) / 2;
        if (arr[middle] == data) return middle;
        //with middle-1
        if(data < arr[middle]) return binarySearchRecursive(arr, data, left, middle - 1);
        else return binarySearchRecursive(arr,data,middle+1,right);
    }


}
