package com.example.android3lessson6;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MathTest {
    Math math;

    @Before
    public void init() {
        math = new Math();
    }

    @Test
    public void addTest() {
        assertEquals("17", math.add("12", "5"));
    }

    @Test
    public void simpleDivideTest() {
        assertEquals("1", math.divide("2", "2"));
    }

    @Test

    public void simpleMultiplyTest() {
        assertEquals("25", math.multiply("5", "5"));
    }

    @Test
    public void simpleSubtractionTest() {
        assertEquals("69", math.subtract("78", "9"));
    }

    @Test
    public void addIncludingSpacesTestCase() {
        assertEquals("17", math.add("      12", "                        5"));
    }

    @Test
    public void addIncludingMinusTestCase() {
        assertEquals("-2", math.includingMinus("-5", "3"));

    }

    @Test
    public void isDividedByZero() {
        assertEquals("0", math.dividedByZero("2", "0"));
    }

    @Test
    public void doesIncludeSpecialCharacters() {
        assertEquals("!@#@!#@!21312456", math.areSymbolsIncluded("!@#@!#@!21312", "456"));
    }

    @After
    public void detach() {
        math = null;
    }
}
