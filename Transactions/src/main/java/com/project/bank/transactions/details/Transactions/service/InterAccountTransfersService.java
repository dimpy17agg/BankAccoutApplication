package com.project.bank.transactions.details.Transactions.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bank.transactions.details.Transactions.db.model.InterAccountTransfers;
import com.project.bank.transactions.details.Transactions.model.GetInterAccountTransferResponseModel;
import com.project.bank.transactions.details.Transactions.model.PosInterAccountTransferRequestModel;
import com.project.bank.transactions.details.Transactions.model.PosInterAccountTransferResponseModel;
import com.project.bank.transactions.details.Transactions.repository.DepositRepository;
import com.project.bank.transactions.details.Transactions.repository.InterAccountTransfersRepository;

@Service
public class InterAccountTransfersService {

	@Autowired
	InterAccountTransfersRepository repository;
	
public PosInterAccountTransferResponseModel createInterAccountTransfer(PosInterAccountTransferRequestModel posReq) {
	
	InterAccountTransfers inter=new InterAccountTransfers();
	inter.setAccountNumberFrom(posReq.getAccountNumberFrom());
	inter.setAccountNumberTo(posReq.getAccountNumberTo());
	inter.setAmountTransferred(posReq.getAmountTransferred());
	inter.setDateOfTransfer(new Date());
	inter.setModeOfTransfer(posReq.getModeOfTransfer());
	inter.setCreditAccName(posReq.getCreditAccName());
	inter.setDebitAccName(posReq.getDebitAccName());
	
	repository.save(inter);
	System.out.println("Inter Account Transfer");
	System.out.println(inter);
	PosInterAccountTransferResponseModel res=new PosInterAccountTransferResponseModel();
	res.setAccountNumberFrom(posReq.getAccountNumberFrom());
	res.setAccountNumberTo(posReq.getAccountNumberTo());
	res.setAmountTransferred(posReq.getAmountTransferred());
	res.setDateOfTransfer(new Date());
	res.setModeOfTransfer(posReq.getModeOfTransfer());
	res.setCreditAccName(posReq.getCreditAccName());
	res.setDebitAccName(posReq.getDebitAccName());
	res.setStatus("sucess ");
	return res;
}

public GetInterAccountTransferResponseModel getInterAccountTransfer(Long accountNoFrom,Long accountNoTo) {  
  
	   InterAccountTransfers inter=repository.findByAccountNumberFrom(accountNoFrom);
	  InterAccountTransfers interTo=repository.findByAccountNumberTo(accountNoTo);
       
   GetInterAccountTransferResponseModel res=new GetInterAccountTransferResponseModel();
   if(accountNoFrom==inter.getAccountNumberFrom() && accountNoTo==interTo.getAccountNumberTo()){
   res.setAccountNumberFrom(inter.getAccountNumberFrom());
	res.setAccountNumberTo(inter.getAccountNumberTo());
	res.setAmountTransferred(inter.getAmountTransferred());
	res.setDateOfTransfer(inter.getDateOfTransfer());
	res.setModeOfTransfer(inter.getModeOfTransfer());
	res.setCreditAccName(inter.getCreditAccName());
	res.setDebitAccName(inter.getDebitAccName());
	res.setStatus("sucess ");
   }
   else{
	   res.setStatus("failed!!!!");
   }
	return res;
   
}
		
}
