package com.ozan.day03.demo1;

public class MySinglyLinkedList {
    Node head;
    Node tail;
    int size;

    boolean isEmpty() {
        return head == null;
    }

    void add(int data) {
        // create a new object from data
        Node node = new Node(data);
        if (isEmpty()) {//if the list is empty
            head = tail = node;
            size++;

        } else {// if there are elements in list
            tail.next = node;
            tail = node;
            size++;

        }

    }

    //singly linked list with deletion
    void deleteById(int id) {
        //check if empty
        // assign previous and current with the head
        if (isEmpty()) {
            System.out.println("List is empty!!!");

        }
        // if it is not empty, assign prev and current values to head
        // We will break the chain and re-arrange it.
        //while loop with 3 cases if there's a match, in the head, in the tail
        // after deletion decrease the size by 1
        Node prev = head;
        Node current = head;

        while (current != null) {
            if (current.id == id) {// there is a match
                //case1: head
                if (current == head) {
                    head = current.next;
                    current.next = null; //GC
                }
                //case2: tail
                else if (current == tail) {
                    tail = prev; //my new tail is my ex prev
                    prev.next = null; //Ex-tail is eligible fo GC.
                }
                //case3: middle
                else {
                    prev.next = current.next;
                    current.next = null; //GC

                }
                size--; //decrease size by 1
            }
            //jumping to other node
            prev = current;
            current = current.next;

        }


    }


    void printNodes() {
        Node current = head;
        while (current != null) {
            if (current.next == null) System.out.println(current.id + "=> null");
            else {
                System.out.print(current.id + "=> ");
            }
            current = current.next;
        }
    }
}
