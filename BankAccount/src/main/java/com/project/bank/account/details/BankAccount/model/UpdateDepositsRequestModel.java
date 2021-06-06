package com.project.bank.account.details.BankAccount.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdateDepositsRequestModel {

	
	@JsonProperty(required=true , value="depositAccountNumber")
	private long depositAccountNumber;
	
	@JsonProperty("mobileNo")
	private String mobileNo; 
	
	@JsonProperty("address")
	private String address;
	
	@JsonProperty("occupation")
	private String occupation;
  
	@JsonProperty(value="accountBalance")
	private double accountBalance;
	@JsonProperty(value="lastUpdatedBalance")
	private double lastUpdatedBalance;
	@JsonProperty(value="accountLastUpdatedOn")
	private Date accountLastUpdatedOn;
	@JsonProperty(value="amountWithdrwal")
	private Double amountWithdrwal;

	
	
	@JsonProperty("amountDeposit")
	private Double amountDeposit;
	
	
	
	
	
	public UpdateDepositsRequestModel(){
		
	}
	

	public UpdateDepositsRequestModel(long depositAccountNumber, String mobileNo, String address, String occupation,
			double accountBalance, double lastUpdatedBalance, Date accountLastUpdatedOn) {
		super();
		this.depositAccountNumber = depositAccountNumber;
		this.mobileNo = mobileNo;
		this.address = address;
		this.occupation = occupation;
		this.accountBalance = accountBalance;
		this.lastUpdatedBalance = lastUpdatedBalance;
		this.accountLastUpdatedOn = accountLastUpdatedOn;
		
	}


	public long getDepositAccountNumber() {
		return depositAccountNumber;
	}

	public void setDepositAccountNumber(long depositAccountNumber) {
		this.depositAccountNumber = depositAccountNumber;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	
	
	
	
	public double getAccountBalance() {
		return accountBalance;
	}


	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}


	public double getLastUpdatedBalance() {
		return lastUpdatedBalance;
	}


	public void setLastUpdatedBalance(double lastUpdatedBalance) {
		this.lastUpdatedBalance = lastUpdatedBalance;
	}


	public Date getAccountLastUpdatedOn() {
		return accountLastUpdatedOn;
	}


	public void setAccountLastUpdatedOn(Date accountLastUpdatedOn) {
		this.accountLastUpdatedOn = accountLastUpdatedOn;
	}
	

	public Double getAmountWithdrwal() {
		return amountWithdrwal;
	}


	public void setAmountWithdrwal(Double amountWithdrwal) {
		this.amountWithdrwal = amountWithdrwal;
	}


	public Double getAmountDeposit() {
		return amountDeposit;
	}


	public void setAmountDeposit(Double amountDeposit) {
		this.amountDeposit = amountDeposit;
	}


	@Override
	public String toString() {
		return "UpdateDepositsRequestModel [depositAccountNumber=" + depositAccountNumber + ", mobileNo=" + mobileNo
				+ ", address=" + address + ", occupation=" + occupation + ", accountBalance=" + accountBalance
				+ ", lastUpdatedBalance=" + lastUpdatedBalance + ", accountLastUpdatedOn=" + accountLastUpdatedOn + "]";
	}






}
