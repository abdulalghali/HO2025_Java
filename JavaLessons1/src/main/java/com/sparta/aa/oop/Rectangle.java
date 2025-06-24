package com.sparta.aa.oop;

public class Rectangle extends Shape{

    private int height;
    private int length;

    public Rectangle(int height, int length) {
        this.height = height;
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return length * height;
    }

    public int add() {
        return 1;
    }
}
