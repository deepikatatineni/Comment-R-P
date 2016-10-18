package com.commentapp;


/**
 * Network Exception for the application.
 */
public class NetworkRequestException extends Exception{
    public NetworkRequestException(String message){
        super(message);
    }
}
