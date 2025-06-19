package com.sparta;

public class Exercises {

    // Question 1 change this method so that it uses the ternary operator ?
    public static String getForecast(int temp) {
        return temp < 15 ? "It's cold" : "It's hot";
    }

    // Question 2
    // returns the average of the array nums
    public static double average(int[] nums)
    {
        double avg = 0;
        if (nums.length != 0) {
            for (int i : nums) {
                avg += i;
            }
            return avg / nums.length;
        }
        else {
            return 0;
        }
    }

    // Question 3

    // returns the type of ticket a customer is eligible for based on their age
    // "Standard" if they are between 18 and 59 inclusive
    // "OAP" if they are 60 or over
    // "Student" if they are 13-17 inclusive
    // "Child" if they are 5-12
    // "Free" if they are under 5
    public static String ticketType(int age)
    {
        if (age < 5)
            return "Free";
        else if (age <= 12) {
            return "Child";
        }
        else if (age <= 17) {
            return "Student";
        }
        else if (age < 60) {
            return "Standard";
        }
        else if (age >= 60) {
            return "OAP";
        }
        return "Please enter a valid age.";
    }

    // Question 4
    public static String grade(int mark)
    {
        var grade = "";
        if (mark >= 75)
            grade = "Pass with Distinction";
        else if (mark >= 60) {
            grade = "Pass with Merit";
        }
        else if (mark >= 40) {
            grade = "Pass";
        }
        else {
            grade = "Fail";
        }
        return grade;
    }

    // Question 5
    public static int getScottishMaxWeddingNumber(int covidLevel)
    {
        int allowedGuests = 0;
        switch (covidLevel) {
            case 4:
                allowedGuests = 20;
                break;
            case 3:
                allowedGuests = 50;
                break;
            case 2:
                allowedGuests = 50;
                break;
            case 1:
                allowedGuests = 100;
                break;
            case 0:
                allowedGuests = 200;
                break;
            default:
                allowedGuests = 0;
        }
        return allowedGuests;
    }
}
