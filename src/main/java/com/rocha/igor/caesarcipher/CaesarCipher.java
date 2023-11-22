package com.rocha.igor.caesarcipher;

/**
 *
 * @author igor-guilherme-rocha
 */
public class CaesarCipher {
    private static char encryptChar(char ch, int shift) {
        if (Character.isLetter(ch)) {
            char shiftedChar = (char) (ch + shift);
            if ((Character.isLowerCase(ch) && shiftedChar > 'z') || (Character.isUpperCase(ch) && shiftedChar > 'Z')) {
                shiftedChar = (char) (ch - (26 - shift));
            }

            return shiftedChar;
        } else {
            return ch;
        }

    }

    public static String encrypt(String message, int shift) {
        StringBuilder encryptedMessage = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);
            char encryptedChar = encryptChar(ch, shift);
            encryptedMessage.append(encryptedChar);
        }

        return encryptedMessage.toString();
    }

    public static String decrypt(String message, int shift) {
        return encrypt(message, -shift);
    }

}
