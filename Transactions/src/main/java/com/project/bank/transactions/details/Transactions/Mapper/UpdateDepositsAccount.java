package com.project.bank.transactions.details.Transactions.Mapper;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.project.bank.transactions.details.Transactions.FeignProxy.UpdateBankAccountRequestModel;
import com.project.bank.transactions.details.Transactions.FeignProxy.UpdateBankAccountResponseModel;
import com.project.bank.transactions.details.Transactions.FeignProxy.UpdateDepositsRequestModel;
import com.project.bank.transactions.details.Transactions.FeignProxy.UpdateDepositsResponseModel;
import com.project.bank.transactions.details.Transactions.FeignProxy.UpdateLoanResponseModel;
import com.project.bank.transactions.details.Transactions.FeignProxy.UpdateTransactions;
import com.project.bank.transactions.details.Transactions.db.model.Deposits;
import com.project.bank.transactions.details.Transactions.db.model.Withdrawls;
import com.project.bank.transactions.details.Transactions.model.PosDepositsRequestModel;
import com.project.bank.transactions.details.Transactions.model.PosInterAccountTransferRequestModel;
import com.project.bank.transactions.details.Transactions.model.PosWithdrawlRequestModel;

@Component
public class UpdateDepositsAccount {

	//------------withdrawl (deposit account)-------------------------------//
	
	public UpdateTransactions updateWithdrawlAccountMapper(PosWithdrawlRequestModel posReq, UpdateDepositsResponseModel updateDepositsResponse) {
       UpdateTransactions u=new UpdateTransactions();
	    if(updateDepositsResponse.getAccountBalance()>=posReq.getAmountWithdrawn()){
	    	updateDepositsResponse.setAccountBalance(updateDepositsResponse.getAccountBalance()-posReq.getAmountWithdrawn());
	    	updateDepositsResponse.setAccountLastUpdatedOn(new Date());
	   	updateDepositsResponse.setLastUpdatedBalance(updateDepositsResponse.getAccountBalance()-posReq.getAmountWithdrawn());
	       updateDepositsResponse.setDepositsAccountStatus("sucess..");
	    }
	    else{
	        updateDepositsResponse.setDepositsAccountStatus("failed..");
	    }   
	    return u;
	}

	//---------------------deposits (deposit account)----------------------//
	
	public UpdateTransactions updateDepositMapper(PosDepositsRequestModel posReq,
			UpdateDepositsResponseModel updateDepositsResponse) {
		UpdateTransactions u=new UpdateTransactions();
 u.setBalanceAfterDeposit(updateDepositsResponse.getAccountBalance());
       
       return u;
	}
	
	//---------------------loan account transactions----------------------------------------//
	
	//--------------------loan withdrawl--------------------------------------//
	public UpdateTransactions updateLoanWithdrawl(PosWithdrawlRequestModel posReq, UpdateLoanResponseModel updateLoanResponse) {
		UpdateTransactions u=new UpdateTransactions();
          u.setBalancaAfterWithdrawl(updateLoanResponse.getAmount());
          System.out.println("after withdrawl---- amount left----"+u.getBalancaAfterWithdrawl());
	
		return u;
	}

	//--------------------loan deposits-----------------------------------------//
	public UpdateTransactions  updateLoanDeposit(PosDepositsRequestModel posReq, UpdateLoanResponseModel updateLoanResponse) {
		UpdateTransactions u=new UpdateTransactions();
		u.setBalanceAfterDeposit(updateLoanResponse.getAmount());
	    
	return u;
	}
	//-----------------------bank Account updates--------------------------------------------//
	
	public UpdateTransactions updateBankAcc(PosDepositsRequestModel posReq, UpdateBankAccountResponseModel updateResponse) {
		UpdateTransactions u=new UpdateTransactions();
		System.out.println("--------u-  balance after deposit-------");
		u.setBalanceAfterDeposit(updateResponse.getAccountBalance());
		System.out.println("-----------after deposit------"+u.getBalanceAfterDeposit());
	return u;
	}
	public UpdateTransactions updateBankAccWithdrawl(PosWithdrawlRequestModel posReq,
			UpdateBankAccountResponseModel upBankRes) {
		UpdateTransactions u=new UpdateTransactions();
		u.setBalancaAfterWithdrawl(upBankRes.getAccountBalance());
		return u;
	}
	
	}