package com.chmnu_ki_123.k3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SentenceTemplateTest {

    @Test
    public void testSentenceTemplate() {

        String sentence = "Почнемо, браття, пісню невеселу Словами призабутими старими Про Ігорів згорьований похід..";
        String expected = "Почнемо браття пісню невеселу призабутими Про Ігорів згорьований похід";
        String result = SentenceTemplate.removeWordsStartingWithS(sentence);
        assertEquals(expected, result);

        sentence = "This is a simple sentence.";
        expected = "This is a simple sentence";
        result = SentenceTemplate.removeWordsStartingWithS(sentence);
        assertEquals(expected, result);

        sentence = "Слово Сказати Справжнє Сказано";
        expected = "";
        result = SentenceTemplate.removeWordsStartingWithS(sentence);
        assertEquals(expected, result);

        sentence = "";
        expected = "";
        result = SentenceTemplate.removeWordsStartingWithS(sentence);
        assertEquals(expected, result);

        sentence = "Hello world! Let's test this string.";
        expected = "Hello world Let's test this string";
        result = SentenceTemplate.removeWordsStartingWithS(sentence);
        assertEquals(expected, result);
    }
}
