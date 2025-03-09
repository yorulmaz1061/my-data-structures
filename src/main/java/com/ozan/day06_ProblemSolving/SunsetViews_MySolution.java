package com.ozan.day06_ProblemSolving;

import java.util.ArrayList;
import java.util.Stack;

public class SunsetViews_MySolution {
    public static void main(String[] args) {
        int[] buildings = {3, 5, 4, 4, 3, 1, 3, 2};
        String direction = "EAST";
        System.out.println(sunsetViews(buildings, direction));

    }

    public static ArrayList<Integer> sunsetViews(int[] buildings, String direction) {
        Stack<Integer> stack = new Stack<>();//stack to hold building indices that can see sunset
        if (direction.equals("EAST")) {
            for (int i = 0; i < buildings.length; i++) {
                while (!stack.isEmpty() && buildings[i] >= buildings[stack.peek()]) {
                    stack.pop();
                }
                stack.push(i);

            }
        } else if (direction.equals("WEST")) {
            for (int i = buildings.length - 1; i >= 0; i--) {
                while (!stack.isEmpty() && buildings[i] >= buildings[stack.peek()]) {
                    stack.pop();
                }
                stack.push(i);

            }
            stack.sort(Integer::compareTo);

        }
        //now I have a stack with the building indices that can see sunset

        return new ArrayList<Integer>(stack);
    }
}
