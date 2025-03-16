package com.ozan.day05_queueAndHashing;

import java.util.Stack;

public class ReverseFirstK_ElementsQueueProblem {
    public static void main(String[] args) {
        MyQueue<Integer> queue=new MyQueue<>();
        for (int i = 0; i < 6; i++) {
            queue.enqueue(i);
        }
        System.out.println("Initial queue: ");
        queue.printQueue();
        System.out.println();
        System.out.println("After reverse");
        reverseFirstK(queue,3).printQueue();
    }
    static MyQueue<Integer> reverseFirstK(MyQueue<Integer> queue, int k){
        //create a stack
        Stack<Integer> stack=new Stack<>();
        // push first K elements into stack
        for (int i = 0; i < k; i++) {
            stack.push(queue.dequeue());
        }
        // enqueue elements back into the queue
        while(!stack.isEmpty()){
            queue.enqueue(stack.pop());
        }
        // dequeue and enqueue size of queue n-k times
        for (int i = 0; i < queue.size-k ; i++) {
            queue.enqueue(queue.dequeue());
        }
        return queue;
    }

}
