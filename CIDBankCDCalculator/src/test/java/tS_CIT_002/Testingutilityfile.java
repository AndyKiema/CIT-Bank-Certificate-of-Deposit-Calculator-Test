package tS_CIT_002;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Testingutilityfile {
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet st;
	public static XSSFRow rw;
	public static XSSFCell cl;
	public static CellStyle style;

	public static int getRowCount(String testfilepath, String testsheet) throws IOException {
		fi= new FileInputStream(testfilepath);
		wb=new XSSFWorkbook(fi);
		st=wb.getSheet(testsheet);
		int rownum=st.getLastRowNum();
		wb.close();
		fi.close();
		return rownum;
		
	}
	
	public static String getCellData(String testfilepath, String testsheet, int rownum, int cellnum) throws IOException {
		fi=new FileInputStream(testfilepath);
		wb= new XSSFWorkbook(fi);
		st=wb.getSheet(testsheet);
		rw=st.getRow(rownum);
		cl=rw.getCell(cellnum);
		String data=cl.toString();
		wb.close();
		fi.close();
		return data;
		
	}
	
	public static void setCellData(String testfilepath, String testsheet, int rownum, int cellnum, String data) throws IOException {
		fi= new FileInputStream(testfilepath);
		wb=new XSSFWorkbook(fi);
		st=wb.getSheet(testsheet);
		rw=st.getRow(rownum);
		cl=rw.getCell(cellnum);
		cl.setCellValue(data);
		fo= new FileOutputStream(testfilepath);
		wb.write(fo);
		wb.close();
		fi.close();
	}

}
