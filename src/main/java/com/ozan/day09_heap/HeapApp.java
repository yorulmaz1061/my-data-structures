package com.ozan.day09_heap;

public class HeapApp {
    public static void main(String[] args) {
        MyHeap heap = new MyHeap(10);
        heap.insert(61);
        heap.insert(120);
        heap.insert(52);
        heap.insert(45);
        heap.insert(81);
        System.out.println("Heap values after inserting 81");
        heap.printHeap();
        System.out.println("Heap values after inserting 120");
        System.out.println(heap.remove());
        heap.printHeap();
        heap.insert(130);
        System.out.println("Heap values after inserting 130");
        heap.printHeap();
    }
}
