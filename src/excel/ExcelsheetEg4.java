package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelsheetEg4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream myfile= new FileInputStream("G:\\All_Data\\Desktop\\practicesheet.xlsx");
	Workbook myworkbook= WorkbookFactory.create(myfile);
	 Sheet mysheet =myworkbook.getSheet("page1");
	 
	 for(int i=0;i<=5;i++)
	 {
	 
	 for(int j=0;j<=2;j++)
	 {
	 String value =
	 mysheet.getRow(i).getCell(j).getStringCellValue();
	 System.out.print(value+"  ");
	 }
	 System.out.println();
	 }
	 
	
	
	
	}

}
