package com.project.bank.transactions.details.Transactions.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.bank.transactions.details.Transactions.db.model.Withdrawls;

@Repository
public interface WithdrawlsRepository  extends JpaRepository<Withdrawls,Long>{

	
	public Withdrawls findByAccountNumber(Long accountNumber);
}
