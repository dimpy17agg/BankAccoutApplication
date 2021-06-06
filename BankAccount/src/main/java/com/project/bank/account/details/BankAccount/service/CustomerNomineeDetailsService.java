package com.project.bank.account.details.BankAccount.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bank.account.details.BankAccount.db.model.BankAccountDetails;
import com.project.bank.account.details.BankAccount.db.model.CustomerNomineeDetails;
import com.project.bank.account.details.BankAccount.model.PosBankAccountResponseModel;
import com.project.bank.account.details.BankAccount.model.PosCustomerNomineeRequestModel;
import com.project.bank.account.details.BankAccount.model.PosCustomerNomineeResponseModel;
import com.project.bank.account.details.BankAccount.model.UpdateBankAccountRequestModel;
import com.project.bank.account.details.BankAccount.model.UpdateBankAccountResponseModel;
import com.project.bank.account.details.BankAccount.model.UpdateCustomerNomineeRequestModel;
import com.project.bank.account.details.BankAccount.model.UpdateCustomerNomineeResponseModel;
import com.project.bank.account.details.BankAccount.repository.CustomerNomineeDetailsRepository;

@Service
public class CustomerNomineeDetailsService {

	@Autowired
	CustomerNomineeDetailsRepository repository;

	public PosCustomerNomineeResponseModel createBankAccountRecord(
			PosCustomerNomineeRequestModel posCustomerNomineeRequest) {
		
			CustomerNomineeDetails customerNomineeDetails = new CustomerNomineeDetails();
			customerNomineeDetails.setAccountNumber(posCustomerNomineeRequest.getAccountNumber());
			customerNomineeDetails.setAccountHolder(posCustomerNomineeRequest.getAccountHolder());
			customerNomineeDetails.setRelationshipWithHolder(posCustomerNomineeRequest.getRelationshipWithHolder());
			customerNomineeDetails.setRegNo(posCustomerNomineeRequest.getRegNo());
			Date d=new Date();
			customerNomineeDetails.setNominationRegdDate(d);
			
			PosCustomerNomineeResponseModel posCustomerNomineeResponse = new PosCustomerNomineeResponseModel();
			posCustomerNomineeResponse.setAccountNumber(customerNomineeDetails.getAccountNumber());
		      posCustomerNomineeResponse.setAccountHolder(customerNomineeDetails.getAccountHolder());
		      posCustomerNomineeResponse.setNominationRegdDate(d);
		      posCustomerNomineeResponse.setRelationshipWithHolder(customerNomineeDetails.getRelationshipWithHolder());
		      posCustomerNomineeResponse.setRegNo(customerNomineeDetails.getRegNo());
		      posCustomerNomineeResponse.setNomineeStatus("success..");
		      repository.save(customerNomineeDetails); 
		      return posCustomerNomineeResponse;
	}

	public void deleteCustomerNomineeDetails(Long accountNo) {
		List<CustomerNomineeDetails> customerNomineeList=repository.findAll();
		for(int i=0;i<customerNomineeList.size();i++){
			CustomerNomineeDetails b=customerNomineeList.get(i);
			if(b.getAccountNumber()==accountNo){
				long cust_Id=b.getNominationId();
				repository.deleteById(cust_Id);
				return;
			}
		}
	}

	public UpdateCustomerNomineeResponseModel updateCustomerNomineeDetails(
			UpdateCustomerNomineeRequestModel updateCustomerNomineeRequest, Long accountNo) {
		
		List<CustomerNomineeDetails> customerNomineeList=repository.findAll();
		UpdateCustomerNomineeResponseModel updateCustomerResponse=new UpdateCustomerNomineeResponseModel();
		//boolean status=false;
		for(int i=0;i<customerNomineeList.size();i++){
			CustomerNomineeDetails b=customerNomineeList.get(i);
			if(b.getAccountNumber()==accountNo){
				//Long accId=b.getAccountId();
		//	BankAccountDetails bankAccountDetails = new BankAccountDetails();
			
			b.setAccountNumber(updateCustomerNomineeRequest.getAccountNumber());
			b.setNomineeName(updateCustomerNomineeRequest.getNomineeName());
			b.setRelationshipWithHolder(updateCustomerNomineeRequest.getRelationshipWithHolder());	
		       repository.save(b);
			
			updateCustomerResponse.setAccountNumber(updateCustomerNomineeRequest.getAccountNumber());
			updateCustomerResponse.setNomineeName(updateCustomerNomineeRequest.getNomineeName());
			updateCustomerResponse.setRelationshipWithHolder(updateCustomerNomineeRequest.getRelationshipWithHolder());	
			updateCustomerResponse.setUpdateCustomerNomineeStatus("update successfully..");
			
			return updateCustomerResponse;
			}
		}
		updateCustomerResponse.setUpdateCustomerNomineeStatus("failed..");
		return updateCustomerResponse;	
	}
	
		
}
