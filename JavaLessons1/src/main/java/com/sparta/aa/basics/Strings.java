package com.sparta.aa.basics;

public class Strings {
    public static void main(String[] args) {
        String name = "Nish";
//        System.out.println(name.charAt(0));

        String result = stringExercise(" Java list fundamentals ");
        System.out.println(result);
    }

    public static String stringExercise(String mystring) {
        var newString = mystring.trim().toUpperCase().replace('L', '*').replace('T', '*');
        var nPos = newString.indexOf('N');
        var newString2  = newString.substring(0, nPos + 1);
        return newString2;
    }


}
