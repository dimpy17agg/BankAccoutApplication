package com.project.bank.account.details.BankAccount.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PosDepositsResponseModel {

	@JsonProperty(required=true , value="depositAccountNumber")
	private long depositAccountNumber;
	@JsonProperty(required=true , value="depositAccountHolder")
	private String depositAccountHolder;
	@JsonProperty(required=true , value="natueOfDeposit")
	private String natureOfDeposit;
	@JsonProperty("DepositStatus")
	private String depositsStatus;
	
	public PosDepositsResponseModel(){
		
	}
	
	public PosDepositsResponseModel(long depositAccountNumber, String depositAccountHolder, String natureOfDeposit,
			String depositsStatus) {
		super();
		this.depositAccountNumber = depositAccountNumber;
		this.depositAccountHolder = depositAccountHolder;
		this.natureOfDeposit = natureOfDeposit;
		this.depositsStatus = depositsStatus;
	}
	public long getDepositAccountNumber() {
		return depositAccountNumber;
	}
	public void setDepositAccountNumber(long depositAccountNumber) {
		this.depositAccountNumber = depositAccountNumber;
	}
	public String getDepositAccountHolder() {
		return depositAccountHolder;
	}
	public void setDepositAccountHolder(String depositAccountHolder) {
		this.depositAccountHolder = depositAccountHolder;
	}
	public String getNatureOfDeposit() {
		return natureOfDeposit;
	}
	public void setNatureOfDeposit(String natureOfDeposit) {
		this.natureOfDeposit = natureOfDeposit;
	}
	public String getDepositsStatus() {
		return depositsStatus;
	}
	public void setDepositsStatus(String depositsStatus) {
		this.depositsStatus = depositsStatus;
	}
	
	public String toString(){
		return depositAccountNumber+""+depositAccountHolder+""+natureOfDeposit+""+depositsStatus;
	}
	
	
}
