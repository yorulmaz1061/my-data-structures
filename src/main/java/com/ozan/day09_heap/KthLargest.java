package com.ozan.day09_heap;

public class KthLargest {
    public static void main(String[] args) {
        int[] numbers = {3, 2, 1, 5, 6, 4};
        System.out.println(getKthLargest(numbers, 2));

    }
    public static int getKthLargest(int[] array, int k) {
        //1. Create a heap
        MyHeap heap = new MyHeap(array.length);

        //2. Put array into a heap
        for (int i = 0; i < array.length; i++) {
            heap.insert(array[i]);
        }
        //3. Remove root k-1 times
        for (int i = 0; i < k - 1; i++) {
            heap.remove();
        }
        //4. Return root
        return heap.peek();
    }
}
