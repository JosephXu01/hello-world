package org.joseph.hello.exception;

import lombok.Data;

@Data
public class ExceptionResponse {
	private String message;
	
	ExceptionResponse(String message){
		this.message = message;
	}
}
