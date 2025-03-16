package com.ozan.day06_problemSolving.ReverseLinkedList;

public class Solution {
    public static void main(String[] args) {
        MySinglyLinkedList list = new MySinglyLinkedList();
        for (int i = 0; i < 10; i++) list.add(i);
        list.printNodes();
        System.out.println("After reverse in one pass");
        reverse(list);
        list.printNodes();

    }

    public static void reverse(MySinglyLinkedList list) {
        //Create two pointers
        Node previous = list.head;
        Node current = list.head.next;
        //while loop iterate until current=null
        while (current != null) {
            Node nextNode = current.next;
            current.next = previous; //change direction of current to previous
            previous = current; //move previous to right to the current
            current = nextNode; //move current to right on the next node
        }
        //Adjust the tail and head
        list.tail = list.head;
        list.tail.next = null;
        list.head = previous;

    }

}
