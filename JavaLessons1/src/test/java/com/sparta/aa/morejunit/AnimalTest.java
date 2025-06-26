package com.sparta.aa.morejunit;

import com.sparta.aa.oop.Rhino;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AnimalTest {

    private Rhino sut; //system under test

    @BeforeEach
    public void setUp(){
        sut = new Rhino("horn", 1000, 2015, 11, 6);

    }

    @Test
    public void rhinoGetWeight(){
        String result = "This Rhino weighs 1000KG";
        Assertions.assertEquals(sut.getWeight(),result);

    }

    @Test
    public void rhinoGetPetName() {
        String result = "horn";
        Assertions.assertEquals(sut.getPetname(), result);
    }
    @Test
    public void rhinoEat() {
        String result = "I am eating humans";
        Assertions.assertEquals(sut.eat(), result);
    }

}
