package com.ozan.day05_QueueAndHashing;

public class QueueTestApp {
    public static void main(String[] args) {
        MyQueue<String> myQueue = new MyQueue<>();
        myQueue.enqueue("a");
        myQueue.enqueue("b");
        myQueue.enqueue("c");
        myQueue.enqueue("d");
        System.out.println(myQueue.isEmpty());
        System.out.println("Size of my queue is: "+myQueue.size());
        myQueue.dequeue();
        System.out.println("Size of my queue is: "+myQueue.size());
        System.out.printf("Front element is: "+ myQueue.peek());

    }
}
