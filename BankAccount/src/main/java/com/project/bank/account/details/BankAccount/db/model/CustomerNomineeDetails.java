package com.project.bank.account.details.BankAccount.db.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="customer_nominee_details")
public class CustomerNomineeDetails {
    @Id
	@Column(name="nomination_Id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_nominee_accountId")
    @SequenceGenerator(name = "customer_nominee_accountId", sequenceName = "customer_nominee_accountId", allocationSize = 1)
	long nominationId;
    @OneToOne 
	@JoinColumn(name="account_Id")
	BankAccountDetails accountId;
	@Column(name="account_number")
	long accountNumber;
	@Column(name="account_holder")
	String accountHolder;
	@Column(name="nominne_name")
	String nomineeName;
	@Column(name="nomination_regd_date")
	Date nominationRegdDate;
	@Column(name="reg_no")
	String regNo;
	@Column(name="nominee_relationship")
	String relationshipWithHolder;
	
	public CustomerNomineeDetails(){
		
	}
	
	public CustomerNomineeDetails(long nominationId, BankAccountDetails accountId, long accountNumber, String accountHolder,
			String nomineeName, Date nominationRegdDate, String regNo, String relationshipWithHolder) {
		super();
		this.nominationId = nominationId;
		this.accountId = accountId;
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.nomineeName = nomineeName;
		this.nominationRegdDate = nominationRegdDate;
		this.regNo = regNo;
		this.relationshipWithHolder = relationshipWithHolder;
	}



	public long getNominationId() {
		return nominationId;
	}
	public void setNominationId(long nominationId) {
		this.nominationId = nominationId;
	}
	public BankAccountDetails getAccountId() {
		return accountId;
	}
	public void setAccountId(BankAccountDetails accountId) {
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
		return nominationId+""+accountId+""+accountNumber+""+accountHolder+""+nomineeName+""+nominationRegdDate+""+regNo+""+relationshipWithHolder;

	}
	
}
