package com.example.ticketservice.exception;

/**
 * @author Vithum vindeepa
 */
public class QuantityExceededException extends RuntimeException {
    public QuantityExceededException(String message) {
        super(message);
    }
}
