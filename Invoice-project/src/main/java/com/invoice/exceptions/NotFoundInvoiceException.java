package com.invoice.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundInvoiceException extends RuntimeException{

	public NotFoundInvoiceException(String criterias) {
		super("Not found invoice in entry : " + criterias);	
	}
}
