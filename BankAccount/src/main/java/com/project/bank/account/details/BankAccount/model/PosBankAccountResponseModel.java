package com.project.bank.account.details.BankAccount.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PosBankAccountResponseModel {

	@JsonProperty("accountNumber")
	private long accountNumber;
	@JsonProperty("accountHolder")
	private String accountHolder;
	@JsonProperty("accountInitiatedOn")
	private Date accountInitiatedOn;
	@JsonProperty("accountOpeningStatus")
	private String accountOpeningStatus="Success";
	
   public PosBankAccountResponseModel(){
		
	}

public PosBankAccountResponseModel(long accountNumber, String accountHolder, Date accountInitiatedOn,
		String accountOpeningStatus) {
	super();
	this.accountNumber = accountNumber;
	this.accountHolder = accountHolder;
	this.accountInitiatedOn = accountInitiatedOn;
	this.accountOpeningStatus = accountOpeningStatus;
}

public long getAccountNumber() {
	return accountNumber;
}

public void setAccountNumber(long accountNumber) {
	this.accountNumber = accountNumber;
}

public String getAccountHolder() {
	return accountHolder;
}

public void setAccountHolder(String accountHolder) {
	this.accountHolder = accountHolder;
}

public Date getAccountInitiatedOn() {
	return accountInitiatedOn;
}

public void setAccountInitiatedOn(Date accountInitiatedOn) {
	this.accountInitiatedOn = accountInitiatedOn;
}

public String getAccountOpeningStatus() {
	return accountOpeningStatus;
}

public void setAccountOpeningStatus(String accountOpeningStatus) {
	this.accountOpeningStatus = accountOpeningStatus;
}

@Override
public String toString() {
	return accountNumber+""+accountHolder+""+accountInitiatedOn+""+accountOpeningStatus;
}
	
	
	
	
}
