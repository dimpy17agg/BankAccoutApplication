package com.project.bank.transactions.details.Transactions.db.model;

import java.util.Date;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;


@Entity
@Table(name="InterAccountTransfer")
public class InterAccountTransfers {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "transfer_Id")
    @SequenceGenerator(name = "transfer_Id", sequenceName = "transfer_Id", allocationSize = 1)
	@Column(name="transferId")
	long transferId;
	@Column(name="amountTransferred")
	Double amountTransferred; 
	@Column(name="dateOfTransfer")
	Date dateOfTransfer; 
	@Column(name="accountNumberForm")
	Long accountNumberFrom; 
	@Column(name="accountNumberTo")
	Long accountNumberTo;
	@Column(name="creditAccName")
	String creditAccName; 
	@Column(name="debitAccName")
	String debitAccName; 
	@Column(name="modeOfTransfer")
	String modeOfTransfer;
	public InterAccountTransfers(){
		
	}
	
	
	public InterAccountTransfers(long transferId, double amountTransferred, Date dateOfTransfer,
			long accountNumberFrom, long accountNumberTo, String creditAccName, String debitAccName,
			String modeOfTransfer) {
		super();
		this.transferId = transferId;
		this.amountTransferred = amountTransferred;
		this.dateOfTransfer = dateOfTransfer;
		this.accountNumberFrom = accountNumberFrom;
		this.accountNumberTo = accountNumberTo;
		this.creditAccName = creditAccName;
		this.debitAccName = debitAccName;
		this.modeOfTransfer = modeOfTransfer;
	}
	public long getTransferId() {
		return transferId;
	}
	public void setTransferId(long transferId) {
		this.transferId = transferId;
	}
	public double getAmountTransferred() {
		return amountTransferred;
	}
	public void setAmountTransferred(double amountTransferred) {
		this.amountTransferred = amountTransferred;
	}
	public Date getDateOfTransfer() {
		return dateOfTransfer;
	}
	public void setDateOfTransfer(Date dateOfTransfer) {
		this.dateOfTransfer = dateOfTransfer;
	}
	public long getAccountNumberFrom() {
		return accountNumberFrom;
	}
	public void setAccountNumberFrom(long accountNumberFrom) {
		this.accountNumberFrom = accountNumberFrom;
	}
	public long getAccountNumberTo() {
		return accountNumberTo;
	}
	public void setAccountNumberTo(long accountNumberTo) {
		this.accountNumberTo = accountNumberTo;
	}
	public String getCreditAccName() {
		return creditAccName;
	}
	public void setCreditAccName(String creditAccName) {
		this.creditAccName = creditAccName;
	}
	public String getDebitAccName() {
		return debitAccName;
	}
	public void setDebitAccName(String debitAccName) {
		this.debitAccName = debitAccName;
	}
	public String getModeOfTransfer() {
		return modeOfTransfer;
	}
	public void setModeOfTransfer(String modeOfTransfer) {
		this.modeOfTransfer = modeOfTransfer;
	}
	@Override
	public String toString() {
		return "InterAccountTransfersService [transferId=" + transferId + ", amountTransferred=" + amountTransferred
				+ ", dateOfTransfer=" + dateOfTransfer + ", accountNumberFrom=" + accountNumberFrom
				+ ", accountNumberTo=" + accountNumberTo + ", creditAccName=" + creditAccName + ", debitAccName="
				+ debitAccName + ", modeOfTransfer=" + modeOfTransfer + "]";
	}
}
