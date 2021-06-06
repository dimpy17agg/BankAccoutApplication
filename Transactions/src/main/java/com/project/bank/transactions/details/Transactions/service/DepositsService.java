package com.project.bank.transactions.details.Transactions.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bank.transactions.details.Transactions.FeignProxy.UpdateTransactions;
import com.project.bank.transactions.details.Transactions.db.model.Deposits;
import com.project.bank.transactions.details.Transactions.model.GetDepositsResponseModel;
import com.project.bank.transactions.details.Transactions.model.PosDepositsRequestModel;
import com.project.bank.transactions.details.Transactions.model.PosDepositsResponseModel;
import com.project.bank.transactions.details.Transactions.repository.DepositRepository;

@Service
public class DepositsService {

	@Autowired
	DepositRepository repository;
	
public PosDepositsResponseModel createDeposits(PosDepositsRequestModel posReq, UpdateTransactions u) {
	
	Deposits d=new Deposits();
	d.setAccountNumber(posReq.getAccountNumber());
	d.setAccountHolder(posReq.getAccountHolder());
	d.setAmountDeposited(posReq.getAmountDeposited());
	d.setDateOfDeposit(posReq.getDateOfDeposit());
	d.setNatureOfAccount(posReq.getNatureOfAccount());
   d.setBalanceAfterDeposit(u.getBalanceAfterDeposit());
	repository.save(d);
	PosDepositsResponseModel res=new PosDepositsResponseModel();
	res.setAccountHolder(d.getAccountHolder());
    res.setAccountNumber(d.getAccountNumber());
	res.setAmountDeposited(d.getAmountDeposited());
	res.setNatureOfAccount(d.getNatureOfAccount());
	res.setStatus("sucess ");
	return res;
}

public GetDepositsResponseModel getDeposits(Long accountNo) {  
   
	   Deposits d=repository.findByAccountNumber(accountNo);  
      System.out.println("deposit repo>>>>>>>>>>"+d);
   GetDepositsResponseModel response=new GetDepositsResponseModel();
   response.setAccountNumber(d.getAccountNumber());
   response.setAccountHolder(d.getAccountHolder());
   response.setAmountDeposited(d.getAmountDeposited());
   response.setNatureOfAccount(d.getNatureOfAccount());
	return response;
}

}