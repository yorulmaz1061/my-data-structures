package com.ozan.day05_QueueAndHashing;

import java.util.*;

public class InterviewQ1 {
    public static void main(String[] args) {
        Queue<String> stringQueue = new LinkedList<String>();
        stringQueue.add("A");
        stringQueue.add("B");
        stringQueue.add("C");
        stringQueue.add("D");
        System.out.println(stringQueue);
        Deque<String> stack = new LinkedList<>();
        while (!stringQueue.isEmpty()) {
            stack.push(stringQueue.poll());
        }

        System.out.println(stack);
    }
}
