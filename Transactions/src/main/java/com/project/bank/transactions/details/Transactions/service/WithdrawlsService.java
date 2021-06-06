package com.project.bank.transactions.details.Transactions.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bank.transactions.details.Transactions.FeignProxy.UpdateDepositsRequestModel;
import com.project.bank.transactions.details.Transactions.FeignProxy.UpdateDepositsResponseModel;
import com.project.bank.transactions.details.Transactions.FeignProxy.UpdateTransactions;
import com.project.bank.transactions.details.Transactions.db.model.Withdrawls;
import com.project.bank.transactions.details.Transactions.model.GetWithdrawlResponseModel;
import com.project.bank.transactions.details.Transactions.model.PosWithdrawlRequestModel;
import com.project.bank.transactions.details.Transactions.model.PosWithdrawlResponseModel;
import com.project.bank.transactions.details.Transactions.repository.WithdrawlsRepository;

@Service
public class WithdrawlsService {

	@Autowired
     WithdrawlsRepository repository;

	public PosWithdrawlResponseModel createWithdrawl(PosWithdrawlRequestModel posReq,UpdateTransactions u) {
		
		Withdrawls w=new Withdrawls();
		UpdateDepositsRequestModel updateDeposits=new UpdateDepositsRequestModel();
		System.out.println("------------in create withdrawl------------"+u.getBalancaAfterWithdrawl());
		w.setAccountHolder(posReq.getAccountHolder());
		w.setAccountNumber(posReq.getAccountNumber());
		w.setAmountWithdrawn(posReq.getAmountWithdrawn());
		w.setDateOfWithdrawal(new Date());
		w.setNatureOfAccount(posReq.getNatureOfAccount());
		w.setBalanceAfterWithdrawal(u.getBalancaAfterWithdrawl());
		System.out.println("withdrwals Withdraw Balance>>>>>>>>>>>>>>>>>>>" + w.getBalanceAfterWithdrawal());
		repository.save(w);
		PosWithdrawlResponseModel res=new PosWithdrawlResponseModel();
		res.setAccountHolder(w.getAccountHolder());
	    res.setAccountNumber(w.getAccountNumber());
    	res.setAmountWithdrawn(w.getAmountWithdrawn());
		res.setNatureOfAccount(w.getNatureOfAccount());
		res.setStatus("sucess");
		return res;
	}

	public GetWithdrawlResponseModel getWithdrawl(Long accountNo) {  
      
		GetWithdrawlResponseModel response=new GetWithdrawlResponseModel();
    	   Withdrawls w=repository.findByAccountNumber(accountNo);
	   response.setAccountNumber(w.getAccountNumber());
	   response.setAccountHolder(w.getAccountHolder());
	   response.setAmountWithdrawn(w.getAmountWithdrawn());
	   response.setDateOfWithdrawl(w.getDateOfWithdrawal());
	   response.setNatureOfAccount(w.getNatureOfAccount());
		return response;
       
	}

}
