package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class NumberProcessorTest {

    @Test
    void testSumEvenNumbers_normal() {
        assertEquals(30, NumberProcessor.sumEvenNumbers(10));
    }

    @Test
    void testSumEvenNumbers_small() {
        assertEquals(2, NumberProcessor.sumEvenNumbers(2));
    }

    @Test
    void testSumEvenNumbers_zero() {
        assertEquals(0, NumberProcessor.sumEvenNumbers(0));
    }

    @Test
    void testSumEvenNumbers_noEven() {
        assertEquals(0, NumberProcessor.sumEvenNumbers(1));
    }
}