package com.sparta.aa.basics;

import static com.sparta.aa.basics.Day.*;
import static com.sparta.aa.basics.Season.*;

public class Enums {

    public static void main(String[] args) {

        Day dayOfTheWeek = FRIDAY;

        if (dayOfTheWeek == SATURDAY || dayOfTheWeek == SUNDAY) {
            System.out.println("It's the weekend");
        } else {
            System.out.println("It's a weekday");
        }

        Season seasonOfTheYear = SUMMER;

        if (seasonOfTheYear == SUMMER) {
            System.out.println("The Sunflowers are out");
        } else if (seasonOfTheYear == SPRING) {
            System.out.println("The daffodils are out");
        } else if (seasonOfTheYear == AUTUMN) {
            System.out.println("The leaves are falling");
        } else if (seasonOfTheYear == WINTER) {
            System.out.println("It's getting chilly here");
        }


//        System.out.println(getGreeting(dayOfTheWeek));


    }

    public static String getGreeting(Day day){
        String msg = "";
        switch (day) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                msg =  "Have a lovely day at work";
                break;
            case FRIDAY:
                msg = "Nearly the weekend!";
                break;
            case SATURDAY:
            case SUNDAY:
                msg = "Relax and enjoy!";
            default:
                msg = "Invalid day";
                break;
        }
        return msg;
    }
}
