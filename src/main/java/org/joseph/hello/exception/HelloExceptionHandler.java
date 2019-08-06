package org.joseph.hello.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class HelloExceptionHandler {

	@ExceptionHandler(HelloBadRequestEcxeption.class)
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@ResponseBody
	public ExceptionResponse handleException(HelloBadRequestEcxeption ex) {
		return new ExceptionResponse(ex.getMessage());
	}
	
	@ExceptionHandler(HelloUnexpectedEcxeption.class)
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ResponseBody
	public ExceptionResponse handleException(HelloUnexpectedEcxeption ex) {
		return new ExceptionResponse(ex.getMessage());
	}
}
