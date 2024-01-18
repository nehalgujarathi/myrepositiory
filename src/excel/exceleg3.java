package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class exceleg3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
FileInputStream myfile= new FileInputStream("G:\\All_Data\\Desktop\\practicesheet.xlsx");
		Workbook myworkbook= WorkbookFactory.create(myfile);
		 Sheet mysheet=myworkbook.getSheet("page1");
		 //whole row
		 System.out.println("row value is");
		 for(int i=0;i<=2;i++) {
		String value= mysheet.getRow(0).getCell(i).getStringCellValue();
		System.out.println(value);
		 }
		 System.out.println("========");
		 // whole column
		 System.out.println("column value is");
		 for(int i=0;i<=5;i++) {
			 String value= mysheet.getRow(i).getCell(0).getStringCellValue();
			 System.out.println(value);
		 }
	}

}
