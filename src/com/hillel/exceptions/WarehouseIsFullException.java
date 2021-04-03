package com.hillel.exceptions;

public class WarehouseIsFullException extends Exception{
    public WarehouseIsFullException(String message) {
        super(message);
    }
}
