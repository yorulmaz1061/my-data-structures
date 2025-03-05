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

        } else {// if there are elements in list. It adds new node to tail.
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

    int indexOf(int id) {
        if (isEmpty()) return -1;
        int position = 0;
        //iterate through the list
        Node current = head;  //set my current with starting element;
        while (current != null) {
            if (current.id == id) return position;
            position++;
            current = current.next;
        }
        return -1;

    }

    void addFirst(int data) {
        Node node = new Node(data);
        if (isEmpty()) {
            head = tail = node;
            size++;
        } else {
            //if you add node first adjust node.next to head.
            node.next = head;
            // now I should update my head
            head = node;
            size++;
        }
    }

    public int getKthItemFromLast(int k) {
        //create two pointers
        //without any knowledge about the size
        Node pointer1 = head;
        Node pointer2 = head;
        //move pointer2 k-1 times
        for (int i = 0; i < k - 1; i++) {
            pointer2 = pointer2.next;

        }
        //move pointers until pointer2 hits the last element
        while (pointer2.next != null) {
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;

        }
        //pointer is ont the kth element from the last
        return pointer1.id;

    }

    public void removeKthFromEnd(int k) {
        //create 3 pointers
        Node pointer1 = head;
        Node pointer2 = head;
        Node previous = null;
        // move pointer2 k-1 times
        for (int i = 0; i < k - 1; i++) {
            pointer2 = pointer2.next;
        }
        //move pointers until pointer2 hits the last element
        while (pointer2.next != null) {
            previous = pointer1;
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;

        }
        //Do delete operation in 3 cases
        if (pointer1==head){
        head = pointer1.next;
        pointer1.next = null;
        size--;

        } else if (pointer1==tail) {
           tail = previous;
           previous.next = null;
           size--;
        } else {
            previous.next = pointer1.next;
            pointer1.next = null;
            size--;
        }


    }


}
