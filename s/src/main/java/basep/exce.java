package basep;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exce {

				public static FileInputStream fis;
				public static XSSFWorkbook wb;
				public static XSSFSheet sheet;
				public static XSSFRow row;
				public static XSSFCell cell;


				public static void main(String[] args) throws IOException 
				{
			        // To get value of specfic row and column from excel sheet
					String Value=getCellData(0,0);
					System.out.println("Value in excel file is "+Value);

				}


				public static String getCellData(int rownum,int colnum) throws IOException
				{
					// For Reading Data from excel file
					fis=new FileInputStream("C:\\filess\\Exc.xlsx");
					wb=new XSSFWorkbook(fis);
					sheet=wb.getSheet("Demo"); //Demo is the name of sheet in excel file
					row=sheet.getRow(rownum);
					cell=row.getCell(colnum);
					cell.getStringCellValue();
					fis.close();
					return cell.getStringCellValue();

				}

			}