package ru.nixic.exception;

/**
 * Bad request c HttpStatus = 400
 */
public class BadRequestException extends RuntimeException {

    public BadRequestException(String message) {
        super(message);
    }
}
