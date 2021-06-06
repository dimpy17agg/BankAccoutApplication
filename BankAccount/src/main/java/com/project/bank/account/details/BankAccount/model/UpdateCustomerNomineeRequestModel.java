package com.project.bank.account.details.BankAccount.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdateCustomerNomineeRequestModel {

	@JsonProperty(required = true, value = "accountNumber")
	private long accountNumber;
	@JsonProperty(required = true, value = "nomineeName")
	private String nomineeName;
	@JsonProperty("relationshipWithHolder")
	private String relationshipWithHolder;
	
	public UpdateCustomerNomineeRequestModel(){
		
	}
	
	public UpdateCustomerNomineeRequestModel(long accountNumber, String nomineeName, String relationshipWithHolder) {
		super();
		this.accountNumber = accountNumber;
		this.nomineeName = nomineeName;
		this.relationshipWithHolder = relationshipWithHolder;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getNomineeName() {
		return nomineeName;
	}

	public void setNomineeName(String nomineeName) {
		this.nomineeName = nomineeName;
	}

	public String getRelationshipWithHolder() {
		return relationshipWithHolder;
	}

	public void setRelationshipWithHolder(String relationshipWithHolder) {
		this.relationshipWithHolder = relationshipWithHolder;
	}
	
	public String toString(){
		return accountNumber+""+nomineeName+""+relationshipWithHolder;
	}
	
}
