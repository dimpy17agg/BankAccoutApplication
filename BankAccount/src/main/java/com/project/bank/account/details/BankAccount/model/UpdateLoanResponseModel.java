package com.project.bank.account.details.BankAccount.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdateLoanResponseModel {

	
	@JsonProperty(required=true, value="loanAccountNumber")
	private long loanAccountNumber;
	
	@JsonProperty(value="mobileNumber")
	String mobileNo;
	
	@JsonProperty( value="emailId")
	String emailId;
	
	
	@JsonProperty("loanAccountHolder")
	String loanAccountHolder;
	@JsonProperty("natureOfLoan")
	String natureOfLoan;
	@JsonProperty("amount")
	double amount;
	@JsonProperty("interestRate")
	double interestRate;
	@JsonProperty("debitBalance")
	double debitBalance;
	@JsonProperty("creditBalance")
	double creditBalance;
	@JsonProperty("dateOfsanction")
		Date dateOfSanction;
	@JsonProperty("numberOfInstallments")
	int numberOfInstallments;
	@JsonProperty("lastUpdatedOn")
	Date lastUpdatedOn;
	
	@JsonProperty(value="updtaeLoanStatus")
	String updateLoanStatus;

	
	public UpdateLoanResponseModel(){
		
	}
	
	
	public UpdateLoanResponseModel(long loanAccountNumber, String mobileNo, String emailId, String loanAccountHolder,
			String natureOfLoan, double amount, double interestRate, double debitBalance, double creditBalance,
			Date dateOfSanction, int numberOfInstallments, Date lastUpdatedOn, String updateLoanStatus) {
		super();
		this.loanAccountNumber = loanAccountNumber;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
		this.loanAccountHolder = loanAccountHolder;
		this.natureOfLoan = natureOfLoan;
		this.amount = amount;
		this.interestRate = interestRate;
		this.debitBalance = debitBalance;
		this.creditBalance = creditBalance;
		this.dateOfSanction = dateOfSanction;
		this.numberOfInstallments = numberOfInstallments;
		this.lastUpdatedOn = lastUpdatedOn;
		this.updateLoanStatus = updateLoanStatus;
	}


	public long getLoanAccountNumber() {
		return loanAccountNumber;
	}

	public void setLoanAccountNumber(long loanAccountNumber) {
		this.loanAccountNumber = loanAccountNumber;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getUpdateLoanStatus() {
		return updateLoanStatus;
	}

	public void setUpdateLoanStatus(String updateLoanStatus) {
		this.updateLoanStatus = updateLoanStatus;
	}


	public String getLoanAccountHolder() {
		return loanAccountHolder;
	}


	public void setLoanAccountHolder(String loanAccountHolder) {
		this.loanAccountHolder = loanAccountHolder;
	}


	public String getNatureOfLoan() {
		return natureOfLoan;
	}


	public void setNatureOfLoan(String natureOfLoan) {
		this.natureOfLoan = natureOfLoan;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public double getInterestRate() {
		return interestRate;
	}


	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}


	public double getDebitBalance() {
		return debitBalance;
	}


	public void setDebitBalance(double debitBalance) {
		this.debitBalance = debitBalance;
	}


	public double getCreditBalance() {
		return creditBalance;
	}


	public void setCreditBalance(double creditBalance) {
		this.creditBalance = creditBalance;
	}


	public Date getDateOfSanction() {
		return dateOfSanction;
	}


	public void setDateOfSanction(Date dateOfSanction) {
		this.dateOfSanction = dateOfSanction;
	}


	public int getNumberOfInstallments() {
		return numberOfInstallments;
	}


	public void setNumberOfInstallments(int numberOfInstallments) {
		this.numberOfInstallments = numberOfInstallments;
	}


	public Date getLastUpdatedOn() {
		return lastUpdatedOn;
	}


	public void setLastUpdatedOn(Date lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}


	@Override
	public String toString() {
		return "UpdateLoanResponseModel [loanAccountNumber=" + loanAccountNumber + ", mobileNo=" + mobileNo
				+ ", emailId=" + emailId + ", loanAccountHolder=" + loanAccountHolder + ", natureOfLoan=" + natureOfLoan
				+ ", amount=" + amount + ", interestRate=" + interestRate + ", debitBalance=" + debitBalance
				+ ", creditBalance=" + creditBalance + ", dateOfSanction=" + dateOfSanction + ", numberOfInstallments="
				+ numberOfInstallments + ", lastUpdatedOn=" + lastUpdatedOn + ", updateLoanStatus=" + updateLoanStatus
				+ "]";
	}


	
	
}

