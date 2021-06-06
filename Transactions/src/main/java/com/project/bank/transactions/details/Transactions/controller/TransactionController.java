package com.project.bank.transactions.details.Transactions.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.bank.transactions.details.Transactions.Mapper.UpdateDepositsAccount;
import com.project.bank.transactions.details.Transactions.model.GetDepositsResponseModel;
import com.project.bank.transactions.details.Transactions.model.GetInterAccountTransferResponseModel;
import com.project.bank.transactions.details.Transactions.model.GetWithdrawlResponseModel;
import com.project.bank.transactions.details.Transactions.model.PosDepositsRequestModel;
import com.project.bank.transactions.details.Transactions.model.PosDepositsResponseModel;
import com.project.bank.transactions.details.Transactions.model.PosInterAccountTransferRequestModel;
import com.project.bank.transactions.details.Transactions.model.PosInterAccountTransferResponseModel;
import com.project.bank.transactions.details.Transactions.model.PosWithdrawlRequestModel;
import com.project.bank.transactions.details.Transactions.model.PosWithdrawlResponseModel;
import com.project.bank.transactions.details.Transactions.service.DepositsService;
import com.project.bank.transactions.details.Transactions.service.InterAccountTransfersService;
import com.project.bank.transactions.details.Transactions.service.WithdrawlsService;

import io.swagger.annotations.ApiModel;

import com.project.bank.transactions.details.Transactions.FeignProxy.*;

@RestController
@ApiModel(description="transaction service ")
public class TransactionController {

	@Autowired
	WithdrawlsService withdrawlService;
	
	@Autowired
	DepositsService depositsService;
	
	@Autowired
	InterAccountTransfersService interService;
	
	@Autowired
	FeignTransactionProxy transactionProxy;
	
	@Autowired
	 UpdateDepositsAccount updateMapper;

	
	
	//------------------------WITHDRAWL-----------------------------//
	@PostMapping(value="/transactions/create/withdrawl/account/details" , produces="application/json", consumes="application/json")
	public PosWithdrawlResponseModel createWithdrawl(@RequestBody PosWithdrawlRequestModel posReq){
		UpdateTransactions updateTransaction=new UpdateTransactions();
		
		String accountNo=String.valueOf(posReq.getAccountNumber());
		if(accountNo.startsWith("5053")){
			UpdateLoanRequestModel updateLoanRequest=new UpdateLoanRequestModel();
			updateLoanRequest.setLoanAccountNumber(posReq.getAccountNumber());
			updateLoanRequest.setAmountWithdrwal(posReq.getAmountWithdrawn());
			UpdateLoanResponseModel updateLoanResponse=transactionProxy.updateLoanDetailsAccount(posReq.getAccountNumber(), updateLoanRequest);
			 updateTransaction=updateMapper.updateLoanWithdrawl(posReq,updateLoanResponse);
		}
		else if(accountNo.startsWith("5064")){	
		UpdateDepositsRequestModel u=new UpdateDepositsRequestModel();
		u.setDepositAccountNumber(posReq.getAccountNumber());
		u.setAmountWithdrwal(posReq.getAmountWithdrawn());
		UpdateDepositsResponseModel updateDepositsResponse=transactionProxy.updateDepositsAccount(posReq.getAccountNumber(),u);
		updateTransaction=updateMapper.updateWithdrawlAccountMapper(posReq,updateDepositsResponse);
		}
		else{
			UpdateBankAccountRequestModel updateBank=new UpdateBankAccountRequestModel();
			updateBank.setAccountNumber(posReq.getAccountNumber());
			updateBank.setAmountWithdrwal(posReq.getAmountWithdrawn());
		UpdateBankAccountResponseModel upBankRes=transactionProxy.updateBankAccount(posReq.getAccountNumber(), updateBank);	
		updateTransaction=updateMapper.updateBankAccWithdrawl(posReq,upBankRes);
		}
		
		 return withdrawlService.createWithdrawl(posReq,updateTransaction);
	}
	
	
	
	@GetMapping(value="/transactions/read/withdrawl/account/details/{accountNo}" , produces="application/json", consumes="application/json")
	public GetWithdrawlResponseModel getWithdrawl(@PathVariable Long accountNo){
		return withdrawlService.getWithdrawl(accountNo);
	}
	
	//---------------------------------deposits------------------------------------//
	
	
	
	
	@PostMapping(value="/transactions/create/deposits/account/details" , produces="application/json", consumes="application/json")
	public PosDepositsResponseModel createDeposit(@RequestBody PosDepositsRequestModel posReq){
		UpdateTransactions updateTransaction=new UpdateTransactions();
		
		if(String.valueOf(posReq.getAccountNumber()).startsWith("5053")){
			UpdateLoanRequestModel updateLoanRequest=new UpdateLoanRequestModel();
			updateLoanRequest.setLoanAccountNumber(posReq.getAccountNumber());
			updateLoanRequest.setAmountDeposit(posReq.getAmountDeposited());
			UpdateLoanResponseModel updateLoanResponse=transactionProxy.updateLoanDetailsAccount(posReq.getAccountNumber(), updateLoanRequest);
			updateTransaction=updateMapper.updateLoanDeposit(posReq,updateLoanResponse);		
		}
		
		else if(String.valueOf(posReq.getAccountNumber()).startsWith("5064")){
		UpdateDepositsRequestModel u=new UpdateDepositsRequestModel();
		u.setDepositAccountNumber(posReq.getAccountNumber());
		u.setAmountDeposit(posReq.getAmountDeposited());
		 UpdateDepositsResponseModel updateDepositsResponse=transactionProxy.updateDepositsAccount(posReq.getAccountNumber(),u);
		 updateTransaction= updateMapper.updateDepositMapper(posReq,updateDepositsResponse);
		}
		
		else{
			UpdateBankAccountRequestModel u=new UpdateBankAccountRequestModel();
			u.setAccountNumber(posReq.getAccountNumber());
			u.setAmountDeposit(posReq.getAmountDeposited());
			UpdateBankAccountResponseModel updateResponse=transactionProxy.updateBankAccount(posReq.getAccountNumber(),u);
			updateTransaction= updateMapper.updateBankAcc(posReq,updateResponse);
			
		}
		 
		return depositsService.createDeposits(posReq,updateTransaction);
	}
	
	@GetMapping(value="/transactions/read/deposits/account/transfer/{accountNo}" , produces="application/json", consumes="application/json")
	public GetDepositsResponseModel getDeposits(@PathVariable Long accountNo){
		return depositsService.getDeposits(accountNo);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	//----------------inter account transfer----------------------------------//
	
	@PostMapping(value="/transactions/create/account/transfer" , produces="application/json", consumes="application/json")
	public PosInterAccountTransferResponseModel createInterAccountTransfer(@RequestBody PosInterAccountTransferRequestModel posReq){
		
		
		if(String.valueOf(posReq.getAccountNumberFrom()).startsWith("5053")){
			UpdateLoanRequestModel updateLoanRequest=new UpdateLoanRequestModel();
			updateLoanRequest.setLoanAccountNumber(posReq.getAccountNumberFrom());
			updateLoanRequest.setAmountWithdrwal(posReq.getAmountTransferred());
			UpdateLoanResponseModel updateLoan=transactionProxy.updateLoanDetailsAccount(posReq.getAccountNumberFrom(), updateLoanRequest);
		}
		else if(String.valueOf(posReq.getAccountNumberFrom()).startsWith("5064")){
			UpdateDepositsRequestModel u=new UpdateDepositsRequestModel();
			u.setDepositAccountNumber(posReq.getAccountNumberFrom());
			u.setAmountWithdrwal(posReq.getAmountTransferred());
			System.out.println("checcking inter transfer account from for withdrawls and deposits");

			System.out.println(u.getAmountWithdrwal()+"------------"+u.getDepositAccountNumber());
		 UpdateDepositsResponseModel updateDepositsResponse=transactionProxy.updateDepositsAccount(posReq.getAccountNumberFrom(),u);
		}
		else{
			UpdateBankAccountRequestModel u=new UpdateBankAccountRequestModel();
			u.setAccountNumber(posReq.getAccountNumberFrom());
			u.setAmountWithdrwal(posReq.getAmountTransferred());
			System.out.println("checcking inter transfer from bank account for withdrawls and deposits");

			System.out.println(u.getAmountWithdrwal()+"------------"+u.getAccountNumber());
			 UpdateBankAccountResponseModel updateResponse=transactionProxy.updateBankAccount(posReq.getAccountNumberFrom(),u);
		}

		String tAccNo=String.valueOf(posReq.getAccountNumberTo());
		if(tAccNo.startsWith("5053")){
			UpdateLoanRequestModel updateLoanRequest=new UpdateLoanRequestModel();
			updateLoanRequest.setLoanAccountNumber(posReq.getAccountNumberTo());
			updateLoanRequest.setAmountDeposit(posReq.getAmountTransferred());
			UpdateLoanResponseModel updateLoanResponse=transactionProxy.updateLoanDetailsAccount(posReq.getAccountNumberTo(), updateLoanRequest);
		}
		else if(tAccNo.startsWith("5064")){
			UpdateDepositsRequestModel u=new UpdateDepositsRequestModel();
			u.setDepositAccountNumber(posReq.getAccountNumberTo());
			u.setAmountDeposit(posReq.getAmountTransferred());
			UpdateDepositsResponseModel updateDeposits=transactionProxy.updateDepositsAccount(posReq.getAccountNumberTo(),u);
		}
		else{
			UpdateBankAccountRequestModel u=new UpdateBankAccountRequestModel();
			u.setAccountNumber(posReq.getAccountNumberTo());
			u.setAmountDeposit(posReq.getAmountTransferred());
			UpdateBankAccountResponseModel updateResponse=transactionProxy.updateBankAccount(posReq.getAccountNumberTo(),u);
		}
		return interService.createInterAccountTransfer(posReq);
	}
	
	@GetMapping(value="/transactions/read/inter/account/transfer/{accountNoFrom}/{accountNoTo}" , produces="application/json", consumes="application/json")
	public GetInterAccountTransferResponseModel getInterAccountTransfer(@PathVariable Long accountNoFrom,@PathVariable Long accountNoTo){
		return interService.getInterAccountTransfer(accountNoFrom,accountNoTo);
	}
	 
	
	
}
