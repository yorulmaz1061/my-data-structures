package com.ozan.day05_QueueAndHashing;

import java.util.*;


public class Assignment {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(10, 20, 30, 40, 50));
        int k = 4;
        System.out.println(reversed(deque, k));  // Expected Output: [40, 30, 20, 10, 50]
    }

    public static List<Integer> reversed(Deque<Integer> deque, int k) {
        Stack<Integer> stack = new Stack<>();

        /*for (int i = 0; i < k && !deque.isEmpty(); i++) {
            stack.push(deque.poll());
        }*/
        int counter = 0;
        while (counter < k && !deque.isEmpty()) {
            stack.push(deque.poll());
            counter++;
        }

        // Collect the reversed part
        List<Integer> result = new ArrayList<>();
        while (!stack.isEmpty()) {
            result.add(stack.pop());
        }

        // Append the remaining elements from deque
        while (!deque.isEmpty()) {
            result.add(deque.poll());
        }

        return result;
    }
}
