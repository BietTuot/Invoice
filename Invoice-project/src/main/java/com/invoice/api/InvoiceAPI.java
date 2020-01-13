package com.invoice.api;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.invoice.dto.InvoiceDTO;


@RestController
public class InvoiceAPI {
	
	
	@PostMapping(path = "/invoice")
	public InvoiceDTO createInvoice(@RequestBody InvoiceDTO invoice){
		return invoice;

	}

	@PutMapping(path = "/invoice")
	public InvoiceDTO updateInvoice(@RequestBody InvoiceDTO invoice){
		return invoice;

	}
	
	@DeleteMapping(path = "/invoice")
	public void deleteInvoice(@RequestBody InvoiceDTO invoice){

	}
	
}
