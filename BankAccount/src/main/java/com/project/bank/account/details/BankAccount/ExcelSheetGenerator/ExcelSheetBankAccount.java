package com.project.bank.account.details.BankAccount.ExcelSheetGenerator;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.project.bank.account.details.BankAccount.db.model.BankAccountDetails;

public class ExcelSheetBankAccount {

	public static ByteArrayInputStream downloadExcel(List<BankAccountDetails> listBank) {

		
		String[] columns={"SNO.","Account Id","Account Number","Account Balance"};
	   ByteArrayOutputStream out=new ByteArrayOutputStream();
		XSSFWorkbook workbook=new XSSFWorkbook();
	  try{
		  
		  CreationHelper creationHelper=workbook.getCreationHelper();
		  Sheet sheet=workbook.createSheet("Bank Account Details ExcelSheet");
		  Font headerFont=workbook.createFont();
		  headerFont.setBold(true);
		  headerFont.setColor(IndexedColors.BLUE.getIndex());	    	
	    	CellStyle headerCellStyle=workbook.createCellStyle();
	    	headerCellStyle.setFont(headerFont);	
	    	
	    	Row headerRow=sheet.createRow(0);
	    	
	    	for(int i=0;i<columns.length;i++){		
	    		Cell cell=headerRow.createCell(i);
	    		cell.setCellValue(columns[i]);
	    		cell.setCellStyle(headerCellStyle);
	    	}
	    	int rowIndex=1,sno=1;
	    	for(BankAccountDetails bankTable: listBank){
	    		Row row=sheet.createRow(rowIndex++);
	    		row.createCell(0).setCellValue(sno++);
	    		row.createCell(1).setCellValue("AccountId"+String.valueOf(bankTable.getAccountId()));
	    		row.createCell(2).setCellValue(String.valueOf(bankTable.getAccountNumber()));
	    		row.createCell(3).setCellValue(String.valueOf(bankTable.getAccountBalance()));
	    	}	
	    	workbook.write(out);	
	  }
		catch(Exception e){
			System.out.println(e);
		}
		return new ByteArrayInputStream(out.toByteArray());
	}
}
