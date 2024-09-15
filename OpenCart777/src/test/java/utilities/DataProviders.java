package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	
	@DataProvider(name="LoginData")
	public String [][] getData() throws IOException
	{
		String path="C:\\Auto2\\MyWorkplace\\ChetanAutomation\\OpenCart777\\testData\\OpenCartLoginData.xlsx";//taking xl file from testdata
		
		ExcelUtility xlutil=new ExcelUtility(path);//create object of xlutility
		
		int totalrows=xlutil.getRowCount("Sheet1");
		int totalcols=xlutil.getCellCount("Sheet1", 1);
		
		String logindata[][]=new String[totalrows][totalcols];//created two dimension array which can store 
		
		for(int i=1;i<=totalrows;i++)  //  1  //read data from xl storing in two dimensional array
		{
			for(int j=0;j<totalcols;j++)  //0 1 row j is col
			{
				logindata[i-1][j]=xlutil.getCellData("Sheet1", i, j);  //1,0
			}
		}
		
		return logindata;  //returing two dimension array
		
		
	}

}
