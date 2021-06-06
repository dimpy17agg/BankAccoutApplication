package com.project.bank.transactions.details.Transactions.FeignProxy;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdateBankAccountResponseModel {

	
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
	 @JsonProperty("accountUpdateStatus")
	 private String accountUpdateStatus;
	 
	 
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
		
	 

	 
	public UpdateBankAccountResponseModel(){
		
	}

	public UpdateBankAccountResponseModel(Long accountNumber, String mobileNo, String pan, String address,
			String occupation, String accountUpdateStatus) {
		super();
		this.accountNumber = accountNumber;
		this.mobileNo = mobileNo;
		this.pan = pan;
		this.address = address;
		this.occupation = occupation;
		this.accountUpdateStatus = accountUpdateStatus;
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

	public String getAccountUpdateStatus() {
		return accountUpdateStatus;
	}

	public void setAccountUpdateStatus(String accountUpdateStatus) {
		this.accountUpdateStatus = accountUpdateStatus;
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

	public String toString(){
		return accountNumber+mobileNo+""+pan+""+address+""+occupation+""+accountUpdateStatus;
	}
}
