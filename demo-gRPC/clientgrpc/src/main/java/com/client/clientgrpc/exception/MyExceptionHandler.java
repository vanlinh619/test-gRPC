package com.client.clientgrpc.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public Exception handler(Exception e) {
        e.printStackTrace();
        return e;
    }
}
