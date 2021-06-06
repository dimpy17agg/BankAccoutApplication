package com.project.bank.account.details.BankAccount.db.model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="BankAccount_details")
public class BankAccountDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bank_accountId")
    @SequenceGenerator(name = "bank_accountId", sequenceName = "bank_accountId", allocationSize = 1)
	@Column(name="account_Id")
	private long accountId;
	@Column(name="account_number" , unique=true,nullable = false)
	private long accountNumber;
	@Column(name="account_holder" , nullable=false)
	private String accountHolder;
	@Column(name="date_of_birth")
	private Date dateOfBirth;
	@Column(name="age")
	private String age;//(XX yr XX month)
	@Column(name="bank_branch_address")
	private String branchNameAndAddress;
	@Column(name="email")
	private String emailId;
	@Column(name="micr_code")
	private String micrCode;
	@Column(name="ifsc")
	private String ifsc;
	@Column(name="start_date")
	private Date accountInitiatedOn;
	@Column(name="mode_of_operation")
	private String modeOfOperation;
	@Column(name="cif_no")
	private String cifNo;
	@Column(name="pan_no")
	private String pan;
	@Column(name="father_name")
	private String fatherName;
	@Column(name="address")
	private String address;
	@Column(name="mobile_no")
	private String mobileNo;
	@Column(name="occupation")
	private String occupation;
	@Column(name="account_balance")
	private double accountBalance;
	@Column(name="last_update_balance")
	private double lastUpdatedBalance;
	@Column(name="date_last_update_on")
	private Date accountLastUpdatedOn;
	
	public BankAccountDetails(){
		
	}
	
	
	
	public BankAccountDetails(long accountId, long accountNumber, String accountHolder, Date dateOfBirth, String age,
			String branchNameAndAddress, String emailId, String micrCode, String ifsc, Date accountInitiatedOn,
			String modeOfOperation, String cifNo, String pan, String fatherName, String address, String mobileNo,
			String occupation, double accountBalance, double lastUpdatedBalance, Date accountLastUpdatedOn) {
		super();
		this.accountId = accountId;
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



	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
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



	public double getAccountBalance() {
		return accountBalance;
	}



	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}



	@Override
	public String toString() {
		return 
			accountId+""+accountNumber+""+accountHolder+""+dateOfBirth+""+age+""+branchNameAndAddress+""+emailId
			+""+micrCode+""+ifsc+""+accountInitiatedOn+""+modeOfOperation+""+cifNo+""+pan+""+fatherName+""+
			address+""+mobileNo+""+occupation+""+accountBalance+""+lastUpdatedBalance+""+accountLastUpdatedOn;
		
	}
	
	
	
}
