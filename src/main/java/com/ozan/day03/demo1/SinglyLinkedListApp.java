package com.ozan.day03.demo1;

import java.util.Arrays;

public class SinglyLinkedListApp {
    public static void main(String[] args) {
        MySinglyLinkedList mylist = new MySinglyLinkedList();
        System.out.println(mylist.isEmpty());
        for (int i = 0; i < 10; i++) {
            mylist.add(i);

        }
        mylist.printNodes();
        mylist.deleteById(9);
        mylist.printNodes();
        System.out.println("--------------------");

        System.out.println("index of 3 ---- "+mylist.indexOf(3));
        System.out.println("---------------------");
        mylist.addFirst(888);
        mylist.printNodes();
        System.out.println("----------");
        System.out.println("kth item from the last: "+mylist.getKthItemFromLast(3));
        mylist.removeKthFromEnd(1);
        mylist.printNodes();


    }

}
