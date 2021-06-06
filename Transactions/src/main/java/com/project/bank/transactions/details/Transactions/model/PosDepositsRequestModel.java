package com.project.bank.transactions.details.Transactions.model;

import java.util.Date;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PosDepositsRequestModel {

	@JsonProperty(required=true,value="amountDeposited")
	Double amountDeposited; 
	@JsonProperty(required=true,value="dateOfDeposit")
	Date dateOfDeposit;
	@JsonProperty(required=true,value="accountNumber")
	Long accountNumber; 
	@JsonProperty(required=true,value="natureOfAccount")
	String natureOfAccount; 
	@JsonProperty(required=true,value="accountHolder")
	String accountHolder;
	@JsonProperty("balanceAfterDeposit")
	double balanceAfterDeposit;
	
	public PosDepositsRequestModel(){
		
	}


	public PosDepositsRequestModel(double amountDeposited, Date dateOfDeposit, long accountNumber,
			String natureOfAccount, String accountHolder) {
		super();
		this.amountDeposited = amountDeposited;
		this.dateOfDeposit = dateOfDeposit;
		this.accountNumber = accountNumber;
		this.natureOfAccount = natureOfAccount;
		this.accountHolder = accountHolder;
	}


	
	
	public double getBalanceAfterDeposit() {
		return balanceAfterDeposit;
	}


	public void setBalanceAfterDeposit(double balanceAfterDeposit) {
		this.balanceAfterDeposit = balanceAfterDeposit;
	}


	public void setAmountDeposited(Double amountDeposited) {
		this.amountDeposited = amountDeposited;
	}


	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}


	public double getAmountDeposited() {
		return amountDeposited;
	}


	public void setAmountDeposited(double amountDeposited) {
		this.amountDeposited = amountDeposited;
	}


	public Date getDateOfDeposit() {
		return dateOfDeposit;
	}


	public void setDateOfDeposit(Date dateOfDeposit) {
		this.dateOfDeposit = dateOfDeposit;
	}


	public long getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}


	public String getNatureOfAccount() {
		return natureOfAccount;
	}


	public void setNatureOfAccount(String natureOfAccount) {
		this.natureOfAccount = natureOfAccount;
	}



	public String getAccountHolder() {
		return accountHolder;
	}


	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}


	@Override
	public String toString() {
		return "PosDepositsRequestModel [amountDeposited=" + amountDeposited + ", dateOfDeposit=" + dateOfDeposit
				+ ", accountNumber=" + accountNumber + ", natureOfAccount=" + natureOfAccount + 
				 " accountHolder=" + accountHolder + "]";
	}
	
	
}
