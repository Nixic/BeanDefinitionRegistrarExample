package ru.nixic.exception;

import lombok.Data;

@Data
public class ErrorResponse {
    private Integer errorCode;
    private String message;
}
