package com.project.bank.transactions.details.Transactions.FeignProxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@FeignClient(name="BankAccount-service",url="localhost:8200")
@Component
public interface FeignTransactionProxy {

	@PutMapping(value="update/deposits/account/details/{accountNo}" ,produces="application/json" , consumes="application/json")
	public UpdateDepositsResponseModel updateDepositsAccount( @PathVariable(value ="accountNo") Long accountNo ,@RequestBody UpdateDepositsRequestModel updateDepositsRequest);
	
	
	@PutMapping(value="update/loan/account/details/{accountNo}" ,produces="application/json" , consumes="application/json")
	public UpdateLoanResponseModel updateLoanDetailsAccount(@PathVariable(value="accountNo") Long accountNo,@RequestBody UpdateLoanRequestModel updateLoanRequest);
	
	
	@PutMapping(value="update/account/details/{accountNo}" ,produces="application/json" , consumes="application/json")
	public UpdateBankAccountResponseModel updateBankAccount(@PathVariable(value="accountNo") Long accountNo,@RequestBody UpdateBankAccountRequestModel updateBankRequestBody);
	
	
}
