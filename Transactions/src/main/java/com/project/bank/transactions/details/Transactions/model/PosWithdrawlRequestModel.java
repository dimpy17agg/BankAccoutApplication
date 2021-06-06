package com.project.bank.transactions.details.Transactions.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PosWithdrawlRequestModel {

	@JsonProperty(required=true, value="amountWithdrawn")
	private double amountWithdrawn;
	@JsonProperty(required=true, value="natureOfAccount")
	private String natureOfAccount; 
	@JsonProperty(required=true, value="dateOfWithdrawl")
	private Date dateOfWithdrawl;
	@JsonProperty(required=true, value="accountNumber")
	private long accountNumber; 
	@JsonProperty(required=true, value="accountHolder")
	private String accountHolder;
	@JsonProperty("balanceAfterWithdrawl")
	private double balanceAfterWithdrawl;
	public PosWithdrawlRequestModel(){
		
	}
	public PosWithdrawlRequestModel(double amountWithdrawn, String natureOfAccount, Date dateOfWithdrawl,
			long accountNumber, String accountHolder) {
		super();
		this.amountWithdrawn = amountWithdrawn;
		this.natureOfAccount = natureOfAccount;
		this.dateOfWithdrawl = dateOfWithdrawl;
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
	}
	
	public Date getDateOfWithdrawl() {
		return dateOfWithdrawl;
	}
	public void setDateOfWithdrawl(Date dateOfWithdrawl) {
		this.dateOfWithdrawl = dateOfWithdrawl;
	}
	public double getBalanceAfterWithdrawl() {
		return balanceAfterWithdrawl;
	}
	public void setBalanceAfterWithdrawl(double balanceAfterWithdrawl) {
		this.balanceAfterWithdrawl = balanceAfterWithdrawl;
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
	public Date getDateOfWithdrawal() {
		return dateOfWithdrawl;
	}
	public void setDateOfWithdrawal(Date dateOfWithdrawl) {
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
	@Override
	public String toString() {
		return "PosWithdrawlRequestModel [amountWithdrawn=" + amountWithdrawn + ", natureOfAccount=" + natureOfAccount
				+ ", dateOfWithdrawl=" + dateOfWithdrawl + ", accountNumber=" + accountNumber + ", accountHolder="
				+ accountHolder + "]";
	}


	
	
	
	
	
	
}
