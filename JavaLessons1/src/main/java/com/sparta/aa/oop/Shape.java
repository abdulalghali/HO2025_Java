package com.sparta.aa.oop;

public abstract class Shape {
    public abstract double calculateArea();

    @Override
    public String toString() {
        return getClass().getName() + " Area: " + calculateArea();
    }

}
