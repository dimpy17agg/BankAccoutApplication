package pdfGenerator;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.stereotype.Component;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.project.bank.account.details.BankAccount.db.model.BankAccountDetails;
import com.project.bank.account.details.BankAccount.db.model.LoanDetails;


public class PdfBankAccountReport {

	public static ByteArrayInputStream generatePdf(List<BankAccountDetails> listBank) {

		
		Document document=new Document();
		ByteArrayOutputStream out=new ByteArrayOutputStream();
		int n=1;
		try{
			PdfWriter.getInstance(document, out);
			document.open();
			Font font=FontFactory.getFont(FontFactory.COURIER,14,BaseColor.BLACK);
			  Paragraph para=new Paragraph("Bank Account Details",font);
			  para.setAlignment(Element.ALIGN_CENTER);
			  document.add(para);
			  document.add(Chunk.NEWLINE);
			  document.add(Chunk.NEWLINE);
			  
			  PdfPTable table=new PdfPTable(4);
			  
			  Stream.of("SNo.","AcountId","AccountNumber","Amount").forEach(headerTitle->{
					PdfPCell header=new PdfPCell();  
		              Font headFont=FontFactory.getFont(FontFactory.HELVETICA_BOLD);
		              header.setBackgroundColor(BaseColor.LIGHT_GRAY);
		              header.setHorizontalAlignment(Element.ALIGN_CENTER);
		              header.setBorderWidth(2);
		              header.setMinimumHeight(8f);
		              header.setPhrase(new Phrase(headerTitle,headFont));
		              table.addCell(header);
				  });
			  
			  for(BankAccountDetails bankTable:listBank){
				  
				  PdfPCell snoCell=new PdfPCell(new Phrase(String.valueOf(n)));
				  snoCell.setPaddingLeft(4);
				  snoCell.setVerticalAlignment(Element.ALIGN_MIDDLE);
			       snoCell.setHorizontalAlignment(Element.ALIGN_CENTER);
			      table.addCell(snoCell);
				  n++;
				  
				  
				  PdfPCell idCell=new PdfPCell(new Phrase("AccountId_"+String.valueOf(bankTable.getAccountId())));
				  idCell.setPaddingLeft(4);
				  idCell.setVerticalAlignment(Element.ALIGN_MIDDLE);
			       idCell.setHorizontalAlignment(Element.ALIGN_CENTER);
			      table.addCell(idCell);
				  
			      
			      PdfPCell accNoCell=new PdfPCell(new Phrase(String.valueOf(bankTable.getAccountNumber())));
				  accNoCell.setPaddingLeft(4);
				  accNoCell.setVerticalAlignment(Element.ALIGN_MIDDLE);
			       accNoCell.setHorizontalAlignment(Element.ALIGN_CENTER);
			      table.addCell(accNoCell);
				  
			      PdfPCell amtCell=new PdfPCell(new Phrase(String.valueOf(bankTable.getAccountBalance())));
				  amtCell.setPaddingLeft(4);
				  amtCell.setVerticalAlignment(Element.ALIGN_MIDDLE);
			       amtCell.setHorizontalAlignment(Element.ALIGN_CENTER);
			      table.addCell(amtCell);		  
			  }
			  document.add(table);
			  document.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		return new ByteArrayInputStream(out.toByteArray());
	}


}
