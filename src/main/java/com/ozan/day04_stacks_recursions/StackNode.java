package com.ozan.day04_stacks_recursions;

//we put generic type <T>
public class StackNode<T> {
    // if I create Integer T will be Integer, Character->Character since it is generic
    public T value;
    StackNode next;

    public StackNode(T value) {
        this.value = value;
    }
}
