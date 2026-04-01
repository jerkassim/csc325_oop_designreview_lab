package com.mycompany.csc325_oop_designreview_lab;


public class Student extends Human {

    private String address;
    private double gpa;

    // constructor
    public Student(String name, int age) {
        super(name, (short) age);
    }

    // GPA getter/setter (encapsulation)
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // implementing abstract methods
    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    // toString
    @Override
    public String toString() {
        return "Name: " + getName() +
                ", Age: " + getAge() +
                ", GPA: " + gpa;
    }
}