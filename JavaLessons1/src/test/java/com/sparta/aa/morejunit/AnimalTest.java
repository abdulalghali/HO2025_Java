package com.sparta.aa.morejunit;

import com.sparta.aa.oop.Rhino;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AnimalTest {

    private Rhino horn;

    @BeforeEach
    public void createRhino(){
        horn = new Rhino("horn", 1000, 2015, 11, 6);

    }

    @Test
    public void rhinoGetWeight(){
        String result = "This Rhino weighs 1000KG";
        Assertions.assertEquals(horn.getWeight(),result);

    }

    @Test
    public void rhinoGetPetName() {
        String result = "horn";
        Assertions.assertEquals(horn.getPetname(), result);
    }
    @Test
    public void rhinoEat() {
        String result = "I am eating humans";
        Assertions.assertEquals(horn.eat(), result);
    }

}
