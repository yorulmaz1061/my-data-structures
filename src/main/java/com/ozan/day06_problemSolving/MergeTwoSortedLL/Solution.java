package com.ozan.day06_problemSolving.MergeTwoSortedLL;


public class Solution {

    public  ListNode mergeTwoLists(ListNode current1, ListNode current2) {
        //create a dummy head node
        ListNode tempHead = new ListNode();
        ListNode previous = tempHead;
        while (current1 != null && current2 != null) {
            if (current1.val < current2.val) {
                previous.next = current1;
                current1 = current1.next;

            } else {
                previous.next = current2;
                current2 = current2.next;
            }
            previous = previous.next;

        }
        //now check if any left over
        if (current1 != null) previous.next = current2;
        else previous.next = current1;
        return tempHead.next;


    }
}
