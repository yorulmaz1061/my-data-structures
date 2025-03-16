package com.ozan.day10_search;

public class JumpSearch {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(jumpSearch(nums, 5));

    }
    public static int jumpSearch(int[] arr, int data){
        int blockSize = (int) Math.sqrt(arr.length);
        int start = 0;
        int next = blockSize;
        while(start < arr.length && arr[next-1]<data){
            start = next;
            next += blockSize;
            if(next > arr.length) next = arr.length;

        }
        for (int i = start; i < next; i++) {
            if (arr[i] == data) return i;

        }
        return -1;

    }
}
