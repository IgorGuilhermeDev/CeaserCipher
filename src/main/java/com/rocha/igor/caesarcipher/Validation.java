package com.rocha.igor.caesarcipher;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author igor-guilherme-rocha
 */
public class Validation {
    private Boolean isSafe;
    private String errorMessage;
    private String successfulMessage;
    
    public Validation(boolean isSafe){
        this.isSafe = isSafe;
    }
    
     public Validation(boolean isSafe, String message){
        this.isSafe = isSafe;
        if (isSafe) this.successfulMessage = message;
        else this.errorMessage = message;
    }
     
    public Boolean getIsSafe() {
        return isSafe;
    }

    public void setIsSafe(Boolean isSafe) {
        this.isSafe = isSafe;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getSuccessfulMessage() {
        return successfulMessage;
    }

    public void setSuccessfulMessage(String successfulMessage) {
        this.successfulMessage = successfulMessage;
    }
    
    
}
