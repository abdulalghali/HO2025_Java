package com.sparta.aa.basics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class FilmClassificationTests {
    @ParameterizedTest
    @ValueSource(ints = {20, 21, 23, 44, 90})
    void example(int num) {
        Assertions.assertEquals("All films are available.", FilmClassification.getClassificationsByAge(num));
    }
}
