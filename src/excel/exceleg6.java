package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class exceleg6 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream myFile=new FileInputStream("G:\\All_Data\\Desktop\\practicesheet.xlsx");
				
				Workbook myWorkbook = WorkbookFactory.create(myFile);
				Sheet mySheet = myWorkbook.getSheet("page1");
				int lastrownum=mySheet.getLastRowNum();
				int totalNumOfRows=lastrownum;
				short lastCellNum=mySheet.getRow(0).getLastCellNum();
				int totalNumOfCells=lastCellNum-1;
				for(int i=0;i<=totalNumOfRows;i++) {
					for(int j=0;j<=totalNumOfCells;j++) {
						String value=mySheet.getRow(i).getCell(j).getStringCellValue();
						System.out.print(value+"");
					}
					System.out.println();
				}

	}

}
