package com.project.bank.account.details.BankAccount.model;

import java.util.Date;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PosDepositsRequestModel {

	@JsonProperty(required=true , value="depositAccountNumber")
	private long depositAccountNumber;
	@JsonProperty(required=true , value="depositAccountHolder")
	private String depositAccountHolder;
	@JsonProperty(required=true , value="natureOfDeposit")
	private String natureOfDeposit;
	@JsonProperty(value="nomineeDetails")
	private String nomineeDetails;
	@JsonProperty(value="micrCode")
	private String micrCode;
	@JsonProperty(value="ifsc")
	private String ifsc;
	@JsonProperty(value="dateOfBirth")
	private Date dateOfBirth;
	@JsonProperty(value="age")
	private String age;
	@JsonProperty(value="branchNameAndAddress")
	private String branchNameAndAddress;
	@JsonProperty(value="emailId")
	private String emailId;
	@JsonProperty("modeOfOperation")
	private String modeOfOperation;
	@JsonProperty("cifNo")
	private String cifNo;
	@JsonProperty("pan")
	private String pan;
	@JsonProperty("fatherName")
	private String fatherName;
	@JsonProperty("address")
	private String address;
	@JsonProperty("mobileNo")
	private String mobileNo; 
	@JsonProperty("occupation")
	private String occupation;
	@JsonProperty("accountBalance")
	private double accountBalance;
	@JsonProperty("lastUpdateBalance")
	private double lastUpdatedBalance;
	@JsonProperty("accountLastUpdatedOn")
	private Date accountLastUpdatedOn;
	
	
	
	
	public PosDepositsRequestModel(){
		
	}
	
	
	
	
	
	
	
	
	public PosDepositsRequestModel(long depositAccountNumber, String depositAccountHolder, String natureOfDeposit,
			String nomineeDetails, String micrCode, String ifsc, Date dateOfBirth, String age,
			String branchNameAndAddress, String emailId, String modeOfOperation, String cifNo, String pan,
			String fatherName, String address, String mobileNo, String occupation, double accountBalance,
			double lastUpdatedBalance, Date accountLastUpdatedOn) {
		super();
		this.depositAccountNumber = depositAccountNumber;
		this.depositAccountHolder = depositAccountHolder;
		this.natureOfDeposit = natureOfDeposit;
		this.nomineeDetails = nomineeDetails;
		this.micrCode = micrCode;
		this.ifsc = ifsc;
		this.dateOfBirth = dateOfBirth;
		this.age = age;
		this.branchNameAndAddress = branchNameAndAddress;
		this.emailId = emailId;
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
	public String getNomineeDetails() {
		return nomineeDetails;
	}
	public void setNomineeDetails(String nomineeDetails) {
		this.nomineeDetails = nomineeDetails;
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
		return "PosDepositsRequestModel [depositAccountNumber=" + depositAccountNumber + ", depositAccountHolder="
				+ depositAccountHolder + ", natureOfDeposit=" + natureOfDeposit + ", nomineeDetails=" + nomineeDetails
				+ ", micrCode=" + micrCode + ", ifsc=" + ifsc + ", dateOfBirth=" + dateOfBirth + ", age=" + age
				+ ", branchNameAndAddress=" + branchNameAndAddress + ", emailId=" + emailId + ", modeOfOperation="
				+ modeOfOperation + ", cifNo=" + cifNo + ", pan=" + pan + ", fatherName=" + fatherName + ", address="
				+ address + ", mobileNo=" + mobileNo + ", occupation=" + occupation + ", accountBalance="
				+ accountBalance + ", lastUpdatedBalance=" + lastUpdatedBalance + ", accountLastUpdatedOn="
				+ accountLastUpdatedOn + "]";
	}

	
	
}
