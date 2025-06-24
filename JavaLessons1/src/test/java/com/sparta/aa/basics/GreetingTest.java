package com.sparta.aa.basics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GreetingTest {

    @Test
    @DisplayName("Greeting Returns Good Evening with input 21")
    public void GreetingReturnsGoodEvening_inputs21() {
        //Arrange
        int time = 21;
        String expected = "Good evening";

        //Act - call method under test
        String actual = Main.greeting(time);

        //Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Greeting returns good afternoon with input 12")
    public void GreetingReturnsGoodAfternoon_inputs12() {
        //Arrange
        //Act
        //Assert
        int time = 12;
        String expected = "Good afternoon";
        String result = Main.greeting(time);
        Assertions.assertEquals(expected, result);
    }


    @ParameterizedTest
    @ValueSource(ints = {11, 9, 6})
    @DisplayName("Greeting returns good morning with inputs 11, 9 and 6")
    public void GreetingReturnsGoodmorning_inputs(int time) {
        String expected = "Good morning";
        String result = Main.greeting(time);
        Assertions.assertEquals(Main.greeting(time), expected);
        Assertions.assertEquals(expected, result);
    }
}
