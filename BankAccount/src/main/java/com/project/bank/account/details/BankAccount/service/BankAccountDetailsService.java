package com.project.bank.account.details.BankAccount.service;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bank.account.details.BankAccount.db.model.BankAccountDetails;
import com.project.bank.account.details.BankAccount.model.PosBankAccountDetailsRequestModel;
import com.project.bank.account.details.BankAccount.model.PosBankAccountResponseModel;
import com.project.bank.account.details.BankAccount.model.UpdateBankAccountRequestModel;
import com.project.bank.account.details.BankAccount.model.UpdateBankAccountResponseModel;
import com.project.bank.account.details.BankAccount.repository.BankAccountDetailsRepository;

@Service
public class BankAccountDetailsService {

	@Autowired
	BankAccountDetailsRepository repository;

	//----------------post method--------------
	public PosBankAccountResponseModel createBankAccountRecord(PosBankAccountDetailsRequestModel posBankAccountDetailsRequest)throws Exception {
		BankAccountDetails bankAccountDetails = new BankAccountDetails();
		bankAccountDetails.setAccountNumber(posBankAccountDetailsRequest.getAccountNumber());
		bankAccountDetails.setAccountHolder(posBankAccountDetailsRequest.getAccountHolder());
		bankAccountDetails.setDateOfBirth(posBankAccountDetailsRequest.getDateOfBirth());
		bankAccountDetails.setAge(posBankAccountDetailsRequest.getAge());
		bankAccountDetails.setBranchNameAndAddress(posBankAccountDetailsRequest.getBranchNameAndAddress());
		bankAccountDetails.setEmailId(posBankAccountDetailsRequest.getEmailId());
		bankAccountDetails.setMicrCode(posBankAccountDetailsRequest.getMicrCode());
		bankAccountDetails.setIfsc(posBankAccountDetailsRequest.getIfsc());
		bankAccountDetails.setModeOfOperation(posBankAccountDetailsRequest.getModeOfOperation());
		bankAccountDetails.setCifNo(posBankAccountDetailsRequest.getCifNo());
		bankAccountDetails.setPan(posBankAccountDetailsRequest.getPan());
		bankAccountDetails.setFatherName(posBankAccountDetailsRequest.getFatherName());
		bankAccountDetails.setAddress(posBankAccountDetailsRequest.getAddress());
		bankAccountDetails.setOccupation(posBankAccountDetailsRequest.getOccupation());
          bankAccountDetails.setAccountBalance(posBankAccountDetailsRequest.getAccountBalance());
          bankAccountDetails.setLastUpdatedBalance(posBankAccountDetailsRequest.getLastUpdatedBalance());
          bankAccountDetails.setAccountLastUpdatedOn(new Date());
		bankAccountDetails.setAccountInitiatedOn(new Date());
		PosBankAccountResponseModel posBankResponseModel = new PosBankAccountResponseModel();
		posBankResponseModel.setAccountNumber(bankAccountDetails.getAccountNumber());
	      posBankResponseModel.setAccountHolder(bankAccountDetails.getAccountHolder());
	      posBankResponseModel.setAccountInitiatedOn(bankAccountDetails.getAccountInitiatedOn());
	      posBankResponseModel.setAccountOpeningStatus("success");
	          posBankResponseModel.setAccountInitiatedOn(new Date());
	      repository.save(bankAccountDetails); 
	      return posBankResponseModel;
	}
	//-------------------------------post method end-------------------------------------//

	
	
	//--------------------delete method ------------------------------------------
	public void deleteBankAccountDetails(Long accountNo) {
		
		BankAccountDetails b=repository.findByAccountNumber(accountNo);
		if(b!=null){
		Long accId=b.getAccountId();
		repository.deleteById(accId);
		}
		
	}
	//-------------------------------delete method end-------------------------------------//
	
	
	
	
	//-----------------------update method---------------
	public UpdateBankAccountResponseModel updateBankAccountDetails(UpdateBankAccountRequestModel updateBankRequestBody,
			Long accountNo) {
		
		BankAccountDetails b=repository.findByAccountNumber(accountNo);
		UpdateBankAccountResponseModel updateBankResponse=new UpdateBankAccountResponseModel();
		
			if(updateBankRequestBody.getAmountWithdrwal()!=null && updateBankRequestBody.getAmountWithdrwal()>0 ){
				b.setAccountBalance(b.getAccountBalance() - updateBankRequestBody.getAmountWithdrwal());
				b.setLastUpdatedBalance(b.getAccountBalance());
				updateBankResponse.setAccountBalance(b.getLastUpdatedBalance());
				updateBankResponse.setAccountBalance(b.getAccountBalance());
				System.out.println("-------balance in bank account---"+b.getAccountBalance());
				System.out.println(b.getLastUpdatedBalance());
			}
					if(updateBankRequestBody.getAmountDeposit()!=null && updateBankRequestBody.getAmountDeposit()>0) {
				b.setLastUpdatedBalance(b.getAccountBalance()+updateBankRequestBody.getAmountDeposit());
				b.setAccountBalance(b.getLastUpdatedBalance());
				updateBankResponse.setAccountBalance(b.getLastUpdatedBalance());
				updateBankResponse.setAccountBalance(b.getAccountBalance());
					}
					if(updateBankRequestBody.getAddress()!=null){
						b.setAddress(updateBankRequestBody.getAddress());
					   updateBankResponse.setAddress(b.getAddress());
					}
					if(updateBankRequestBody.getMobileNo()!=null){
						b.setAddress(updateBankRequestBody.getAddress());
					   updateBankResponse.setAddress(b.getAddress());
					}
					if(updateBankRequestBody.getOccupation()!=null){
						b.setOccupation(updateBankRequestBody.getOccupation());
					   updateBankResponse.setOccupation(b.getOccupation());
					}
                 repository.save(b);
            
			updateBankResponse.setMobileNo(b.getMobileNo());
			updateBankResponse.setAddress(b.getAddress());
			updateBankResponse.setOccupation(b.getOccupation());	
			updateBankResponse.setAccountNumber(b.getAccountNumber());
			updateBankResponse.setPan(b.getPan());
			updateBankResponse.setAccountUpdateStatus("update successfully..");	
		return updateBankResponse;	
		
		
	}

	//-------------------------------update method end-------------------------------------//
	
	
	
	
	
	
	
	

}
