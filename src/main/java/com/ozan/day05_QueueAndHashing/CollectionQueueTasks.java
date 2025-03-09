package com.ozan.day05_QueueAndHashing;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class CollectionQueueTasks {
    public static void main(String[] args) {
        //Deque can be acted as a stack and queue as well
        Deque<Integer> deque = new ArrayDeque<>();
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("John");
        priorityQueue.add("Jane");
        priorityQueue.add("Carol");
        priorityQueue.add("Dany");
        //Based on alphabetic order Carol comes first on the queue
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.peek());

    }
}
