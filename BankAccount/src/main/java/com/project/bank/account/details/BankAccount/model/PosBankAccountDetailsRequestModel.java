package com.project.bank.account.details.BankAccount.model;

import java.util.Date;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PosBankAccountDetailsRequestModel {

	@JsonProperty(required = true, value = "accountNumber")
	private long accountNumber;
	@JsonProperty(required = true, value = "accountHolder")
	private String accountHolder;
	@JsonProperty(required = true, value = "dateOfBirth")
	private Date dateOfBirth;
	@JsonProperty(required = true, value = "age")
	private String age;//(XX yr XX month)
	@JsonProperty(required = true, value = "branchNameAndAddress")
	private String branchNameAndAddress;
	@JsonProperty(required = true, value = "emailId")
	private String emailId;
	@JsonProperty("micrCode")
	private String micrCode;
	@JsonProperty("ifsc")
	private String ifsc;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC")
	@JsonProperty("accountInitiatedOn")
	private Date accountInitiatedOn;
	@JsonProperty("modeOfOperation")
	private String modeOfOperation;
	@JsonProperty("cifNo")
	private String cifNo;
	@JsonProperty(required = true, value = "pan")
	private String pan;
	@JsonProperty("fatherName")
	private  String fatherName;
	@JsonProperty("address")
	private String address;
	@JsonProperty("mobileNumber")
	private String mobileNo;
	@JsonProperty("Occupation")
	private String occupation;
	@JsonProperty("accountBalance")
	private double accountBalance;
	@JsonProperty("lastUpdatedBalance")
	private double lastUpdatedBalance;
	@JsonProperty("dateLastUpdateOn")
	private Date accountLastUpdatedOn;
		

	


	public PosBankAccountDetailsRequestModel(long accountNumber, String accountHolder, Date dateOfBirth, String age,
			String branchNameAndAddress, String emailId, String micrCode, String ifsc, Date accountInitiatedOn,
			String modeOfOperation, String cifNo, String pan, String fatherName, String address, String mobileNo,
			String occupation, double accountBalance, double lastUpdatedBalance, Date accountLastUpdatedOn) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.dateOfBirth = dateOfBirth;
		this.age = age;
		this.branchNameAndAddress = branchNameAndAddress;
		this.emailId = emailId;
		this.micrCode = micrCode;
		this.ifsc = ifsc;
		this.accountInitiatedOn = accountInitiatedOn;
		this.modeOfOperation = modeOfOperation;
		this.cifNo = cifNo;
		this.pan = pan;
		this.fatherName = fatherName;
		this.address = address;
		this.mobileNo = mobileNo;
		this.occupation = occupation;
		this.accountBalance = accountBalance;
		this.lastUpdatedBalance = lastUpdatedBalance;
		this.accountLastUpdatedOn = accountLastUpdatedOn;
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

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getBranchNameAndAddress() {
		return branchNameAndAddress;
	}

	public void setBranchNameAndAddress(String branchNameAndAddress) {
		this.branchNameAndAddress = branchNameAndAddress;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMicrCode() {
		return micrCode;
	}

	public void setMicrCode(String micrCode) {
		this.micrCode = micrCode;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public Date getAccountInitiatedOn() {
		return accountInitiatedOn;
	}

	public void setAccountInitiatedOn(Date accountInitiatedOn) {
		this.accountInitiatedOn = accountInitiatedOn;
	}

	public String getModeOfOperation() {
		return modeOfOperation;
	}

	public void setModeOfOperation(String modeOfOperation) {
		this.modeOfOperation = modeOfOperation;
	}

	public String getCifNo() {
		return cifNo;
	}

	public void setCifNo(String cifNo) {
		this.cifNo = cifNo;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	@Override
	public String toString() {
		return "PosBankAccountDetailsRequestModel [accountNumber=" + accountNumber + ", accountHolder=" + accountHolder
				+ ", dateOfBirth=" + dateOfBirth + ", age=" + age + ", branchNameAndAddress=" + branchNameAndAddress
				+ ", emailId=" + emailId + ", micrCode=" + micrCode + ", ifsc=" + ifsc + ", accountInitiatedOn="
				+ accountInitiatedOn + ", modeOfOperation=" + modeOfOperation + ", cifNo=" + cifNo + ", pan=" + pan
				+ ", fatherName=" + fatherName + ", address=" + address + ", mobileNo=" + mobileNo + ", occupation="
				+ occupation + ", accountBalance=" + accountBalance + ", lastUpdatedBalance=" + lastUpdatedBalance
				+ ", accountLastUpdatedOn=" + accountLastUpdatedOn + "]";
	}
}
