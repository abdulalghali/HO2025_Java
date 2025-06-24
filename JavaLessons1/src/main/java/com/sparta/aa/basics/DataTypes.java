package com.sparta.aa.basics;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class DataTypes {
    public static void main(String[] args) {
//        int num = 3;
//
//        ArrayList<String> list = new ArrayList<>(List.of("Nish", "Abz"));
//        System.out.println(list);
//
//        var today = LocalDate.now();

        //how old is Nish in code
        LocalDate nishBday = LocalDate.of(1989, 11, 2);
        //var ageInYears = LocalDate.now().getYear() - nishBday.getYear();
        //System.out.println("Nish is " + ageInYears + " years old.");

      System.out.println(Period.between(nishBday, LocalDate.now()));
    }
}
