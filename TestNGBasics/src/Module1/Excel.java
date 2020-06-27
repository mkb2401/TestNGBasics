package Module1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String file="C:\\Users\\total solutions\\Documents\\TestData.xlsx";
		XSSFWorkbook myworkbook=new XSSFWorkbook(file);
		XSSFSheet mysheet=myworkbook.getSheet("Sheet1");
		int totalrows=mysheet.getLastRowNum();
		System.out.println(totalrows);
		XSSFRow firstrow=mysheet.getRow(0);
		short totalcolumns=firstrow.getLastCellNum();
		System.out.println(totalcolumns);

		for(int i=1;i<=totalrows;i++)
		{

			XSSFRow myrow=mysheet.getRow(i);

			for(int j=0;j<totalcolumns;j++)
			{
				XSSFCell mycell=myrow.getCell(j);
				if(mycell!=null)
				{
					if(mycell.getStringCellValue().equals("Mandeep"))
						System.out.print("Mandeep found at row number: "+myrow.getRowNum()+" and column "+mycell.getColumnIndex()+1);
				}
			}


		}
	}
}