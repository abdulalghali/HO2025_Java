package com.sparta.aa.oop;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Member implements Moveable, Eatable{
    private String firstName;
    private String lastName;
    private LocalDate joinDate;

    public Member(String fname, String lName, int year, int month, int day) {
        this.firstName = fname;
        this.lastName = lName;
        this.joinDate = LocalDate.of(year, month, day);
    }

    public Member(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public long getMemberDays()
    {
        //comparing the join date to now and giving the difference in days
        return joinDate.until(LocalDate.now(), ChronoUnit.DAYS);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return getFullName() + "has been a member for " + getMemberDays() + " days.";
    }

    @Override
    public String move() {
        return "I am moving";
    }

    @Override
    public String eat() {
        return "I am eating fries.";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(firstName, member.firstName) && Objects.equals(lastName, member.lastName) && Objects.equals(joinDate, member.joinDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, joinDate);
    }
}
