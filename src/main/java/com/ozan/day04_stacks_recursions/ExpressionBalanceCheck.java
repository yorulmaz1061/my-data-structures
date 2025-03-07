package com.ozan.day04_stacks_recursions;

public class ExpressionBalanceCheck {
    public static void main(String[] args) {
        System.out.println(balanceCheck("(A*C)+({V-M})"));

    }

    public static boolean balanceCheck(String input) {
        //create a stack
        MyStack<Character> mystack = new MyStack<>();

        //iterate over input
        for (int i = 0; i < input.length(); i++) {
            Character ch = input.charAt(i);

            // filter non player chars
            if (ch != '(' && ch != '{' && ch != '[' && ch != ')' && ch != '}' && ch != ']') continue;

            //if it is a symbol to be processed
            if (ch == '(' || ch == '{' || ch == '[') {
                mystack.push(ch);
                continue;
            }
            // at this point this is a closing symbol, stack shouldn't be empty
            if (mystack.isEmpty()) return false;
            switch (ch) {
                case ')':
                    if (mystack.pop() != '(') return false;
                    break;
                case ']':
                    if (mystack.pop() != '[') return false;
                    break;
                case '}':
                    if (mystack.pop() != '{') return false;
                    break;
            }

        } //end of for
        return mystack.isEmpty();
        //return if stack is empty

    }
}




