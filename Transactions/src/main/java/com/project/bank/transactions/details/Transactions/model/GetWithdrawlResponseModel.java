package com.project.bank.transactions.details.Transactions.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetWithdrawlResponseModel {

	@JsonProperty(required=true, value="amountWithdrawn")
	private double amountWithdrawn;
	@JsonProperty(required=true, value="natureOfAcccount")
	private String natureOfAccount; 
	@JsonProperty(required=true, value="dateOfwithdrawl")
	private Date dateOfWithdrawl;
	@JsonProperty(required=true, value="accountNumber")
	private long accountNumber; 
	@JsonProperty(required=true, value="acccountHolder")
	private 	String accountHolder;
	
	public GetWithdrawlResponseModel(){		
	}

	public GetWithdrawlResponseModel(double amountWithdrawn, String natureOfAccount, Date dateOfWithdrawl,
			long accountNumber, String accountHolder) {
		super();
		this.amountWithdrawn = amountWithdrawn;
		this.natureOfAccount = natureOfAccount;
		this.dateOfWithdrawl = dateOfWithdrawl;
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
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
	public Date getDateOfWithdrawl() {
		return dateOfWithdrawl;
	}
	public void setDateOfWithdrawl(Date dateOfWithdrawl) {
		this.dateOfWithdrawl = dateOfWithdrawl;
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

	
	
	
}
