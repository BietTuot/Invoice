package com.invoice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "customer")
public class CustomerEntity extends BaseEntity{

	@Column
	private String name;
	
	@Column
	private String socialReason;
	
	@Column
	private String legalStatus;
	
	@Column
	private String siren;
	
	@Column
	private String siret;
	
	@Column
	private String address;

}
