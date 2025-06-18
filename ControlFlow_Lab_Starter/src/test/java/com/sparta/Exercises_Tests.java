package com.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Exercises_Tests {
    @Test
    @DisplayName("Given a temperature less than 15, getForecast returns It's cold")
    public void getForecast_Cold() {
        Assertions.assertEquals("It's cold", Exercises.getForecast(14) );
    }

    @Test
    @DisplayName("Given a temperature of 15, getForecast returns It's hot")
    public void getForecast_Hot() {
        Assertions.assertEquals("It's hot", Exercises.getForecast(15) );
    }

    @Test
    @DisplayName("Given a temperature over 15, getForecast returns It's hot")
    public void getForecast_Over15_Hot() {
        Assertions.assertEquals("It's hot", Exercises.getForecast(125));
    }
    @Test
    @DisplayName("Average returns correct average")
    public void Average_ReturnsCorrectAverage()
    {
        int[] nums = { 3, 8, 1, 7, 3 };
        Assertions.assertEquals(4.4, Exercises.average(nums));
    }

    @Test
    @DisplayName(("When the Array is empty average returns zero"))
    public void WhenArrayIsEmpty_Average_ReturnsZero()
    {
        int[] nums = {  };
        Assertions.assertEquals(0, Exercises.average(nums));
    }

    @ParameterizedTest
    @CsvSource( {
            "100, OAP",
            "60, OAP",
            "59, Standard",
            "18, Standard",
            "17, Student",
            "13, Student",
            "12, Child",
            "5, Child",
            "4, Free",
            "0, Free"
    })
    @DisplayName("Testing ticket types by age")
    public void TicketTypeTest(int age, String expected)
    {
        var result = Exercises.ticketType(age);
        Assertions.assertEquals(expected, result);
    }

    // write unit tests for the 'Grade' method here
    @Test
    @DisplayName("Given mark 87, grade method returns Pass with Distinction")
    public void givenReturnsPassWithDistinctionForMark87() {
        Assertions.assertEquals("Pass with Distinction", Exercises.grade(87));
    }

    @Test
    @DisplayName("Given mark 74, grade method returns Pass with Merit")
    public void givenReturnsPassWithMeritForMark74() {
        Assertions.assertEquals("Pass with Merit", Exercises.grade(74));
    }

    @Test
    @DisplayName("Given mark 59, grade method returns Pass")
    public void givenReturnsPassForMark59() {
        Assertions.assertEquals("Pass", Exercises.grade(59));
    }

    @Test
    @DisplayName("Given mark 12, grade method returns Fail")
    public void givenReturnsFailForMark12() {
        Assertions.assertEquals("Fail", Exercises.grade(12));
    }

    // write unit tests for the Scottish wedding example here
    @Test
    public void givenCovidLevel4_ReturnNumAttendees() {
        Assertions.assertEquals(Exercises.getScottishMaxWeddingNumber(4), 20);
    }

    @Test
    public void givenCovidLevel3_ReturnNumAttendees() {
        Assertions.assertEquals(Exercises.getScottishMaxWeddingNumber(3), 50);
    }

    @Test
    public void givenCovidLevel2_ReturnNumAttendees() {
        Assertions.assertEquals(Exercises.getScottishMaxWeddingNumber(2), 50);
    }

    @Test
    public void givenCovidLevel1_ReturnNumAttendees() {
        Assertions.assertEquals(Exercises.getScottishMaxWeddingNumber(1), 100);
    }

    @Test
    public void givenCovidLevel0_ReturnNumAttendees() {
        Assertions.assertEquals(Exercises.getScottishMaxWeddingNumber(0), 200);
    }
}
