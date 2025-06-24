package com.sparta.aa.morejunit;

import com.sparta.aa.oop.Member;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import java.time.LocalDate;

public class MemberTest {

    //FIRST - characteristics of good unit tests
    //F - Fast, runs within milliseconds
    //I - Independent, doesn't pull data from a database or something
    //R - Repeatable, whenever and whoever runs it, it should give the same results
    //S - Self checking, the test runner decides the outcome for you, don't check if it does
    //T - Timely, tests shouldn't take too long to write


    //@BeforeAll - methods with this will run before all your tests
    //@AfterAll - your test will run, THEN the method will run after
    //@BeforeEach - methods with this will run before EACH test method
    //AfterEach - methods with this will run after EACH test method

    @Test
    @DisplayName("getMemberDays return the correct number of days since joining")
    @Disabled
    public void getMemberDaysTest() {
        var today = LocalDate.now();
        var joinDate = today.minusDays(4);
        Member sut = new Member("Nish", "Mandal", joinDate.getYear(), joinDate.getMonth().getValue(), joinDate.getDayOfMonth());
        var result = sut.getMemberDays();
        Assertions.assertEquals(4, result);
    }
}
