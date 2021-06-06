package com.project.bank.transactions.details.Transactions.db.model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="DEPOSITS")
public class Deposits {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "deposit_accountId")
    @SequenceGenerator(name = "deposit_accountId", sequenceName = "deposit_accountId", allocationSize = 1)
	@Column(name="depositId")
	private long depositId;
	@Column(name="amountDeposited")
	double amountDeposited; 
	@Column(name="dateOfDeposit")
	Date dateOfDeposit;
	@Column(name="accountNumber")
	long accountNumber; 
	@Column(name="natureOfAccount")
	String natureOfAccount; 
	@Column(name="balanceAfterDeposit")
	double balanceAfterDeposit;
	@Column(name="accountHolder")
	String accountHolder;
	
	public Deposits(){
		
	}

	public Deposits(long depositId, double amountDeposited, Date dateOfDeposit, long accountNumber,
			String natureOfAccount, double balanceAfterDeposit, String accountHolder) {
		super();
		this.depositId = depositId;
		this.amountDeposited = amountDeposited;
		this.dateOfDeposit = dateOfDeposit;
		this.accountNumber = accountNumber;
		this.natureOfAccount = natureOfAccount;
		this.balanceAfterDeposit = balanceAfterDeposit;
		this.accountHolder = accountHolder;
	}

	public long getDepositId() {
		return depositId;
	}

	public void setDepositId(long depositId) {
		this.depositId = depositId;
	}

	public double getAmountDeposited() {
		return amountDeposited;
	}

	public void setAmountDeposited(double amountDeposited) {
		this.amountDeposited = amountDeposited;
	}

	public Date getDateOfDeposit() {
		return dateOfDeposit;
	}

	public void setDateOfDeposit(Date dateOfDeposit) {
		this.dateOfDeposit = dateOfDeposit;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getNatureOfAccount() {
		return natureOfAccount;
	}

	public void setNatureOfAccount(String natureOfAccount) {
		this.natureOfAccount = natureOfAccount;
	}

	public double getBalanceAfterDeposit() {
		return balanceAfterDeposit;
	}

	public void setBalanceAfterDeposit(double balanceAfterDeposit) {
		this.balanceAfterDeposit = balanceAfterDeposit;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	@Override
	public String toString() {
		return "Deposits [depositId=" + depositId + ", amountDeposited=" + amountDeposited + ", dateOfDeposit="
				+ dateOfDeposit + ", accountNumber=" + accountNumber + ", natureOfAccount=" + natureOfAccount
				+ ", balanceAfterDeposit=" + balanceAfterDeposit + ", accountHolder=" + accountHolder + "]";
	}
	
	
	
	
}
