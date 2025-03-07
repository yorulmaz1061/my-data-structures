package com.ozan.day04_stacks_recursions;

import java.util.NoSuchElementException;

public  class MyStack<T> {
    //I need address definition of top and bottom
    public StackNode<T> top;
    public StackNode<T> bottom;
    int size;

    public boolean isEmpty() {
        return bottom == null;
    }
    //this will add value
    public void push(T item) {
        StackNode<T> node = new StackNode<>(item);
        if (isEmpty()) bottom = top = node;
        else {
            top.next = node;
            top = node;

        }
        size++;
    }
    //this will return value of the top
    public T peek(){
        return (T) top.value;

    }
    //deletion operation
    public T pop(){
        StackNode peekNode;
        if (isEmpty()) throw new NoSuchElementException("Stack is empty");
        //stack has one element
        if(top==bottom) {
            peekNode = top;
            top = bottom = null;
        }
        //stack has more than one element
        else {
            peekNode = top;
            StackNode previous = bottom;
            while(previous.next != top) {
                previous = previous.next;
            }
            previous.next = null;
            top = previous;

        }
        size--;
        return (T) peekNode.value;
    }


}
