package com.ozan.day04_stacks_recursions;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Assignment_Stack {
    public static void main(String[] args) {

//TODO:
    }

    public static ArrayList<Integer> sunsetViews(int[] buildings, String direction) {
        Deque<Integer> heights = new ArrayDeque<Integer>();
        if (direction.equals("EAST")) {
            for (int i = 1; i < buildings.length; i++) {
                if (buildings[i] >= buildings[i - 1]) {
                    heights.push(i);
                }
            }


        }
        return new ArrayList<>();
    }
}
