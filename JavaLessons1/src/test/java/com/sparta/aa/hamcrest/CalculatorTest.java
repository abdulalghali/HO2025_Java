package com.sparta.aa.hamcrest;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class CalculatorTest {

    @Test
    public void given2And6_Add_Returns8() {
        Calculator calculator = new Calculator(6, 2);
        //Assertions.assertEquals(8, calculator.add());
        assertThat(calculator.add(), Matchers.equalTo(8.0));
    }

    @Test
    void given6And3_DivisibleBy_ReturnsTrue() {
        Calculator calc = new Calculator(6, 2);

        //Assertions.assertTrue(calc.divisibleBy2());
        assertThat(calc.divisibleBy2(), is(true));
    }

    @Test
    void given7And3_DivisibleBy_ReturnsFalse() {
        Calculator calc = new Calculator(7, 3);

       //Assertions.assertFalse(calc.divisibleBy2());
        assertThat(calc.divisibleBy2(), is(false));
    }

    @Test
    void given7And3_ToString_OutputContainsCalculator() {
        Calculator calc = new Calculator(7, 3);

        //Assertions.assertTrue(calc.toString().contains("Calculator"));
        assertThat(calc.toString(), containsString("Calculator"));
        assertThat(calc.toString(), startsWith("Calculator"));
    }

    @Test
    void collectionsExercise() {
        ArrayList<String> fruits = new ArrayList<>(List.of("apple", "pear", "banana", "peach", "pomegranate", "pineapple", "lemon"));
        assertThat(fruits, hasSize(7));
        assertThat(fruits, hasItems("banana", "pear"));
        assertThat(fruits, not(hasItem("grape")));
        assertThat(fruits, not(hasItem(containsString("z"))));
    }
}
