package com.sparta.aa.oop;

public class BaseballMember extends Member{

    private String position;

    public BaseballMember(String fname, String lName, int year, int month, int day) {
        super(fname, lName, year, month, day);
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
