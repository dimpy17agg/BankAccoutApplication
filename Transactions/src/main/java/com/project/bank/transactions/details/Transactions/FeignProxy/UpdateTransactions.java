package com.project.bank.transactions.details.Transactions.FeignProxy;

public class UpdateTransactions {

	private double amountDeposited;
	private double amountWithdrawl;
	private double balancaAfterWithdrawl;
	private double balanceAfterDeposit;
	private double amountTransferred;
	
	
	public UpdateTransactions(){
		
	}
	
	public UpdateTransactions(double amountDeposited, double amountWithdrawl, double balancaAfterWithdrawl,
			double balanceAfterDeposit, double amountTransferred) {
		super();
		this.amountDeposited = amountDeposited;
		this.amountWithdrawl = amountWithdrawl;
		this.balancaAfterWithdrawl = balancaAfterWithdrawl;
		this.balanceAfterDeposit = balanceAfterDeposit;
		this.amountTransferred = amountTransferred;
	}
	public double getAmountDeposited() {
		return amountDeposited;
	}
	public void setAmountDeposited(double amountDeposited) {
		this.amountDeposited = amountDeposited;
	}
	public double getAmountWithdrawl() {
		return amountWithdrawl;
	}
	public void setAmountWithdrawl(double amountWithdrawl) {
		this.amountWithdrawl = amountWithdrawl;
	}
	public double getBalancaAfterWithdrawl() {
		return balancaAfterWithdrawl;
	}
	public void setBalancaAfterWithdrawl(double balancaAfterWithdrawl) {
		this.balancaAfterWithdrawl = balancaAfterWithdrawl;
	}
	public double getBalanceAfterDeposit() {
		return balanceAfterDeposit;
	}
	public void setBalanceAfterDeposit(double balanceAfterDeposit) {
		this.balanceAfterDeposit = balanceAfterDeposit;
	}
	public double getAmountTransferred() {
		return amountTransferred;
	}
	public void setAmountTransferred(double amountTransferred) {
		this.amountTransferred = amountTransferred;
	}
	@Override
	public String toString() {
		return "UpdateTransactions [amountDeposited=" + amountDeposited + ", amountWithdrawl=" + amountWithdrawl
				+ ", balancaAfterWithdrawl=" + balancaAfterWithdrawl + ", balanceAfterDeposit=" + balanceAfterDeposit
				+ ", amountTransferred=" + amountTransferred + "]";
	}
	
	
	
	
	
	
}
