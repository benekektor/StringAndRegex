package com.chmnu_ki_123.k3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CaesarCypherTest {

    @Test
    public void testEncrypt() {

        assertEquals("Khoor, Zruog!", CaesarCypher.encrypt("Hello, World!", 3));

        assertEquals("Hello, World!", CaesarCypher.encrypt("Hello, World!", 0));

        assertEquals("Ebiil, Tloia!", CaesarCypher.encrypt("Hello, World!", -3));

        assertEquals("Khoor, Zruog!", CaesarCypher.encrypt("Hello, World!", 29)); // 29 % 26 == 3

        assertEquals("1234, @#&!", CaesarCypher.encrypt("1234, @#&!", 3));

        assertEquals("", CaesarCypher.encrypt("", 3));
    }
}
