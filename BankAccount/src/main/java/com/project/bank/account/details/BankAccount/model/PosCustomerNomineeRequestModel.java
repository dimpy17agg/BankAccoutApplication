package com.project.bank.account.details.BankAccount.model;

import java.util.Date;



import com.fasterxml.jackson.annotation.JsonProperty;

public class PosCustomerNomineeRequestModel {


	@JsonProperty(required = true, value = "accountNumber")
	private long accountNumber;
	@JsonProperty(required = true, value = "accountHolder")
	private String accountHolder;
	@JsonProperty(required = true, value = "nomineeName")
	private String nomineeName;
	@JsonProperty("nominationRegdDate")
	private Date nominationRegdDate;
	@JsonProperty("regNo")
	private String regNo;
	@JsonProperty("relationshipWithHolder")
	private String relationshipWithHolder;
	
	public PosCustomerNomineeRequestModel(){
		
	}

	public PosCustomerNomineeRequestModel(long accountNumber, String accountHolder, String nomineeName,
			Date nominationRegdDate, String regNo, String relationshipWithHolder) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.nomineeName = nomineeName;
		this.nominationRegdDate = nominationRegdDate;
		this.regNo = regNo;
		this.relationshipWithHolder = relationshipWithHolder;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public String getNomineeName() {
		return nomineeName;
	}

	public void setNomineeName(String nomineeName) {
		this.nomineeName = nomineeName;
	}

	public Date getNominationRegdDate() {
		return nominationRegdDate;
	}

	public void setNominationRegdDate(Date nominationRegdDate) {
		this.nominationRegdDate = nominationRegdDate;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public String getRelationshipWithHolder() {
		return relationshipWithHolder;
	}

	public void setRelationshipWithHolder(String relationshipWithHolder) {
		this.relationshipWithHolder = relationshipWithHolder;
	}
	
	
	public String toString(){
		return accountNumber+""+accountHolder+""+nomineeName+""+nominationRegdDate+""+regNo+""+relationshipWithHolder;
	}
		
	
	
}
