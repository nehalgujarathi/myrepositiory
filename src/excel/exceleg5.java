package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class exceleg5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream myfile= new FileInputStream("G:\\All_Data\\Desktop\\practicesheet.xlsx");
		Workbook myworkbook= WorkbookFactory.create(myfile);
		 Sheet mysheet=myworkbook.getSheet("page1");
		 int totalNumberOfRows= mysheet.getLastRowNum();
		 System.out.println(totalNumberOfRows);
		 System.out.println("============");
		 short totalnumberofcells = mysheet.getRow(totalNumberOfRows).getLastCellNum();
		 System.out.println( totalnumberofcells);
	}

}
