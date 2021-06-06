package com.project.bank.transactions.details.Transactions.FeignProxy;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdateDepositsResponseModel {
	@JsonProperty(required=true , value="depositAccountNumber")
	private long depositAccountNumber;
	
	@JsonProperty("mobileNo")
	private String mobileNo; 
	
	@JsonProperty("address")
	private String address;
	
	@JsonProperty("occupation")
	private String occupation;
	@JsonProperty("accountBalance")
	private double accountBalance;
	@JsonProperty("lastUpdateBalance")
	private double lastUpdatedBalance;
	@JsonProperty("accountLastUpdatedOn")
	private Date accountLastUpdatedOn;
	@JsonProperty("depositsAccountStatus")
	private String depositsAccountStatus;
	
	
	public UpdateDepositsResponseModel(){
		
	}
	

	public UpdateDepositsResponseModel(long depositAccountNumber, String mobileNo, String address, String occupation,
			double accountBalance, double lastUpdatedBalance, Date accountLastUpdatedOn, String depositsAccountStatus) {
		super();
		this.depositAccountNumber = depositAccountNumber;
		this.mobileNo = mobileNo;
		this.address = address;
		this.occupation = occupation;
		this.accountBalance = accountBalance;
		this.lastUpdatedBalance = lastUpdatedBalance;
		this.accountLastUpdatedOn = accountLastUpdatedOn;
		this.depositsAccountStatus = depositsAccountStatus;
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

	public String getDepositsAccountStatus() {
		return depositsAccountStatus;
	}

	public void setDepositsAccountStatus(String depositsAccountStatus) {
		this.depositsAccountStatus = depositsAccountStatus;
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


	@Override
	public String toString() {
		return "UpdateDepositsResponseModel [depositAccountNumber=" + depositAccountNumber + ", mobileNo=" + mobileNo
				+ ", address=" + address + ", occupation=" + occupation + ", accountBalance=" + accountBalance
				+ ", lastUpdatedBalance=" + lastUpdatedBalance + ", accountLastUpdatedOn=" + accountLastUpdatedOn
				+ ", depositsAccountStatus=" + depositsAccountStatus + "]";
	}
	

}
