package com.project.bank.account.details.BankAccount.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.bank.account.details.BankAccount.db.model.LoanDetails;

@Repository
public interface LoanDetailsRepository extends JpaRepository<LoanDetails,Long> {

	public LoanDetails findByLoanAccountNumber(Long accountNo);
	
}
