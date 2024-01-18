package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel8 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
FileInputStream myFile= new FileInputStream("G:\\All_Data\\Desktop\\practicesheet.xlsx");
Workbook myWorkbook = WorkbookFactory.create(myFile);
	Sheet mySheet= myWorkbook.getSheet("Sheet1");
	for(int i=0;i<=1;i++)
	{
		for(int j=0;j<=2;j++) {
			String value=mySheet.getRow(i).getCell(j).getStringCellValue();
			System.out.print(value+" ");
		}
		System.out.println();
	}
	}

}
