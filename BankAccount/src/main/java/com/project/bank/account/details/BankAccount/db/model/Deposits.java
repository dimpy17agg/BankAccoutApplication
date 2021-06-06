package com.project.bank.account.details.BankAccount.db.model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="DEPOSITS_DETAILS")
public class Deposits {
   @Id
	@Column(name="DEPOSIT_ID")
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "deposit_accountId")
   @SequenceGenerator(name = "deposit_accountId", sequenceName = "deposit_accountId", allocationSize = 1)
   long depositId;//(PK)
	@Column(name="DEPOSIT_ACCOUNT_NO", unique=true,nullable = false)
	long depositAccountNumber;
	@Column(name="DEPOSIT_ACCOUNT_HOLDER" , nullable=false)
	String depositAccountHolder;
	@Column(name="DEPOSIT_NATURE_OF_DEPOSIT")
	String natureOfDeposit;
	@Column(name="DEPOSIT_NOMINEE_DETAILS")
	String nomineeDetails;
	@Column(name="DEPOSIT_MICR_CODE")
	String micrCode;
	@Column(name="DEPOSIT_IFSC")
	String ifsc;
	@Column(name="DEPOSIT_DATE_OF_BIRTH")
	Date dateOfBirth;
	@Column(name="DEPOSIT_AGE")
	String age;//(XX yr XX month)
	@Column(name="DEPOSIT_BRANCH_ADDRESS")
	String branchNameAndAddress;
	@Column(name="DEPOSIT_EMAIL_ID")
	String emailId;
	@Column(name="DEPOSIT_MODE_OF_OPERATION")
	String modeOfOperation;
	@Column(name="DEPOSIT_CIF_NO")
	String cifNo;
	@Column(name="DEPOSIT_PAN")
	String pan;
	@Column(name="DEPOSIT_FATHER_NAME")
	String fatherName;
	@Column(name="DEPOSIT_ADDRESS")
	String address;
	@Column(name="DEPOSIT_MOBILE_NUMBER")
	String mobileNo; 
	@Column(name="DEPOSIT_OCCUPATION")
	String occupation;
	@Column(name="DEPOSIT_ACCOUNT_BALANCE")
	double accountBalance; 
	@Column(name="DEPOSIT_LAST_UPDATED_BALANCE")
	double lastUpdatedBalance;
	@Column(name="DEPOSIT_ACCOUNT_LAST_UPDATED_ON")
	Date accountLastUpdatedOn;
	
	public Deposits(){
		
	}
	
	
	public Deposits(long depositId, long depositAccountNumber, String depositAccountHolder, String natureOfDeposit,
			String nomineeDetails, String micrCode, String ifsc, Date dateOfBirth, String age,
			String branchNameAndAddress, String emailId, String modeOfOperation, String cifNo, String pan,
			String fatherName, String address, String mobileNo, String occupation, double accountBalance,
			double lastUpdatedBalance, Date accountLastUpdatedOn) {
		super();
		this.depositId = depositId;
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
	public long getDepositId() {
		return depositId;
	}
	public void setDepositId(long depositId) {
		this.depositId = depositId;
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
	
	public String toString(){
	 return depositId+""+depositAccountNumber+""+depositAccountHolder+""+natureOfDeposit+""+nomineeDetails+""+micrCode+""+ifsc+""+dateOfBirth+""+age+""+
		branchNameAndAddress+""+emailId+""+modeOfOperation+""+cifNo+""+pan+""+fatherName+""+address+""+mobileNo+""+occupation+""+accountBalance+""+ 
		lastUpdatedBalance+""+accountLastUpdatedOn;

	}
	
}
