package com.ozan.day06_problemSolving.findCycle;

public class HowManyCycleElements {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(0);
        ListNode n4 = new ListNode(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n2;
        System.out.println(howManyCycElements(n1));

    }

    public static int howManyCycElements(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return countCycleNodes(slow);

            }
        }
        return 0;
    }
    private static int countCycleNodes(ListNode meetingPoint){
        int count = 1;
        ListNode current = meetingPoint.next;
        while (current != meetingPoint) {
            count++;
            current = current.next;
        }
        return count;
    }

}
