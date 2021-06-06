package com.project.bank.account.details.BankAccount.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.bank.account.details.BankAccount.db.model.Deposits;

@Repository
public interface DepositsRepository extends JpaRepository<Deposits,Long> {
	
	Deposits findByDepositAccountNumber(long accNo);

}
