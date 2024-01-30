package qspassihnment;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDTExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\Nitin\\Desktop\\actitimeLog.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		String data=wb.getSheet("CreateCustomer").getRow(0).getCell(2).getStringCellValue();
		System.out.println(data);
	}
}
