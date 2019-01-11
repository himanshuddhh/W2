package com.TestBase;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	public static   void initialization()
	{
	
		// System.setProperty("webdriver.chrome.driver", "D:/selenium_drivers/new/chromedriver.exe");
		Logger log = Logger.getLogger("LoginTest");

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
			  
		 log.debug("opening webiste");

		
		driver.manage().window().maximize();
		
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(200, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
		
		
		
	}
	public static HashMap<String, String> readexcel(String workbook,String sheetname,String columnname,String condition) throws FilloException
	{
		 HashMap<String, String> myMap=new HashMap<String, String>();
		 Fillo fillo=new Fillo();
	     Connection conn=	 fillo.getConnection(workbook);
		 String query = "Select * from " + sheetname + " where " + columnname+ "='" + condition+ "'";
			
			com.codoid.products.fillo.Recordset rs=conn.executeQuery(query);
			List  <String> columnnames=rs.getFieldNames();
			while(rs.next())
			{
				
				for(String col: columnnames)
				{
				
				myMap.put(col,rs.getField(col));
				}
			}
			rs.close();
			conn.close();
			return myMap;
	
	}
}
