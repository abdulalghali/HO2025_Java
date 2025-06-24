package com.sparta.aa.oop;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashmapExercise {
    public static void main(String[] args) {

    }
    public static HashSet<Integer> MakeFiveSet(int max) {
        HashSet<Integer> divisByFive = new HashSet<Integer>();

        for (int i = 1; i <= max; i++) {
            if (i % 5 == 0) {
                divisByFive.add(i);
            }
        }
        return divisByFive;
    }

    public static List<String> longWordList(String phrase) {
      // example phrase:  "Hi my name is abdullah and I like to eat chicken"
        // {"Hi", "my", "name", "is"..}
        ArrayList<String> result = new ArrayList<String>();
        var words = phrase.split(" ");

        for (String word : words) {
            if (word.length() >= 5) {
                result.add(word);
            }
        }
        return result;
    }


}
