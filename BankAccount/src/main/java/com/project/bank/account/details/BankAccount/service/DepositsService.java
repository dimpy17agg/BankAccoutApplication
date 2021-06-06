package com.project.bank.account.details.BankAccount.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bank.account.details.BankAccount.db.model.BankAccountDetails;
import com.project.bank.account.details.BankAccount.db.model.Deposits;
import com.project.bank.account.details.BankAccount.model.PosBankAccountResponseModel;
import com.project.bank.account.details.BankAccount.model.PosDepositsRequestModel;
import com.project.bank.account.details.BankAccount.model.PosDepositsResponseModel;
import com.project.bank.account.details.BankAccount.model.PosDepositsResponseModel;
import com.project.bank.account.details.BankAccount.model.UpdateBankAccountResponseModel;
import com.project.bank.account.details.BankAccount.model.UpdateDepositsRequestModel;
import com.project.bank.account.details.BankAccount.model.UpdateDepositsResponseModel;
import com.project.bank.account.details.BankAccount.model.UpdateDepositsResponseModel;
import com.project.bank.account.details.BankAccount.repository.DepositsRepository;

@Service
public class DepositsService {

	@Autowired
	DepositsRepository repository;
	
	public PosDepositsResponseModel createDepositsAccount(PosDepositsRequestModel posDepositsRequest) {
		PosDepositsResponseModel posDepositsResponseModel = new PosDepositsResponseModel();
		System.out.println("--------Depoits Account--------------------");
		System.out.println("Account Number------------>"+posDepositsRequest.getDepositAccountNumber());
		if(String.valueOf(posDepositsRequest.getDepositAccountNumber()).startsWith("5064")){
		Deposits deposits = new Deposits();
		deposits.setDepositAccountNumber(posDepositsRequest.getDepositAccountNumber());
		deposits.setDepositAccountHolder(posDepositsRequest.getDepositAccountHolder());
		deposits.setDateOfBirth(posDepositsRequest.getDateOfBirth());
		deposits.setAddress(posDepositsRequest.getAddress());
		deposits.setBranchNameAndAddress(posDepositsRequest.getBranchNameAndAddress());
		deposits.setEmailId(posDepositsRequest.getEmailId());
		deposits.setCifNo(posDepositsRequest.getCifNo());
		deposits.setMobileNo(posDepositsRequest.getMobileNo());
		deposits.setAge(posDepositsRequest.getAge());
		deposits.setNatureOfDeposit(posDepositsRequest.getNatureOfDeposit());
		deposits.setIfsc(posDepositsRequest.getIfsc());
		deposits.setMicrCode(posDepositsRequest.getMicrCode());
		deposits.setFatherName(posDepositsRequest.getFatherName());
		deposits.setModeOfOperation(posDepositsRequest.getModeOfOperation());
		deposits.setNomineeDetails(posDepositsRequest.getNomineeDetails());
		deposits.setOccupation(posDepositsRequest.getOccupation());
		deposits.setPan(posDepositsRequest.getPan());
		deposits.setNatureOfDeposit(posDepositsRequest.getNatureOfDeposit());
		deposits.setAccountBalance(posDepositsRequest.getAccountBalance());
		deposits.setLastUpdatedBalance(posDepositsRequest.getLastUpdatedBalance());
		deposits.setAccountLastUpdatedOn(new Date());
		 repository.save(deposits); 
		// System.out.println(" post method- DEPOSIT ACCOUNT DETAILS>>>>>>>>>>>>>>>>>>>"+deposits); 
		 posDepositsResponseModel.setDepositAccountNumber(posDepositsRequest.getDepositAccountNumber());
	      posDepositsResponseModel.setDepositAccountHolder(posDepositsRequest.getDepositAccountHolder());
	       posDepositsResponseModel.setDepositsStatus("sucess..");
	         posDepositsResponseModel.setNatureOfDeposit(posDepositsRequest.getNatureOfDeposit());
	      
	     //  System.out.println("pos method- DEPOSIT ACCOUNT DETAILS>>>>>>>>>>>>>>>>>>>"+deposits); 
		}
		else{
		posDepositsResponseModel.setDepositsStatus("invalid account number...(should starts with 5064)");
		}
	       return  posDepositsResponseModel;
	}

	public void deleteCustomerNomineeDetails(Long accountNo) {

		Deposits deposit = repository.findByDepositAccountNumber(accountNo);
		if(deposit != null){
		Long accId=deposit.getDepositId();
		repository.deleteById(accId);
		}
		
	}

	public UpdateDepositsResponseModel updateDepositsDetails(UpdateDepositsRequestModel updateDepositsRequest,
			Long accountNo) {		
		UpdateDepositsResponseModel updateDepositsResponse=new UpdateDepositsResponseModel();
       
		Deposits deposit = repository.findByDepositAccountNumber(accountNo);
		if(String.valueOf(accountNo).startsWith("5064")){
		if(deposit != null){
		
			if(updateDepositsRequest.getAmountWithdrwal()!= null && updateDepositsRequest.getAmountWithdrwal()>0){
		deposit.setLastUpdatedBalance(deposit.getAccountBalance() - updateDepositsRequest.getAmountWithdrwal());
		deposit.setAccountBalance(deposit.getLastUpdatedBalance());
			
			updateDepositsResponse.setAccountBalance(deposit.getAccountBalance());
			updateDepositsResponse.setLastUpdatedBalance(deposit.getLastUpdatedBalance());
			}
			else if(updateDepositsRequest.getAmountDeposit()!=null && updateDepositsRequest.getAmountDeposit() > 0){
		deposit.setLastUpdatedBalance(deposit.getAccountBalance()+updateDepositsRequest.getAmountDeposit());
			deposit.setAccountBalance(deposit.getLastUpdatedBalance());
			
			updateDepositsResponse.setAccountBalance(deposit.getAccountBalance());
			updateDepositsResponse.setLastUpdatedBalance(deposit.getLastUpdatedBalance());
			}
			
			if(updateDepositsRequest.getMobileNo()!=null){
				updateDepositsResponse.setMobileNo(updateDepositsRequest.getMobileNo());	
			      deposit.setMobileNo(updateDepositsRequest.getMobileNo());
			}
			if(updateDepositsRequest.getAddress()!=null){
				updateDepositsResponse.setAddress(updateDepositsRequest.getAddress());
				deposit.setAddress(updateDepositsRequest.getAddress());
			}if(updateDepositsRequest.getOccupation()!=null){
				updateDepositsResponse.setOccupation(updateDepositsRequest.getOccupation());
				deposit.setOccupation(updateDepositsRequest.getOccupation());
			}
			
		deposit.setAccountLastUpdatedOn(new Date());
		deposit = repository.save(deposit);
		updateDepositsResponse.setMobileNo(deposit.getMobileNo());
		updateDepositsResponse.setAddress(deposit.getAddress());	
		updateDepositsResponse.setOccupation(deposit.getOccupation());
		updateDepositsResponse.setAccountBalance(deposit.getAccountBalance());
		updateDepositsResponse.setAccountLastUpdatedOn(new Date());
		updateDepositsResponse.setLastUpdatedBalance(deposit.getLastUpdatedBalance());
		updateDepositsResponse.setDepositsAccountStatus("update sucess");
		updateDepositsResponse.setDepositAccountNumber(deposit.getDepositAccountNumber());
		}
		else{
			updateDepositsResponse.setDepositsAccountStatus("failed..(Account Number not matched)");
		}
		}
		else{
			updateDepositsResponse.setDepositsAccountStatus("enter valid DEPOSIT ACCOUNT");	
		}

		return updateDepositsResponse;
		}
	}
		
	
	

