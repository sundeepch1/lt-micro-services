package com.skc.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler
	public String handleAgeInvalidCase(AgeInvalidException exception) {
		return exception.getMessage();
	}
}
