package com.chmnu_ki_123.k3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Map;
import java.util.HashMap;

public class CharacterFrequencyTest {

    @Test
    public void testCharacterFrequency() {
        String input = "Підрахувати частоту входження символів у заданому рядку";
        Map<Character, Integer> result = CharacterFrequency.getCharacterFrequency(input);

        assertEquals(2, result.get('і'));
    }
}



