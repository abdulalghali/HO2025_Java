package com.sparta.aa.basics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SelectionTest {

    @Test
    public void failedTest64() {
        Assertions.assertEquals("Fail", Selection.getGradeIfElse(64));
    }
}
