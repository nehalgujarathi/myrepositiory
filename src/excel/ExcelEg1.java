package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelEg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
		// TODO Auto-generated method stub
		FileInputStream myFile= new FileInputStream("F:\\practicesheet.xlsx");
		 String value=WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
	System.out.println("value from excel is " +value);
	
	}

}
