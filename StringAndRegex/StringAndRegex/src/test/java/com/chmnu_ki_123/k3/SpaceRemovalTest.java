package com.chmnu_ki_123.k3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SpaceRemovalTest {

    @Test
    public void testSpaceRemoval() {

        String sentence = " Почнемо, браття, пісню невеселу Словами призабутими старими Про Ігорів згорьований похід ";
        String expected = "Почнемо, браття, пісню невеселу Словами призабутими старими Про Ігорів згорьований похід";
        String result = SpaceRemoval.removeExtraSpaces(sentence);
        assertEquals(expected, result);

        sentence = "Hello     world!    Let's   test    this   string.";
        expected = "Hello world! Let's test this string.";
        result = SpaceRemoval.removeExtraSpaces(sentence);
        assertEquals(expected, result);

        sentence = "   This is a test.  ";
        expected = "This is a test.";
        result = SpaceRemoval.removeExtraSpaces(sentence);
        assertEquals(expected, result);

        sentence = "";
        expected = "";
        result = SpaceRemoval.removeExtraSpaces(sentence);
        assertEquals(expected, result);
    }
}
