package com.invoice.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "invoice")
public class InvoiceEntity extends BaseEntity{
		
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
	
	@ManyToOne
    @JoinColumn(name="customer_id")
    private CustomerEntity customer;
	
	@ManyToOne
    @JoinColumn(name="provider_id")
    private ProviderEntity provider;
	
	@OneToMany(mappedBy = "invoice")
	private List<PaymentEntity> payments = new ArrayList<>();
	
}
