package com.ozan.day10_search;

public class TernarySearch {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(ternarySearchIterative(nums, 5));
        System.out.println(ternarySearchRecursive(nums,6,0,nums.length-1));


    }

    public static int ternarySearchIterative(int[] arr, int data) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int partition = (right - left) / 3;
            int middle1 = left + partition;
            int middle2 = right - 1;
            if (arr[middle1] == data) return middle1;
            if (arr[middle2] == data) return middle2;
            if (data < arr[middle1]) right = middle1 - 1;
            else if (data > arr[middle2]) left = middle2 + 1;
            else {
                left = middle1 + 1;
                right = middle2 - 1;
            }
        }
        return -1;
    }

    public static int ternarySearchRecursive(int[] arr, int data, int left, int right) {
        if (left > right) return -1; //data couldn't be found
        int partition = (right - left) / 3;
        int middle1 = left + partition;
        int middle2 = right - 1;
        if (arr[middle1] == data) return middle1;
        if (arr[middle2] == data) return middle2;

        if (data < arr[middle1]) return ternarySearchRecursive(arr, data, left, middle1 - 1);
        else if (data > arr[middle2]) return ternarySearchRecursive(arr, data, middle2 + 1, right);
        else return ternarySearchRecursive(arr, data, middle1 + 1, middle2 - 1);
    }
}
