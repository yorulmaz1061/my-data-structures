package com.ozan.day1and2;

public class BigOSingleLoop {
    public static void main(String[] args) {
        long numberOfOperations = 0;
        int n = 10000;// size of  Data
        int m = 500;
        long startTime;
        long endTime;
        System.out.println("Input size n is = " + n);
        //Example Single Loop................... O(n)
        startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            numberOfOperations += 1;
        }
        endTime = System.currentTimeMillis();
        System.out.println("Number of operations: " + numberOfOperations + " in " + (endTime - startTime) + " in miliseconds");

        //Example Nested Loops
        numberOfOperations = 0;
        startTime = System.currentTimeMillis();
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                numberOfOperations += 1;
            }
        }
        endTime = System.currentTimeMillis();
        System.out.println("Number of operations with nested loop: " + numberOfOperations + " in " + (endTime - startTime) + " in miliseconds");

        //Example Logarithmic Complexity
        numberOfOperations = 0;
        startTime = System.currentTimeMillis();
        for (int j = 1; j < n; j *= 2) {
            numberOfOperations += 1;
        }
        endTime = System.currentTimeMillis();
        System.out.println("Number of operations with logarithmic: " + numberOfOperations + " in " + (endTime - startTime) + " in miliseconds");

        //Example=Triple nested loops
        numberOfOperations = 0;
        startTime = System.currentTimeMillis();
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                for (int k = 0; k < n; k++) {
                    numberOfOperations += 1;
                }
            }
        }
        endTime = System.currentTimeMillis();
        System.out.println("Number of operations with Triple nested loop: " + numberOfOperations + " in " + (endTime - startTime) + " in miliseconds");

        //Example= N and M Nested Loops O(n*m)
        numberOfOperations = 0;
        startTime = System.currentTimeMillis();
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                numberOfOperations += 1;
            }
        }
        endTime = System.currentTimeMillis();
        System.out.println("Number of operations with O(n*m) nested loop: " + numberOfOperations + " in " + (endTime - startTime) + " in miliseconds");

        //Example N and M Consecutive Loops O(n+m)
        numberOfOperations = 0;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            numberOfOperations += 1;
        }
        for (int i = 0; i < m; i++) {
            numberOfOperations += 1;
        }
        endTime = System.currentTimeMillis();
        System.out.println("Number of operations with O(n+m) complexity: " + numberOfOperations + " in " + (endTime - startTime) + " in miliseconds");


    }


}


