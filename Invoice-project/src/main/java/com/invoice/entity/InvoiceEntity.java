package com.invoice.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "invoice")
public class InvoiceEntity extends BaseEntity{
	
	@Column(name="providerid")
	private long providerId;
	
	@Column(name="customerid")
	private long customerId;
	
	@Column(name="invoicenumber")
	private int invoiceNumber;
	
	@Column(name="invoicingdate")
	private Date invoicingDate;
	
	@Column(name="duedate")
	private Date dueDate;
	
	@Column(name="totalamountexcl")
	private double totalAmountExcl;
	
	@Column(name="totalamountincl")
	private double totalAmountIncl;
	
	@Column(name="vat")
	private double vat;
	
	@Column(name="object")
	private String object;
	
	@Column(name="type")
	private String type;
	
	@Column(name="statut")
	private String statut;
	
}
