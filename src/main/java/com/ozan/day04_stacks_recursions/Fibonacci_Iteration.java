package com.ozan.day04_stacks_recursions;

public class Fibonacci_Iteration {
    public static void main(String[] args) {
        int n = 10;
        int f1 = 0, f2 = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = f1 + f2;
            f1 = f2;
            f2 = sum;
            System.out.print(f1+" ");
        }
    }

}


