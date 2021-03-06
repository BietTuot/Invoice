package com.invoice.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "payment")
public class PaymentEntity extends BaseEntity{

	@Column 
	private Date paymentDate;
	
	@Column
	private double amount;
	
	@Column
	private String currency;
	
	@Column
	private int debitAccountId;
	
	@Column
	private int creditAccountId;

}

