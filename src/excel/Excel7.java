package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel7 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream myFile=new FileInputStream("G:\\All_Data\\Desktop\\practicesheet.xlsx");
		
		Workbook myWorkbook = WorkbookFactory.create(myFile);
		Sheet mySheet = myWorkbook.getSheet("page1");
	int lastrownum= mySheet.getLastRowNum();
	int totalnumofrows= lastrownum;
	short lastcellnum= mySheet.getRow(0).getLastCellNum();
	int totalnumofcell=lastcellnum-1;
	for(int i=0;i<=totalnumofrows;i++) {
		for(int j=0;j<=totalnumofcell;j++) {
		CellType myCellDataType= mySheet.getRow(i).getCell(j).getCellType();
		if(myCellDataType==CellType.STRING)
		{
			String value=mySheet.getRow(i).getCell(j).getStringCellValue();
			System.out.print(value+"    ");
			
		}
		else if(myCellDataType==CellType.BOOLEAN)
		{
			boolean value= mySheet.getRow(i).getCell(j).getBooleanCellValue();
			System.out.print(value+"    ");
		}
		else if(myCellDataType==CellType.NUMERIC) {
			double value= mySheet.getRow(i).getCell(j).getNumericCellValue();
			System.out.print(value+"   ");
		}
		}
		System.out.println();
	}
	
	
	}

}
