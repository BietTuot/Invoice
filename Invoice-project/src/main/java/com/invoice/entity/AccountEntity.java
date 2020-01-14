package com.invoice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class AccountEntity extends BaseEntity{

//	@Column
//	private int providerId;
//	
//	@Column
//	private int customerId;
	
	@Column
	private String bic;
	
	@Column
	private String iban;
	
	@Column
	private String bankId;
	
	@ManyToOne
    @JoinColumn(name="customer_id")
    private CustomerEntity customer;
	
	@ManyToOne
    @JoinColumn(name="provider_id")
    private ProviderEntity provider;

//	public int getProviderId() {
//		return providerId;
//	}
//
//	public void setProviderId(int providerId) {
//		this.providerId = providerId;
//	}
//
//	public int getCustomerId() {
//		return customerId;
//	}
//
//	public void setCustomerId(int customerId) {
//		this.customerId = customerId;
//	}

	public String getBic() {
		return bic;
	}

	public void setBic(String bic) {
		this.bic = bic;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public String getBankId() {
		return bankId;
	}

	public void setBankId(String bankId) {
		this.bankId = bankId;
	}

	public CustomerEntity getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerEntity customer) {
		this.customer = customer;
	}

	public ProviderEntity getProvider() {
		return provider;
	}

	public void setProvider(ProviderEntity provider) {
		this.provider = provider;
	}

	
	
}
