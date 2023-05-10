package com.Employee.Employee.customError;

public class Not_Found_Exception extends RuntimeException {

    public Not_Found_Exception(String message) {
        super(message);
    }
}
