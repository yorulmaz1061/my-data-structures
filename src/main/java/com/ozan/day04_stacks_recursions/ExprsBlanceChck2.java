package com.ozan.day04_stacks_recursions;

import java.util.ArrayDeque;
import java.util.Deque;

public class ExprsBlanceChck2 {
    public static void main(String[] args) {
        System.out.println(balanceCheck("{(A*C)+({V-M})"));

    }

    public static boolean balanceCheck(String str) {
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            if (ch != '(' && ch != '[' && ch != '{' && ch != ')' && ch != ']' && ch != '}') continue;
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
                continue;
            }
            if (stack.isEmpty()) return false;
            switch (ch) {
                case ')':
                    if (stack.pop() != '(') return false;
                    break;
                case ']':
                    if (stack.pop() != '[') return false;
                    break;
                case '}':
                    if (stack.pop() != '{') return false;
                    break;
                default:
                    return false;

            }

        }
        return stack.isEmpty();

    }

}
