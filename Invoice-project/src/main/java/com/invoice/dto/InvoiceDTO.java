package com.invoice.dto;

import java.util.Date;

public class InvoiceDTO {
	private long id;
	private long providerId;
	private long customerId;
	private int invoiceNumber;
	private Date invoicingDate;
	private Date dueDate;
	private Date createdOnDate;
	private Date modifiedOnDate;
	private String createdBy;
	private String modifiedBy;
	private double totalAmountExcl;
	private double totalAmountIncl;
	private double vat;
	private String object;
	private String type;
	private String statut;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getObject() {
		return object;
	}
	public void setObject(String object) {
		this.object = object;
	}
	public long getProviderId() {
		return providerId;
	}
	public void setProviderId(long providerId) {
		this.providerId = providerId;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public int getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(int invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public Date getInvoicingDate() {
		return invoicingDate;
	}
	public void setInvoicingDate(Date invoicingDate) {
		this.invoicingDate = invoicingDate;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public Date getCreatedOnDate() {
		return createdOnDate;
	}
	public void setCreatedOnDate(Date createdOnDate) {
		this.createdOnDate = createdOnDate;
	}
	public Date getModifiedOnDate() {
		return modifiedOnDate;
	}
	public void setModifiedOnDate(Date modifiedOnDate) {
		this.modifiedOnDate = modifiedOnDate;
	}
	public double getTotalAmountExcl() {
		return totalAmountExcl;
	}
	public void setTotalAmountExcl(double totalAmountExcl) {
		this.totalAmountExcl = totalAmountExcl;
	}
	public double getTotalAmountIncl() {
		return totalAmountIncl;
	}
	public void setTotalAmountIncl(double totalAmountIncl) {
		this.totalAmountIncl = totalAmountIncl;
	}
	public double getVat() {
		return vat;
	}
	public void setVat(double vat) {
		this.vat = vat;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	
	

	
	
	
}
