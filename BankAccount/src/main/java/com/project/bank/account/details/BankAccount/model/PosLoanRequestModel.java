package com.project.bank.account.details.BankAccount.model;

import java.util.Date;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PosLoanRequestModel {

	@JsonProperty(required=true, value="loanAccountNumber")
	private long loanAccountNumber;
	@JsonProperty(required=true, value="loanAccountHolder")
	String loanAccountHolder;
	@JsonProperty(required=true, value="dateOfBirth")
	Date dateOfBirth;
	@JsonProperty(required=true, value="natureOfLoan")
	String natureOfLoan;
	@JsonProperty(required=true, value="amount")
	double amount;
	@JsonProperty(required=true, value="interestRate")
	double interestRate;
	@JsonProperty(required=true, value="moratorium")
	String moratorium;
	@JsonProperty(required=true, value="branchNameAndAddress")
	String branchNameAndAddress;
	@JsonProperty(required=true, value="mobileNumber")
	String mobileNo;
	@JsonProperty(required=true, value="emailId")
	String emailId;
	
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
	
	
	
	
	
	public PosLoanRequestModel(){
		
	}
	
	
	
	public PosLoanRequestModel(long loanAccountNumber, String loanAccountHolder, Date dateOfBirth, String natureOfLoan,
			double amount, double interestRate, String moratorium, String branchNameAndAddress, String mobileNo,
			String emailId, double debitBalance, double creditBalance, Date dateOfSanction, int numberOfInstallments,
			Date lastUpdatedOn) {
		super();
		this.loanAccountNumber = loanAccountNumber;
		this.loanAccountHolder = loanAccountHolder;
		this.dateOfBirth = dateOfBirth;
		this.natureOfLoan = natureOfLoan;
		this.amount = amount;
		this.interestRate = interestRate;
		this.moratorium = moratorium;
		this.branchNameAndAddress = branchNameAndAddress;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
		this.debitBalance = debitBalance;
		this.creditBalance = creditBalance;
		this.dateOfSanction = dateOfSanction;
		this.numberOfInstallments = numberOfInstallments;
		this.lastUpdatedOn = lastUpdatedOn;
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
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
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
	public String getMoratorium() {
		return moratorium;
	}
	public void setMoratorium(String moratorium) {
		this.moratorium = moratorium;
	}
	public String getBranchNameAndAddress() {
		return branchNameAndAddress;
	}
	public void setBranchNameAndAddress(String branchNameAndAddress) {
		this.branchNameAndAddress = branchNameAndAddress;
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
		return "PosLoanRequestModel [loanAccountNumber=" + loanAccountNumber + ", loanAccountHolder="
				+ loanAccountHolder + ", dateOfBirth=" + dateOfBirth + ", natureOfLoan=" + natureOfLoan + ", amount="
				+ amount + ", interestRate=" + interestRate + ", moratorium=" + moratorium + ", branchNameAndAddress="
				+ branchNameAndAddress + ", mobileNo=" + mobileNo + ", emailId=" + emailId + ", debitBalance="
				+ debitBalance + ", creditBalance=" + creditBalance + ", dateOfSanction=" + dateOfSanction
				+ ", numberOfInstallments=" + numberOfInstallments + ", lastUpdatedOn=" + lastUpdatedOn + "]";
	}

}
