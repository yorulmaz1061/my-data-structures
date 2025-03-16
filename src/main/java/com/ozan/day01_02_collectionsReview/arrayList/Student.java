package com.ozan.day01_02_collectionsReview.arrayList;

import java.util.Objects;

public class Student {
    private int id;
    private String name;
    //put constructors
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    //getter-setters-equals-hashCode-toString
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student students = (Student) o;

        if (id != students.id) return false;
        return Objects.equals(name, students.name);
    }
    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
