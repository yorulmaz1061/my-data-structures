package com.ozan.day03.demo1;

public class SinglyLinkedListApp {
    public static void main(String[] args) {
        MySinglyLinkedList mylist = new MySinglyLinkedList();
        System.out.println(mylist.isEmpty());
        for (int i = 0; i < 10; i++) {
            mylist.add(i);

        }
        mylist.printNodes();

    }
}
