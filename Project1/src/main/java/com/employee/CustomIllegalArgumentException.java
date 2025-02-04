package com.employee;

public class CustomIllegalArgumentException extends IllegalArgumentException{
    CustomIllegalArgumentException(String message){
        super(message);
    }
}
