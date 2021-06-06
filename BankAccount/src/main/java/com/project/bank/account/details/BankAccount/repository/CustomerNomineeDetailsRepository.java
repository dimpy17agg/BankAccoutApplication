package com.project.bank.account.details.BankAccount.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.bank.account.details.BankAccount.db.model.CustomerNomineeDetails;

@Repository
public interface CustomerNomineeDetailsRepository extends JpaRepository<CustomerNomineeDetails,Long> {

	
}
