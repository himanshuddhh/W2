package com.mainClass;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;
import com.common.CommonClass;
import com.testbase.TestBase;

public class MainClass extends TestBase{

	public static void main(String[] args) throws FilloException {
		
		
		CommonClass commonClass=new CommonClass();
		initialization();
		Fillo fillo=new Fillo();
		Connection connection=fillo.getConnection("C:/Users/himanshu.dixit/w2/MyFramework/datasheet1.xlsx");
		
		String query="select * from Sheet1";
		Recordset recordset=connection.executeQuery(query);
		while (recordset.next()) {
			
			String methodName=recordset.getField("Names");
			switch (methodName) {
			
			case "launchURL":
				commonClass.launchURL(recordset.getField("url"));
				break;
				
			
			case "enterText":
				commonClass.enterText(methodName, recordset.getField("Type"), recordset.getField("Value"), recordset.getField("Parameter"));
				
				break;
				
				
			case "click":
				commonClass.clickButton(methodName, recordset.getField("Type"), recordset.getField("Value"));
				
				break;
				
			case "":
				System.exit(0);

			default:
				System.out.println("MethodName not found");
				break;
			}
			
			
		}
		
		
	}
	
	
	
}
