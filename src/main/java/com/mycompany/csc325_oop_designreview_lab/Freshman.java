package com.mycompany.csc325_oop_designreview_lab;

/**
 * Freshman class
 */
public class Freshman extends Student {

    private int credits;

    public Freshman(String name, int age, int credits) {
        super(name, age);
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Freshman -> " + super.toString() +
                ", Credits: " + credits;
    }
}
