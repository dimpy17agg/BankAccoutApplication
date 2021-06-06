package com.project.bank.transactions.details.Transactions.model;

import java.util.Date;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PosInterAccountTransferRequestModel {

	@JsonProperty(required=true,value="amountTransferred")
	double amountTransferred; 
	@JsonProperty(required=true,value="dateOfTransfer")
	Date dateOfTransfer; 
	@JsonProperty(required=true,value="accountNumberFrom")
	long accountNumberFrom; 
	@JsonProperty(required=true,value="accountNumberTo")
	long accountNumberTo;
	@JsonProperty(required=true,value="creditAccName")
	String creditAccName; 
	@JsonProperty(required=true,value="debitAccName")
	String debitAccName; 
	@JsonProperty(required=true,value="modeOfTransfer")
	String modeOfTransfer;
	public PosInterAccountTransferRequestModel(){
		
	}
	public PosInterAccountTransferRequestModel(double amountTransferred, Date dateOfTransfer, long accountNumberFrom,
			long accountNumberTo, String creditAccName, String debitAccName, String modeOfTransfer) {
		super();
		this.amountTransferred = amountTransferred;
		this.dateOfTransfer = dateOfTransfer;
		this.accountNumberFrom = accountNumberFrom;
		this.accountNumberTo = accountNumberTo;
		this.creditAccName = creditAccName;
		this.debitAccName = debitAccName;
		this.modeOfTransfer = modeOfTransfer;
	}
	public double getAmountTransferred() {
		return amountTransferred;
	}
	public void setAmountTransferred(double amountTransferred) {
		this.amountTransferred = amountTransferred;
	}
	public Date getDateOfTransfer() {
		return dateOfTransfer;
	}
	public void setDateOfTransfer(Date dateOfTransfer) {
		this.dateOfTransfer = dateOfTransfer;
	}
	public long getAccountNumberFrom() {
		return accountNumberFrom;
	}
	public void setAccountNumberFrom(long accountNumberFrom) {
		this.accountNumberFrom = accountNumberFrom;
	}
	public long getAccountNumberTo() {
		return accountNumberTo;
	}
	public void setAccountNumberTo(long accountNumberTo) {
		this.accountNumberTo = accountNumberTo;
	}
	public String getCreditAccName() {
		return creditAccName;
	}
	public void setCreditAccName(String creditAccName) {
		this.creditAccName = creditAccName;
	}
	public String getDebitAccName() {
		return debitAccName;
	}
	public void setDebitAccName(String debitAccName) {
		this.debitAccName = debitAccName;
	}
	public String getModeOfTransfer() {
		return modeOfTransfer;
	}
	public void setModeOfTransfer(String modeOfTransfer) {
		this.modeOfTransfer = modeOfTransfer;
	}
	@Override
	public String toString() {
		return "PosInterAccountTransferRequestModel [amountTransferred=" + amountTransferred + ", dateOfTransfer="
				+ dateOfTransfer + ", accountNumberFrom=" + accountNumberFrom + ", accountNumberTo=" + accountNumberTo
				+ ", creditAccName=" + creditAccName + ", debitAccName=" + debitAccName + ", modeOfTransfer="
				+ modeOfTransfer + "]";
	}
	
	
	
	
	
	
}
