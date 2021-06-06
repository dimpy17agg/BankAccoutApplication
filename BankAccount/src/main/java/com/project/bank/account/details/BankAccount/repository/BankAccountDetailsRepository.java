package com.project.bank.account.details.BankAccount.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.project.bank.account.details.BankAccount.db.model.BankAccountDetails;


@Repository
public interface BankAccountDetailsRepository extends JpaRepository<BankAccountDetails,Long>{

	BankAccountDetails findByAccountNumber(Long accNo);
	
}
