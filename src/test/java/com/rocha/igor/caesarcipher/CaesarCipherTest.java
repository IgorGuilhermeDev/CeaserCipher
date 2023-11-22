package com.rocha.igor.caesarcipher;

import com.rocha.igor.caesarcipher.CaesarCipher;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaesarCipherTest {

    @Test
    public void testEncrypt() {
        assertEquals("Khoor, Zruog!", CaesarCipher.encrypt("Hello, World!", 3));
        assertEquals("Ifmmp, Xpsme!", CaesarCipher.encrypt("Hello, World!", 1));
        assertEquals("Wklv lv d whvw phvvdjh", CaesarCipher.encrypt("This is a test message", 3));
        assertEquals("abcde", CaesarCipher.encrypt("abcde", 0)); 
        assertEquals("zabcd", CaesarCipher.encrypt("abcde", 25));
        assertEquals("Bcdefgh Ijklmno Pqrstu Vwxyza", CaesarCipher.encrypt("Abcdefg Hijklmn Opqrst Uvwxyz", 1));
        assertEquals("12345", CaesarCipher.encrypt("12345", 10));
        assertEquals("!@#$%^&*()", CaesarCipher.encrypt("!@#$%^&*()", 5));
        assertEquals("Axikma apwctl zmuiqv", CaesarCipher.encrypt("Spaces should remain", 8));
        assertEquals("", CaesarCipher.encrypt("", 5));
    }

    @Test
    public void testDecrypt() {
        assertEquals("Hello, World!", CaesarCipher.decrypt("Khoor, Zruog!", 3));
        assertEquals("Hello, World!", CaesarCipher.decrypt("Ifmmp, Xpsme!", 1));
        assertEquals("This is a test message", CaesarCipher.decrypt("Wklv lv d whvw phvvdjh", 3));
        assertEquals("abcde", CaesarCipher.decrypt("abcde", 0));
        assertEquals("Abcdef Ghijklm Nopqrs Tuvwxy", CaesarCipher.decrypt("Bcdefg Hijklmn Opqrst Uvwxyz", 1)); 
        assertEquals("12345", CaesarCipher.decrypt("12345", 10)); 
        assertEquals("!@#$%^&*()", CaesarCipher.decrypt("!@#$%^&*()", 5)); 
    }
}
