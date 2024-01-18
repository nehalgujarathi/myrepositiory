package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exceleg2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
FileInputStream myfile = new FileInputStream("G:\\All_Data\\Desktop\\practicesheet.xlsx");
	Workbook myworkbook = WorkbookFactory.create(myfile);
	  Sheet mysheet=myworkbook.getSheet("page1");
	 Row myrow=mysheet.getRow(4);
	Cell mycell = myrow.getCell(1);
	CellType myDataType=mycell.getCellType();
	System.out.println(myDataType);
	
	}

}
