package com.invoice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class AccountEntity extends BaseEntity{
	
	@Column
	private String bic;
	
	@Column
	private String iban;
	
	@Column
	private String bankId;
		
}
