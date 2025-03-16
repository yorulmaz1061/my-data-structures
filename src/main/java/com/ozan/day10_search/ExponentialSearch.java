package com.ozan.day10_search;

public class ExponentialSearch {
    public static void main(String[] args) {
        int[] nums = new int[100];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i;
        }
        System.out.println(exponentialSearch(nums, 97));
    }
    public static int exponentialSearch(int[] arr, int data) {
        int bound = 1;
        while (bound < arr.length && arr[bound] < data) bound *=2;
        int left = bound/2;
        int right = Math.min(bound, arr.length-1);
        return BinarySearch.binarySearchRecursive(arr,data,left,right);
    }
}
