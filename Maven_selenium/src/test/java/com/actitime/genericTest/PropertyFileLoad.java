package com.actitime.genericTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PropertyFileLoad {
	
	public String getPropertyMethod(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/actitime.property");
		Properties p=new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		System.out.println(value);
		return value;
	}
	public String getExcelFile(String sheet,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/actitimeLog.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		System.out.println(data);
		return data;
	}
	
}
