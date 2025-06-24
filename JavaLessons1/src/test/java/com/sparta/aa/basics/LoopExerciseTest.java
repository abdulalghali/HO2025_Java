package com.sparta.aa.basics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoopExerciseTest {
    @Test
    public void sumOfArrayReturns42() {
        int[] arr = {4, 3, 9, 5, 21};
        Assertions.assertEquals(LoopExercise.sumOfArray(arr), 42);
    }

    @Test
    public void findHighestReturns43() {
        int[] arr = {8, 3, 9, 6, 55, 11, 4};
        Assertions.assertEquals(LoopExercise.findHighest(arr), 55);
    }

    @Test
    public void findHighestReturns142() {
        int[] arr = {8, 3, 9, 142, 43, 11, 4};
        Assertions.assertEquals(LoopExercise.findHighest(arr), 142);
    }
}
