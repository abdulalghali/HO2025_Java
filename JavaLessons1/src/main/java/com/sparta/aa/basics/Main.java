package com.sparta.aa.basics;

public class Main {
    public static void main(String[] args) {
        int answer = subtract(3, 1);
        System.out.println(answer);
        System.out.println(greeting(23));
    }

    private static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static String greeting(int time) {
        if (time >= 5 && time < 12) {
            return "Good morning";
        } else if (time >= 12 && time <= 18) {
            return "Good afternoon";
        } else {
            return "Good evening";
        }
    }
}