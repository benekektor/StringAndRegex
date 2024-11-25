package com.chmnu_ki_123.k3;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CaesarDecypherTest {

    @Test
    public void testDecrypt() {

        assertEquals("Hello, World!", CaesarDecypher.decrypt("Khoor, Zruog!", 3));

        assertEquals("", CaesarDecypher.decrypt("", 3));
    }
}
