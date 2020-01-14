package com.invoice.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "provider")
public class ProviderEntity extends BaseEntity {

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

	@OneToMany(mappedBy = "provider")
	private List<InvoiceEntity> invoices = new ArrayList<>();
	
	@OneToMany(mappedBy = "provider")
	private List<AccountEntity> accounts = new ArrayList<>();
	
}
