package com.project.bank.account.details.BankAccount.controller;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.bank.account.details.BankAccount.ExcelSheetGenerator.ExcelSheetBankAccount;

import com.project.bank.account.details.BankAccount.db.model.BankAccountDetails;
import com.project.bank.account.details.BankAccount.db.model.Deposits;
import com.project.bank.account.details.BankAccount.db.model.LoanDetails;
import com.project.bank.account.details.BankAccount.model.PosBankAccountDetailsRequestModel;
import com.project.bank.account.details.BankAccount.model.PosBankAccountResponseModel;
import com.project.bank.account.details.BankAccount.model.PosCustomerNomineeRequestModel;
import com.project.bank.account.details.BankAccount.model.PosCustomerNomineeResponseModel;
import com.project.bank.account.details.BankAccount.model.PosDepositsRequestModel;
import com.project.bank.account.details.BankAccount.model.PosDepositsResponseModel;
import com.project.bank.account.details.BankAccount.model.PosLoanRequestModel;
import com.project.bank.account.details.BankAccount.model.PosLoanResponseModel;
import com.project.bank.account.details.BankAccount.model.UpdateBankAccountRequestModel;
import com.project.bank.account.details.BankAccount.model.UpdateBankAccountResponseModel;
import com.project.bank.account.details.BankAccount.model.UpdateCustomerNomineeRequestModel;
import com.project.bank.account.details.BankAccount.model.UpdateCustomerNomineeResponseModel;
import com.project.bank.account.details.BankAccount.model.UpdateDepositsRequestModel;
import com.project.bank.account.details.BankAccount.model.UpdateDepositsResponseModel;
import com.project.bank.account.details.BankAccount.model.UpdateLoanRequestModel;
import com.project.bank.account.details.BankAccount.model.UpdateLoanResponseModel;
import com.project.bank.account.details.BankAccount.service.BankAccountDetailsService;
import com.project.bank.account.details.BankAccount.service.CustomerNomineeDetailsService;
import com.project.bank.account.details.BankAccount.service.DepositsService;
import com.project.bank.account.details.BankAccount.service.GetReportsService;
import com.project.bank.account.details.BankAccount.service.LoanDetailsService;

import io.swagger.annotations.ApiModel;
import pdfGenerator.PdfBankAccountReport;

@Component
@RestController
@ApiModel(description="Bank Account Application - Bank Details")
public class BankAccountController {

	@Autowired
	BankAccountDetailsService service;
	
	@Autowired
	CustomerNomineeDetailsService nomineeService;
	
	
	@Autowired
	DepositsService depositsService;
	
	@Autowired
	LoanDetailsService loanService;
	
	@Autowired
	GetReportsService getReportService;
	
	
	
	//---------------------bank details-----------------------------//
	@PostMapping(value="create/account/info",produces="application/json",consumes="application/json")
	public PosBankAccountResponseModel createBankAccountDetails(@RequestBody PosBankAccountDetailsRequestModel posBankAccountDetailsRequest) throws Exception{
		return service.createBankAccountRecord(posBankAccountDetailsRequest);
	}
	
	
	@DeleteMapping(value="delete/account/details/{accountNo}")
	public void deleteBankAccount(@PathVariable Long accountNo){
		service.deleteBankAccountDetails(accountNo);
	}
	
	@PutMapping(value="update/account/details/{accountNo}" ,produces="application/json" , consumes="application/json")
	public UpdateBankAccountResponseModel updateBankAccount(@RequestBody UpdateBankAccountRequestModel updateBankRequestBody, @PathVariable Long accountNo){
		return service.updateBankAccountDetails(updateBankRequestBody,accountNo);
	}
	
	
	//-----------customer_nominee------------------------------//
	
	
	@PostMapping(value="create/customer/nominee/details",produces="application/json",consumes="application/json")
	public PosCustomerNomineeResponseModel createCustomerNomineeAccount(@RequestBody PosCustomerNomineeRequestModel posCustomerNomineeRequest) throws Exception{
		return nomineeService.createBankAccountRecord(posCustomerNomineeRequest);
	}
	
	
	@DeleteMapping(value="delete/customer/nominee/details/{accountNo}")
	public void deleteCustomerNomineeBankAccount(@PathVariable Long accountNo){
		nomineeService.deleteCustomerNomineeDetails(accountNo);
	}
	
	
	@PutMapping(value="update/customer/nominee/details/{accountNo}" ,produces="application/json" , consumes="application/json")
	public UpdateCustomerNomineeResponseModel updateCustomerBankAccount(@RequestBody UpdateCustomerNomineeRequestModel updateCustomerNomineeRequest, @PathVariable Long accountNo){
		return nomineeService.updateCustomerNomineeDetails(updateCustomerNomineeRequest,accountNo);
	}
	
	//------------------------------------------------------------------------//
	
	

 @PostMapping(value="create/deposits/account/details",produces="application/json",consumes="application/json")
	public PosDepositsResponseModel createDepositsAccount(@RequestBody PosDepositsRequestModel posDepositsRequest) throws Exception{
		return depositsService.createDepositsAccount(posDepositsRequest);
	}
	
	
	@DeleteMapping(value="delete/deposits/account/details/{accountNo}")
	public void deleteDepositsAccount(@PathVariable Long accountNo){
		depositsService.deleteCustomerNomineeDetails(accountNo);
	}
	
	
	@PutMapping(value="update/deposits/account/details/{accountNo}" ,produces="application/json" , consumes="application/json")
	public UpdateDepositsResponseModel updateDepositsAccount(@PathVariable Long accountNo,@RequestBody UpdateDepositsRequestModel updateCustomerNomineeRequest){
		return depositsService.updateDepositsDetails(updateCustomerNomineeRequest,accountNo);
	}
	
	//-----------------------------------------------------------------//
	
	
	@PostMapping(value="create/loan/account/details",produces="application/json",consumes="application/json")
	public PosLoanResponseModel createLonDetailsAccount(@RequestBody PosLoanRequestModel posLoanRequest){
		return loanService.createLoanAccount(posLoanRequest);
	}
	
	
	@DeleteMapping(value="delete/loan/account/details/{accountNo}")
	public void deleteLoanDetailsAccount(@PathVariable Long accountNo){
		loanService.deleteLoanAccountDetails(accountNo);
	}
	
	
	@PutMapping(value="update/loan/account/details/{accountNo}" ,produces="application/json" , consumes="application/json")
	public UpdateLoanResponseModel updateLoanDetailsAccount(@PathVariable Long accountNo,@RequestBody UpdateLoanRequestModel updateLoanRequest){
		return loanService.updateLoanDetails(updateLoanRequest,accountNo);
	}
	
	//------------------------------------------------------------------------------------//
	
	
	//--------------pdf report---------------------------------------//
	
	//only for bank account//
	@GetMapping(value="/account/download/pdf" , produces=MediaType.APPLICATION_PDF_VALUE)
	public ResponseEntity<InputStreamResource> generatePdf(){
 		List<BankAccountDetails> listBank=getReportService.findBankDetails();
	        ByteArrayInputStream bis=PdfBankAccountReport.generatePdf(listBank);	
		
	        HttpHeaders headers=new HttpHeaders();
	        headers.add("Content-Disposition","inline;filename=BANK_ACCOUNT_DETAILS.pdf");
	        
		return ResponseEntity.ok().headers(headers).contentType(MediaType.APPLICATION_PDF).body(new InputStreamResource(bis));
		
	}
	
	
	@GetMapping(value="/account/details/download/excelsheet" , produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
	public ResponseEntity<InputStreamResource> downloadExcel(){
		List<BankAccountDetails> listBank=getReportService.findBankDetails();
        ByteArrayInputStream bis=ExcelSheetBankAccount.downloadExcel(listBank);
		HttpHeaders headers=new HttpHeaders();
		headers.add("Content-Disposition", "attachment; filename=Bank_Account_ExcelSheet.xlsx");
		return ResponseEntity.ok().headers(headers).body(new InputStreamResource(bis));

	}	
	
}
