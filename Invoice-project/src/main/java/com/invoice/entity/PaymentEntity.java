package com.invoice.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "payment")
public class PaymentEntity extends BaseEntity{

	@Column(name = "paymentdate") 
	private Date paymentDate;
	
	@Column(name = "amount")
	private double amount;
	
	@Column(name = "currency")
	private String currency;
	
	@Column(name = "idinvoice")
	private int idInvoice;
	
	@Column(name = "iddebitaccount")
	private int idDebitAccount;
	
	@Column(name = "idcreditaccount")
	private int idCreditAccount;

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public int getIdInvoice() {
		return idInvoice;
	}

	public void setIdInvoice(int idInvoice) {
		this.idInvoice = idInvoice;
	}

	public int getIdDebitAccount() {
		return idDebitAccount;
	}

	public void setIdDebitAccount(int idDebitAccount) {
		this.idDebitAccount = idDebitAccount;
	}

	public int getIdCreditAccount() {
		return idCreditAccount;
	}

	public void setIdCreditAccount(int idCreditAccount) {
		this.idCreditAccount = idCreditAccount;
	}
	
	
	
}
