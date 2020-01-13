package com.invoice.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NotFoundParameterException extends RuntimeException{

	public NotFoundParameterException(String params) {
		super("Parameter(s) Required missing : " + params);
		
	}
}
