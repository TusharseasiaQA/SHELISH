import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/*
 * public class WorkingExcel {
 * 
 * public static void main(String[] args) throws Exception {
 * 
 * //System.out.println("data from excel is"+data0); FileOutputStream fos=new
 * FileOutputStream("F:\\Book1.xlsx");
 * 
 * XSSFWorkbook wb=new XSSFWorkbook(); XSSFSheet ws = wb.createSheet("Sheet1");
 * 
 * 
 * Row r; r=ws.createRow(0); r.createCell(0).setCellValue("SeasiaInfotech");
 * 
 * for(int i=1;i<=10;i++) { r=ws.createRow(i); r.createCell(0).setCellValue(i);
 * }
 * 
 * System.out.println("Inserted data sucessfully");
 * 
 * wb.write(fos); wb.close();
 * 
 * } }
 */



public class WorkingExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		FileInputStream fis=new FileInputStream("F:\\seasiaexcel\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		//String data0=ws.getRow(0).getCell(0).getStringCellValue();
		//System.out.println("data from excel is"+data0);
		
	Row r;
	r=ws.createRow(0);
	r.createCell(1).setCellValue("SeasiaInfotech");
		
		for(int i=1;i<=10;i++) {
			r=ws.createRow(i);
		r.createCell(1).setCellValue(i);
		}
		
		System.out.println("Inserted data sucessfully");
		
		
		  int rc=ws.getLastRowNum(); 
		  for(int i=1;i<rc;i++) {
		  
		  int data=(int) ws.getRow(i).getCell(1).getNumericCellValue();
		  System.out.println(data);
		  
		  }
		 
		FileOutputStream fos=new FileOutputStream("F:\\Book1.xlsx");
		wb.write(fos);
	}

}
