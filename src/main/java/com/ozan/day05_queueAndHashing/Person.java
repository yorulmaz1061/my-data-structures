package com.ozan.day05_queueAndHashing;

public class Person {
    String name;
    Car car;
    //I can keep address of another person.
    Person next;

    public Person(String name, Car car) {
        this.name = name;
        this.car = car;
    }
}
