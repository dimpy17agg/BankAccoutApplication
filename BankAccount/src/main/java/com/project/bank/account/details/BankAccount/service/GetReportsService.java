package com.project.bank.account.details.BankAccount.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bank.account.details.BankAccount.db.model.BankAccountDetails;

import com.project.bank.account.details.BankAccount.repository.BankAccountDetailsRepository;

@Service
public class GetReportsService {

	@Autowired
	private BankAccountDetailsRepository bankAccountRepo;
	
	
	
	public List<BankAccountDetails> findBankDetails(){
          List<BankAccountDetails> list=bankAccountRepo.findAll();
	  return list;
	}

	
	
	
}
