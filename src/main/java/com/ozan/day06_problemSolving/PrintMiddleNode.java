package com.ozan.day06_problemSolving;

import com.ozan.day03_linkedList.singlyLinkedList.MySinglyLinkedList;
import com.ozan.day03_linkedList.singlyLinkedList.Node;

public class PrintMiddleNode {
    public static void main(String[] args) {
        MySinglyLinkedList myList = new MySinglyLinkedList();
        for (int i = 1; i <= 6; i++) {
            myList.add(i);
        }
        printMiddle(myList);

    }
    public static void printMiddle(MySinglyLinkedList sll) {
        //create 2 pointers slow and fast runner
        Node singleJump = sll.head;
        Node doubleJump = sll.head;
        // iterate over the linked list
        while (doubleJump != sll.tail && doubleJump.next != sll.tail) {
            singleJump = singleJump.next;
            doubleJump = doubleJump.next.next;

        }
        //doubleJump pointer reaches tail or before tail
        if (doubleJump == sll.tail) {
            System.out.println(singleJump.id);
        } else {
            System.out.println(singleJump.id+","+singleJump.next.id);
        }







    }
}
