package com.project.bank.transactions.details.Transactions.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetDepositsResponseModel {
	
	@JsonProperty(required=true,value="amountDeposited")
	Double amountDeposited; 
	@JsonProperty(required=true,value="accountNumber")
	Long accountNumber; 
	@JsonProperty(required=true,value="natureOfAccount")
	String natureOfAccount; 
	@JsonProperty(required=true,value="balanceAfterDeposit")
	String balanceAfterDeposit;
	@JsonProperty(required=true,value="accountHolder")
	String accountHolder;	
	@JsonProperty(required=true,value="status")
	String status;

	public GetDepositsResponseModel(){
		
	}

	public GetDepositsResponseModel(Double amountDeposited, Long accountNumber, String natureOfAccount,
			String balanceAfterDeposit, String accountHolder, String status) {
		super();
		this.amountDeposited = amountDeposited;
		this.accountNumber = accountNumber;
		this.natureOfAccount = natureOfAccount;
		this.balanceAfterDeposit = balanceAfterDeposit;
		this.accountHolder = accountHolder;
		this.status = status;
	}

	public Double getAmountDeposited() {
		return amountDeposited;
	}

	public void setAmountDeposited(Double amountDeposited) {
		this.amountDeposited = amountDeposited;
	}

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getNatureOfAccount() {
		return natureOfAccount;
	}

	public void setNatureOfAccount(String natureOfAccount) {
		this.natureOfAccount = natureOfAccount;
	}

	public String getBalanceAfterDeposit() {
		return balanceAfterDeposit;
	}

	public void setBalanceAfterDeposit(String balanceAfterDeposit) {
		this.balanceAfterDeposit = balanceAfterDeposit;
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
		return "GetDepositsResponseModel [amountDeposited=" + amountDeposited + ", accountNumber=" + accountNumber
				+ ", natureOfAccount=" + natureOfAccount + ", balanceAfterDeposit=" + balanceAfterDeposit
				+ ", accountHolder=" + accountHolder + ", status=" + status + "]";
	}
	
	
}
