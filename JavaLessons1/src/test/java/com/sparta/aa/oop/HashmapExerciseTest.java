package com.sparta.aa.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashmapExerciseTest {

    @Test
    public void makeFiveSetReturns4Integers() {
        HashSet<Integer> result = new HashSet<Integer>(List.of(5, 10, 15, 20));
        Assertions.assertEquals(HashmapExercise.MakeFiveSet(21), result);
    }

    @Test
    public void makeFiveSetReturns9Integers() {
        HashSet<Integer> result = new HashSet<Integer>(List.of(5, 10, 15, 20, 25, 30, 35, 40, 45));
        Assertions.assertEquals(HashmapExercise.MakeFiveSet(46), result);
    }

    @Test
    public void longWordListReturns_Abdullah_and_chicken() {
        String phrase = "Hi my name is Abdullah and I like to eat chicken";
        ArrayList<String> result = new ArrayList<String>();
        result.add("Abdullah");
        result.add("chicken");
        Assertions.assertEquals(HashmapExercise.longWordList(phrase), result);
    }


}