package com.mycompany.csc325_oop_designreview_lab;

/**
 * Senior class
 */
public class Senior extends Student {

    private int credits;

    public Senior(String name, int age, int credits) {
        super(name, age);

        // must be at least 85 credits
        if (credits >= 85) {
            this.credits = credits;
        } else {
            this.credits = 85;
        }
    }

    @Override
    public String toString() {
        return "Senior -> " + super.toString() +
                ", Credits: " + credits;
    }
}
