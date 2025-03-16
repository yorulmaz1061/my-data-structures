package com.ozan.day06_problemSolving.MergeTwoSortedLL;

import java.util.Arrays;
import java.util.LinkedList;

public class BruteForceSolution {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList();
        list.addAll(Arrays.asList(1, 2, 4));
        LinkedList<Integer> list2 = new LinkedList();
        list2.addAll(Arrays.asList(1, 3, 5));

        LinkedList<Integer> merged = mergeSortedLists(list, list2);
        System.out.println(merged);
    }

    public static LinkedList<Integer> mergeSortedLists(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        LinkedList<Integer> merged = new LinkedList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                merged.add(list1.get(i));
                i++;
            } else {
                merged.add(list2.get(j));
                j++;
            }
        }

        // Add remaining elements from list1
        while (i < list1.size()) {
            merged.add(list1.get(i));
            i++;
        }

        // Add remaining elements from list2
        while (j < list2.size()) {
            merged.add(list2.get(j));
            j++;
        }

        return merged;
    }
}
