package com.project.bank.account.details.BankAccount.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdateBankAccountRequestModel {

	@JsonProperty(required=true , value="accountNumber")
	private Long accountNumber;
	@JsonProperty("mobileNo")
	private String mobileNo;
	@JsonProperty("pan")
	private String pan;
	@JsonProperty("address")
	 private String address;
	 @JsonProperty("occupation")
	 private String occupation;
	 @JsonProperty("amountWithdrwal")
		private Double amountWithdrwal;

		@JsonProperty("amountDeposit")
		private Double amountDeposit;
		@JsonProperty("accountBalance")
		private double accountBalance;
		@JsonProperty("lastUpdatedBalance")
		private double lastUpdatedBalance;
		@JsonProperty("accountlastUpdatedOn")
		private Date accountLastUpdatedOn;
	 
	 public UpdateBankAccountRequestModel(){
		 
	 }

	public UpdateBankAccountRequestModel(Long accountNumber, String mobileNo, String pan, String address,
			String occupation, Double amountWithdrwal, Double amountDeposit, double accountBalance,
			double lastUpdatedBalance, Date accountLastUpdatedOn) {
		super();
		this.accountNumber = accountNumber;
		this.mobileNo = mobileNo;
		this.pan = pan;
		this.address = address;
		this.occupation = occupation;
		this.amountWithdrwal = amountWithdrwal;
		this.amountDeposit = amountDeposit;
		this.accountBalance = accountBalance;
		this.lastUpdatedBalance = lastUpdatedBalance;
		this.accountLastUpdatedOn = accountLastUpdatedOn;
	}



	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
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
		return "UpdateBankAccountRequestModel [accountNumber=" + accountNumber + ", mobileNo=" + mobileNo + ", pan="
				+ pan + ", address=" + address + ", occupation=" + occupation + ", amountWithdrwal=" + amountWithdrwal
				+ ", amountDeposit=" + amountDeposit + ", accountBalance=" + accountBalance + ", lastUpdatedBalance="
				+ lastUpdatedBalance + ", accountLastUpdatedOn=" + accountLastUpdatedOn + "]";
	}
	
	 
	 
	 
}
