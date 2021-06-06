package com.project.bank.transactions.details.Transactions.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PosDepositsResponseModel {

	@JsonProperty(required=true,value="amountDeposited")
	Double amountDeposited; 
	@JsonProperty(required=true,value="accountNumber")
	Long accountNumber; 
	@JsonProperty(required=true,value="natureOfAccount")
	String natureOfAccount; 
	//@JsonProperty(required=true,value="balanceAfterDeposit")
	//String balanceAfterDeposit;
	@JsonProperty(required=true,value="accountHolder")
	String accountHolder;
	
	@JsonProperty(required=true,value="status")
	String status;

	public PosDepositsResponseModel(){
		
	}
	
	public PosDepositsResponseModel(double amountDeposited, long accountNumber, String natureOfAccount,
			String accountHolder, String status) {
		super();
		this.amountDeposited = amountDeposited;
		this.accountNumber = accountNumber;
		this.natureOfAccount = natureOfAccount;
		this.accountHolder = accountHolder;
		this.status = status;
	}

	public double getAmountDeposited() {
		return amountDeposited;
	}

	public void setAmountDeposited(double amountDeposited) {
		this.amountDeposited = amountDeposited;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "PosDepositsResponseModel [amountDeposited=" + amountDeposited + ", accountNumber=" + accountNumber
				+ ", natureOfAccount=" + natureOfAccount + ", accountHolder=" + accountHolder + ", status=" + status
				+ "]";
	}
	
	
}
