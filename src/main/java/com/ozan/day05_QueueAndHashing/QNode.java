package com.ozan.day05_QueueAndHashing;

public class QNode<T> {
    T value;
    QNode<T> next;

    public QNode(T value) {
        this.value = value;
    }
}
