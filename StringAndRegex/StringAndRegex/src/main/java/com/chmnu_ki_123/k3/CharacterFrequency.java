package com.chmnu_ki_123.k3;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {

    public static Map<Character, Integer> getCharacterFrequency(String input) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char ch : input.toCharArray()) {
            if (Character.isWhitespace(ch)) {
                continue;
            }
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        return frequencyMap;
    }

    public static void main(String[] args) {
        String input = "Підрахувати частоту входження символів у заданому рядку";
        Map<Character, Integer> frequencyMap = getCharacterFrequency(input);

        System.out.println("Частота входження символів:");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "' : " + entry.getValue());
        }
    }
}
