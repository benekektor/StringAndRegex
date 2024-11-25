package com.chmnu_ki_123.k3;

public class CaesarDecypher {
    public static String decrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();
        shift = shift % 26;

        for (char character : text.toCharArray()) {
            if (Character.isLetter(character)) {
                char base = Character.isUpperCase(character) ? 'A' : 'a';
                char decryptedChar = (char) ((character - base - shift + 26) % 26 + base);
                result.append(decryptedChar);
            } else {
                result.append(character);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String originalText = "Khoor Zruog!";
        int shift = 3;
        String decryptedText = decrypt(originalText, shift);

        System.out.println("Original: " + originalText);
        System.out.println("Decrypted: " + decryptedText);
    }
}
