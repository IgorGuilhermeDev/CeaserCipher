/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rocha.igor.caesarcipher;

import java.util.Scanner;

/**
 *
 * @author igor-guilherme-rocha
 */
public class Main {

    public static void main(String[] args) {
        Main.getUserInput();
    }

    public static void getUserInput() {
        Scanner in = new Scanner(System.in);
        System.out.println("Deseja criptografar ou descriptografar ? (c/d): ");
        String encryptOrDecrypt = in.nextLine();
        System.out.println("Digite a frase que seja criptografar: ");
        String phrase = in.nextLine();
        System.out.println("Quantas trocas deseja usar: ");
        String shift = in.nextLine();
        Validation validation = Main.userInputValidations(phrase, shift, encryptOrDecrypt);
        if (validation.getIsSafe()) {
            String encryptOrDecryptResponse = encryptOrDecrypt.equalsIgnoreCase("d") ? "Descriptografada" : "Criptografia";
            int convertedShift = Integer.parseInt(shift);
            String convertedPhrase = encryptOrDecrypt.equalsIgnoreCase("d") ? CaesarCipher.decrypt(phrase, convertedShift) : CaesarCipher.encrypt(phrase, convertedShift);
            System.out.println(String.format("Frase %s: %s", encryptOrDecryptResponse, convertedPhrase));
        } else {
            System.out.println(validation.getErrorMessage());
        }

    }

    public static Validation userInputValidations(String phrase, String shift, String encryptOrDecrypt) {
        try {
            if (!(encryptOrDecrypt.equalsIgnoreCase("c") || encryptOrDecrypt.equalsIgnoreCase("d"))) {
                return new Validation(false, "Digite d para descriptografia ou c para criptografia.");
            }
            if (phrase.isBlank()) {
                return new Validation(false, "A frase deve conter pelo menos um caractere válido.");
            }
            Integer.valueOf(shift);
        } catch (NumberFormatException e) {
            return new Validation(false, "O valor das trocas deve ser um número.");
        }
        return new Validation(true);
    }

}
