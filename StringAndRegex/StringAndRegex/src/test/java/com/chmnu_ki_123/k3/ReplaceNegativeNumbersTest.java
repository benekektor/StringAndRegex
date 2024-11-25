package com.chmnu_ki_123.k3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReplaceNegativeNumbersTest {

    @Test
    public void testReplaceNegativeNumbers() {

        String input = "String 12 with numbers -1, 2, 5, -4, 12. Replace all negative";
        String expected = "String 12 with numbers [], 2, 5, [], 12. Replace all negative";
        String result = ReplaceNegativeNumbers.replaceNegativeNumbers(input);
        assertEquals(expected, result);

        input = "No negative numbers here 1, 2, 3";
        expected = "No negative numbers here 1, 2, 3";
        result = ReplaceNegativeNumbers.replaceNegativeNumbers(input);
        assertEquals(expected, result);

        input = "Negative numbers only: -1, -2, -3";
        expected = "Negative numbers only: [], [], []";
        result = ReplaceNegativeNumbers.replaceNegativeNumbers(input);
        assertEquals(expected, result);

        input = "No numbers here!";
        expected = "No numbers here!";
        result = ReplaceNegativeNumbers.replaceNegativeNumbers(input);
        assertEquals(expected, result);

        input = "";
        expected = "";
        result = ReplaceNegativeNumbers.replaceNegativeNumbers(input);
        assertEquals(expected, result);
    }
}
