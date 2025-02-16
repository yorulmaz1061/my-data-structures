package com.ozan.review;

import java.util.Arrays;

public class MyArrayList {
    //Define array
    int[] numbers;
    int size;

    public MyArrayList(){
        numbers=new int[10];
        this.size=0;
    }
    public MyArrayList(int capacity){
        numbers=new int[capacity];
        this.size=0;
    }
   /* int[] grow(){
        int[] newArray= new int[numbers.length*2]; //%100 grow
        for (int i = 0; i < numbers.length; i++) {
            newArray[i]=numbers[i];
        }
        numbers=newArray;
        return numbers;
    }*/
  //short method below:
   int[] grow(){
       return Arrays.copyOf(numbers, numbers.length*2);
   }
    void add(int value){
        if (size>=(int)numbers.length*0.75){
            System.out.println("before value: " + value+ "size was: "+ numbers.length);
            numbers=grow();
            System.out.println("before value: " + value+ "size was: "+ numbers.length);
            //grow
        }
        numbers[size++] = value;
    }

}
