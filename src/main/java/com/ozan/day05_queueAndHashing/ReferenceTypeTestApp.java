package com.ozan.day05_queueAndHashing;

public class ReferenceTypeTestApp {
    public static void main(String[] args) {
        Car car = new Car("Mercedes", "E200");
        //car(reference variable/reference type) is the address of the new Car object
        //if you print car it prints the address of the object
        System.out.println(car);
        System.out.println(car.brand + " " + car.type);
        //Below it shows the address of the object
        System.out.println(new Car("Mercedes", "E200"));
        // array has the same combination as well
        int[] arr = new int[5];
        //It prints address of the array
        System.out.println(arr);
        System.out.println("----------------");
        Person person1 = new Person("Michael",new Car("Audi","A3"));
        //if I print person1 I just print the address
        System.out.println(person1);
        System.out.println("------adding next to keep following person address----");
        //After creating 'next' field, create another person object
        Person person2 = new Person("MichaelNext",new Car("BMW","3"));
        person1.next = person2;
        //person2 and person1.next now addresses the same object
        System.out.println(person1.next);
        System.out.println(person2);
        // if I assign another variable it will be same
        //Person class type-ReferenceType
        Person current = person2;
        System.out.println(current);

    }
}
