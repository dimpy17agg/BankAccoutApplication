package com.project.bank.transactions.details.Transactions.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.bank.transactions.details.Transactions.db.model.Deposits;

@Repository
public interface DepositRepository extends JpaRepository<Deposits,Long>{

	Deposits findByAccountNumber(Long accountNumber);
	
}
