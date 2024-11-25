package com.chmnu_ki_123.k3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

public class MaxDigitArrayTest {

    @Test
    public void testCountDigits() {
        assertEquals(3, MaxDigitArray.countDigits(123));
        assertEquals(2, MaxDigitArray.countDigits(45));
        assertEquals(5, MaxDigitArray.countDigits(67890));
        assertEquals(1, MaxDigitArray.countDigits(7));
        assertEquals(5, MaxDigitArray.countDigits(-89012));
    }

    @Test
    public void testFindMaxDigitNumbers() {
        int[] numbers = {123, 45, 67890, 12345, 7, 89012, 56};
        int[] expectedResult = {67890, 12345, 89012};
        int[] result = MaxDigitArray.getNumbersWithMaxDigits(numbers);

        assertArrayEquals(expectedResult, result);
    }
}
