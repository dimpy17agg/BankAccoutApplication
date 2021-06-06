package com.project.bank.account.details.BankAccount.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdateCustomerNomineeResponseModel {


	@JsonProperty(required = true, value = "accountNumber")
	private long accountNumber;
	@JsonProperty(required = true, value = "nomineeName")
	private String nomineeName;
	@JsonProperty("relationshipWithHolder")
	private String relationshipWithHolder;
	@JsonProperty("updateCustomerNomineeStatus")
	private String updateCustomerNomineeStatus;
	
	public UpdateCustomerNomineeResponseModel(){
		
	}
	
	public UpdateCustomerNomineeResponseModel(long accountNumber, String nomineeName, String relationshipWithHolder,
			String updateCustomerNomineeStatus) {
		super();
		this.accountNumber = accountNumber;
		this.nomineeName = nomineeName;
		this.relationshipWithHolder = relationshipWithHolder;
		this.updateCustomerNomineeStatus = updateCustomerNomineeStatus;
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

	public String getUpdateCustomerNomineeStatus() {
		return updateCustomerNomineeStatus;
	}

	public void setUpdateCustomerNomineeStatus(String updateCustomerNomineeStatus) {
		this.updateCustomerNomineeStatus = updateCustomerNomineeStatus;
	}
	
	public String toString(){
		return accountNumber+""+nomineeName+""+relationshipWithHolder+""+updateCustomerNomineeStatus;
	}

	
	
}

