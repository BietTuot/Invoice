package com.invoice.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "invoice")
public class InvoiceEntity extends BaseEntity{
	
	@Column
	private long providerId;
	
	@Column
	private long customerId;
	
	@Column
	private int invoiceNumber;
	
	@Column
	private Date invoicingDate;
	
	@Column
	private Date dueDate;
	
	@Column
	private double totalAmountExcl;
	
	@Column
	private double totalAmountIncl;
	
	@Column
	private double vat;
	
	@Column
	private String object;
	
	@Column
	private String type;
	
	@Column
	private String statut;
	
}
