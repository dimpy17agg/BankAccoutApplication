package com.project.bank.transactions.details.Transactions.db.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@Table(name="Withdrawls")
public class Withdrawls {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
//    @SequenceGenerator(name = "withdrwal_acc_Id", sequenceName = "withdrawl_acc_Id", allocationSize = 1)
	@Column(name="withdrwal_Id",nullable = false)
	private long withdrawalId;
	@Column(name="amount_withdrawn")
	private double amountWithdrawn;
	@Column(name="nature_of_account")
	private String natureOfAccount; 
	@Column(name="date_of_withdrwal")
	private Date dateOfWithdrawal;
	@Column(name="account_number")
	private Long accountNumber; 
	@Column(name="account_holder")
	private 	String accountHolder;
	@Column(name="balance_after_withdrwal")
	private double balanceAfterWithdrawal;


	public Withdrawls(){
		
	}


	public Withdrawls(Long withdrawalId, double amountWithdrawn, String natureOfAccount, Date dateOfWithdrawal,
			Long accountNumber, String accountHolder, double balanceAfterWithdrawal) {
		super();
		this.withdrawalId = withdrawalId;
		this.amountWithdrawn = amountWithdrawn;
		this.natureOfAccount = natureOfAccount;
		this.dateOfWithdrawal = dateOfWithdrawal;
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balanceAfterWithdrawal = balanceAfterWithdrawal;
	}


	public Long getWithdrawalId() {
		return withdrawalId;
	}


	public void setWithdrawalId(Long withdrawalId) {
		this.withdrawalId = withdrawalId;
	}


	public double getAmountWithdrawn() {
		return amountWithdrawn;
	}


	public void setAmountWithdrawn(double amountWithdrawn) {
		this.amountWithdrawn = amountWithdrawn;
	}


	public String getNatureOfAccount() {
		return natureOfAccount;
	}


	public void setNatureOfAccount(String natureOfAccount) {
		this.natureOfAccount = natureOfAccount;
	}


	public Date getDateOfWithdrawal() {
		return dateOfWithdrawal;
	}


	public void setDateOfWithdrawal(Date dateOfWithdrawal) {
		this.dateOfWithdrawal = dateOfWithdrawal;
	}


	public Long getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}


	public String getAccountHolder() {
		return accountHolder;
	}


	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}


	public double getBalanceAfterWithdrawal() {
		return balanceAfterWithdrawal;
	}


	public void setBalanceAfterWithdrawal(double balanceAfterWithdrawal) {
		this.balanceAfterWithdrawal = balanceAfterWithdrawal;
	}


	@Override
	public String toString() {
		return "Withdrawls [withdrawalId=" + withdrawalId + ", amountWithdrawn=" + amountWithdrawn
				+ ", natureOfAccount=" + natureOfAccount + ", dateOfWithdrawal=" + dateOfWithdrawal + ", accountNumber="
				+ accountNumber + ", accountHolder=" + accountHolder + ", balanceAfterWithdrawal="
				+ balanceAfterWithdrawal + "]";
	}

	
}
