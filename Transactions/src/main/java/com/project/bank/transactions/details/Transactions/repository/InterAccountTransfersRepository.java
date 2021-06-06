package com.project.bank.transactions.details.Transactions.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.bank.transactions.details.Transactions.db.model.Deposits;
import com.project.bank.transactions.details.Transactions.db.model.InterAccountTransfers;

@Repository
public interface InterAccountTransfersRepository  extends JpaRepository<InterAccountTransfers,Long> {

	
	public InterAccountTransfers findByAccountNumberFrom(Long accountNoFrom);
	public InterAccountTransfers findByAccountNumberTo(Long accountNoTo);
	
}
