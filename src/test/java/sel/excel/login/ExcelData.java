package sel.excel.login;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {
XSSFWorkbook wb;
XSSFSheet sheet;
public ExcelData(String excelPath) throws Exception{
	File src=new File(excelPath);
	FileInputStream fis=new FileInputStream(src);
	wb=new XSSFWorkbook(fis);
	
}

public String getData(int sheetnumber,int row,int column){
	sheet=wb.getSheetAt(sheetnumber);
	String data=sheet.getRow(row).getCell(column).getStringCellValue();
	return data;
}
public int getRowCount(int byIndex){
	int row=wb.getSheetAt(byIndex).getLastRowNum();
	return row;
}
}
