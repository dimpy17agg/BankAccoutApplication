package com.project.bank.account.details.BankAccount.db.model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="LOAN_DETAILS")
public class LoanDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LOAN_BANK_ACCOUNT_ID")
    @SequenceGenerator(name = "LOAN_BANK_ACCOUNT_ID", sequenceName = "LOAN_BANK_ACCOUNT_ID", allocationSize = 1)
	@Column(name="LOAN_ID")
	long loanId;
	@Column(name="LOAN_ACCOUNT_NO" , unique=true,nullable = false)
	long loanAccountNumber;
	@Column(name="LOAN_ACCCOUNT_HOLDER" , nullable=false)
	String loanAccountHolder;
	@Column(name="LOAN_DATE_OF_BIRTH")
	Date dateOfBirth;
	@Column(name="LOAN_NATURE_OF_LOAN")
	String natureOfLoan;
	@Column(name="LOAN_AMOUNT")
	double amount;
	@Column(name="LOAN_INTEREST_RATE")
	double interestRate;
	@Column(name="LOAN_MORATORIUM")
	String moratorium;
	@Column(name="LOAN_BANK_BRANCH_ADDRESS")
	String branchNameAndAddress;
	@Column(name="LOAN_MOBILE_NO")
	String mobileNo;
	@Column(name="LOAN_EMAIL_ID")
	String emailId;
	@Column(name="LOAN_DEBIT_BALANCE")
	double debitBalance;
	@Column(name="LOAN_CREDIT_BALANCE")
	double creditBalance;
	@Column(name="LOAN_DATE_OF_SANCTION")
	Date dateOfSanction;
	@Column(name="LOAN_NO_OF_INSTALLMENTS")
	int numberOfInstallments;
	@Column(name="LOAN_LAST_UPDATED_ON")
	Date lastUpdatedOn;
	
	public LoanDetails(){
		
	}
	

	public LoanDetails(long loanId, long loanAccountNumber, String loanAccountHolder, Date dateOfBirth,
			String natureOfLoan, double amount, double interestRate, String moratorium, String branchNameAndAddress,
			String mobileNo, String emailId, double debitBalance, double creditBalance, Date dateOfSanction,
			int numberOfInstallments, Date lastUpdatedOn) {
		super();
		this.loanId = loanId;
		this.loanAccountNumber = loanAccountNumber;
		this.loanAccountHolder = loanAccountHolder;
		this.dateOfBirth = dateOfBirth;
		this.natureOfLoan = natureOfLoan;
		this.amount = amount;
		this.interestRate = interestRate;
		this.moratorium = moratorium;
		this.branchNameAndAddress = branchNameAndAddress;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
		this.debitBalance = debitBalance;
		this.creditBalance = creditBalance;
		this.dateOfSanction = dateOfSanction;
		this.numberOfInstallments = numberOfInstallments;
		this.lastUpdatedOn = lastUpdatedOn;
	}


	public long getLoanId() {
		return loanId;
	}

	public void setLoanId(long loanId) {
		this.loanId = loanId;
	}

	public long getLoanAccountNumber() {
		return loanAccountNumber;
	}

	public void setLoanAccountNumber(long loanAccountNumber) {
		this.loanAccountNumber = loanAccountNumber;
	}

	public String getLoanAccountHolder() {
		return loanAccountHolder;
	}

	public void setLoanAccountHolder(String loanAccountHolder) {
		this.loanAccountHolder = loanAccountHolder;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNatureOfLoan() {
		return natureOfLoan;
	}

	public void setNatureOfLoan(String natureOfLoan) {
		this.natureOfLoan = natureOfLoan;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public String getMoratorium() {
		return moratorium;
	}

	public void setMoratorium(String moratorium) {
		this.moratorium = moratorium;
	}

	public String getBranchNameAndAddress() {
		return branchNameAndAddress;
	}

	public void setBranchNameAndAddress(String branchNameAndAddress) {
		this.branchNameAndAddress = branchNameAndAddress;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public double getDebitBalance() {
		return debitBalance;
	}

	public void setDebitBalance(double debitBalance) {
		this.debitBalance = debitBalance;
	}

	public double getCreditBalance() {
		return creditBalance;
	}

	public void setCreditBalance(double creditBalance) {
		this.creditBalance = creditBalance;
	}

	public Date getDateOfSanction() {
		return dateOfSanction;
	}

	public void setDateOfSanction(Date dateOfSanction) {
		this.dateOfSanction = dateOfSanction;
	}

	public int getNumberOfInstallments() {
		return numberOfInstallments;
	}

	public void setNumberOfInstallments(int numberOfInstallments) {
		this.numberOfInstallments = numberOfInstallments;
	}

	public Date getLastUpdatedOn() {
		return lastUpdatedOn;
	}

	public void setLastUpdatedOn(Date lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}
	
	public String toString(){
	return loanId+""+loanAccountNumber+""+loanAccountHolder+""+dateOfBirth+""+natureOfLoan+""+amount+""+interestRate+""+moratorium+""+branchNameAndAddress
	+""+mobileNo+""+emailId+""+debitBalance+""+creditBalance+""+dateOfSanction+""+numberOfInstallments+""+lastUpdatedOn;
	}
	
}
