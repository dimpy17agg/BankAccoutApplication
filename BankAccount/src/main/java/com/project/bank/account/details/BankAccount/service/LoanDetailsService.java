package com.project.bank.account.details.BankAccount.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bank.account.details.BankAccount.db.model.LoanDetails;
import com.project.bank.account.details.BankAccount.model.PosBankAccountResponseModel;
import com.project.bank.account.details.BankAccount.model.PosLoanRequestModel;
import com.project.bank.account.details.BankAccount.model.PosLoanResponseModel;
import com.project.bank.account.details.BankAccount.model.UpdateBankAccountResponseModel;
import com.project.bank.account.details.BankAccount.model.UpdateDepositsRequestModel;
import com.project.bank.account.details.BankAccount.model.UpdateDepositsResponseModel;
import com.project.bank.account.details.BankAccount.model.UpdateLoanRequestModel;
import com.project.bank.account.details.BankAccount.model.UpdateLoanResponseModel;
import com.project.bank.account.details.BankAccount.repository.LoanDetailsRepository;

@Service
public class LoanDetailsService {

	@Autowired
	LoanDetailsRepository repository;
	
	
	public PosLoanResponseModel createLoanAccount(PosLoanRequestModel posLoanRequest) {

		PosLoanResponseModel posLoanResponseModel = new PosLoanResponseModel();
		
		if(String.valueOf(posLoanRequest.getLoanAccountNumber()).startsWith("5053")){
		LoanDetails loanDetails = new LoanDetails();
		loanDetails.setLoanAccountNumber(posLoanRequest.getLoanAccountNumber());
		loanDetails.setLoanAccountHolder(posLoanRequest.getLoanAccountHolder());
		loanDetails.setDateOfBirth(posLoanRequest.getDateOfBirth());
		loanDetails.setInterestRate(posLoanRequest.getInterestRate());
		loanDetails.setBranchNameAndAddress(posLoanRequest.getBranchNameAndAddress());
		loanDetails.setEmailId(posLoanRequest.getEmailId());
		loanDetails.setMoratorium(posLoanRequest.getMoratorium());
		loanDetails.setMobileNo(posLoanRequest.getMobileNo());
		loanDetails.setAmount(posLoanRequest.getAmount());
		loanDetails.setNatureOfLoan(posLoanRequest.getNatureOfLoan());
		loanDetails.setCreditBalance(posLoanRequest.getCreditBalance());
		loanDetails.setDebitBalance(posLoanRequest.getDebitBalance());
		loanDetails.setAmount(posLoanRequest.getAmount());
		loanDetails.setDateOfSanction(new Date());
		loanDetails.setLastUpdatedOn(new Date());
		loanDetails.setNumberOfInstallments(posLoanRequest.getNumberOfInstallments());
	
		 posLoanResponseModel.setLoanAccountNumber(posLoanRequest.getLoanAccountNumber());
	       posLoanResponseModel.setLoanAccountHolder(posLoanRequest.getLoanAccountHolder());
	       posLoanResponseModel.setLoanDetailsStatus("sucess..");
	          
	       repository.save(loanDetails); 
		}
		else{
		  posLoanResponseModel.setLoanDetailsStatus("Invalid loan Acc number.... [it should be strat from 5053]");	
		}
	       return  posLoanResponseModel;
	}

	public void deleteLoanAccountDetails(Long accountNo) {
			LoanDetails b=repository.findByLoanAccountNumber(accountNo);
				Long accId=b.getLoanId();
				repository.deleteById(accId);
	}

	public UpdateLoanResponseModel updateLoanDetails(UpdateLoanRequestModel updateLoanRequest,
			Long accountNo) {
           
		LoanDetails l=repository.findByLoanAccountNumber(accountNo);
		UpdateLoanResponseModel updateLoanResponse=new UpdateLoanResponseModel();
		if(String.valueOf(accountNo).startsWith("5053")){
			if(l!=null){
			
			System.out.println("loan update service------"+l.getLoanAccountNumber());

	   if(updateLoanRequest.getAmountDeposit()!=null && updateLoanRequest.getAmountDeposit()>0){
				l.setDebitBalance(l.getDebitBalance()+updateLoanRequest.getAmountDeposit());
				l.setCreditBalance(l.getCreditBalance()-updateLoanRequest.getAmountDeposit());
			   l.setNumberOfInstallments(l.getNumberOfInstallments()+1);
			   l.setAmount(l.getAmount()+updateLoanRequest.getAmountDeposit());
			   updateLoanResponse.setAmount(l.getAmount());
			  updateLoanResponse.setCreditBalance(l.getCreditBalance());
			  updateLoanResponse.setDebitBalance(l.getDebitBalance());
			  updateLoanResponse.setNumberOfInstallments(l.getNumberOfInstallments());
			}
		   if(updateLoanRequest.getAmountWithdrwal()!=null && updateLoanRequest.getAmountWithdrwal()>0){
			   l.setDebitBalance(l.getDebitBalance()-updateLoanRequest.getAmountWithdrwal());
			   l.setCreditBalance(l.getCreditBalance()+updateLoanRequest.getAmountWithdrwal());
			   l.setDateOfSanction(new Date());
			   l.setLastUpdatedOn(new Date());
			   l.setAmount(l.getAmount()-updateLoanRequest.getAmountWithdrwal());
			   updateLoanResponse.setAmount(l.getAmount());
				  updateLoanResponse.setCreditBalance(l.getCreditBalance());
				  updateLoanResponse.setDebitBalance(l.getDebitBalance());
				  updateLoanResponse.setNumberOfInstallments(l.getNumberOfInstallments());
		   }
			repository.save(l);
			if(updateLoanRequest.getMobileNo()!=null){
				l.setMobileNo(updateLoanRequest.getMobileNo());
				updateLoanResponse.setMobileNo(l.getMobileNo());
			}
			if(updateLoanRequest.getEmailId()!=null){
				l.setEmailId(l.getEmailId());
				updateLoanResponse.setEmailId(l.getEmailId());
			}
			updateLoanResponse.setMobileNo(l.getMobileNo());
			updateLoanResponse.setEmailId(l.getEmailId());	
			updateLoanResponse.setLoanAccountNumber(l.getLoanAccountNumber());
			updateLoanResponse.setUpdateLoanStatus("update sucess");
		}else{
			updateLoanResponse.setUpdateLoanStatus("failed..(Account Number is not matched!)");
				
		}
		}else{
			updateLoanResponse.setUpdateLoanStatus("Account Number is invalid!! check it for Loan Accounts");

		}
		return updateLoanResponse;
		


		
	}

}
