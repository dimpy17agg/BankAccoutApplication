package com.project.bank.account.details.BankAccount.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PosLoanResponseModel {

	
	@JsonProperty(required=true, value="loanAccountNumber")
	private long loanAccountNumber;
	@JsonProperty(required=true, value="loanAccountHolder")
	String loanAccountHolder;
	
	@JsonProperty(required=true, value="loanDetailsStatus")
	String loanDetailsStatus;

	public PosLoanResponseModel(){
		
	}
	public PosLoanResponseModel(long loanAccountNumber, String loanAccountHolder, String loanDetailsStatus) {
		super();
		this.loanAccountNumber = loanAccountNumber;
		this.loanAccountHolder = loanAccountHolder;
		this.loanDetailsStatus = loanDetailsStatus;
	}

	public long getLoanAccountNumber() {
		return loanAccountNumber;
	}

	public void setLoanAccountNumber(long loanAccountNumber) {
		this.loanAccountNumber = loanAccountNumber;
	}

	public String getLoanAccountHolder() {
		return loanAccountHolder;
	}

	public void setLoanAccountHolder(String loanAccountHolder) {
		this.loanAccountHolder = loanAccountHolder;
	}

	public String getLoanDetailsStatus() {
		return loanDetailsStatus;
	}

	public void setLoanDetailsStatus(String loanDetailsStatus) {
		this.loanDetailsStatus = loanDetailsStatus;
	}

	@Override
	public String toString() {
		return "PosLoanResponseModel [loanAccountNumber=" + loanAccountNumber + ", loanAccountHolder="
				+ loanAccountHolder + ", loanDetailsStatus=" + loanDetailsStatus + "]";
	}
	
	
	
}
