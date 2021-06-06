package com.project.bank.transactions.details.Transactions.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PosWithdrawlResponseModel {

	@JsonProperty(required=true, value="amountWithdrawn")
	private double amountWithdrawn;
	@JsonProperty(required=true, value="natureOfAcccount")
	private String natureOfAccount; 
	@JsonProperty(required=true, value="accountNumber")
	private long accountNumber; 
	@JsonProperty(required=true, value="acccountHolder")
	private 	String accountHolder;
	@JsonProperty(required=true, value="status")
	private 	String status;

	
	public PosWithdrawlResponseModel (){	
	}


	public PosWithdrawlResponseModel(double amountWithdrawn, String natureOfAccount, long accountNumber,
			String accountHolder, String status) {
		super();
		this.amountWithdrawn = amountWithdrawn;
		this.natureOfAccount = natureOfAccount;
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.status = status;
	}


	public double getAmountWithdrawn() {
		return amountWithdrawn;
	}


	public void setAmountWithdrawn(double amountWithdrawn) {
		this.amountWithdrawn = amountWithdrawn;
	}


	public String getNatureOfAccount() {
		return natureOfAccount;
	}


	public void setNatureOfAccount(String natureOfAccount) {
		this.natureOfAccount = natureOfAccount;
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


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "PosWithdrawlResponseModel [amountWithdrawn=" + amountWithdrawn + ", natureOfAccount=" + natureOfAccount
				+ ", accountNumber=" + accountNumber + ", accountHolder=" + accountHolder + ", status=" + status + "]";
	}
	
	
	
	
	
}
