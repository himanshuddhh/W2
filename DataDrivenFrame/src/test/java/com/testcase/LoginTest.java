package com.testcase;

import java.util.HashMap;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.TestBase.TestBase;
import com.codoid.products.exception.FilloException;
import com.util.Utility;

public class LoginTest extends TestBase {

	HashMap<String, String> map;
	 Utility ul;
	@BeforeMethod
	public void setup()
	{
		initialization();
		ul=new Utility();
	}
	@Test
	public void login() throws FilloException
	{
		//Getting Url
		

            map=readexcel("C:/Users/himanshu.dixit/w2/DataDrivenFrame/data.xlsx", "data", "Name", "url");
			driver.get(map.get("url"));
	   //Enter Username	
			 map=readexcel("C:/Users/himanshu.dixit/w2/DataDrivenFrame/data.xlsx", "data", "Name", "username");
			String usname=map.get("Text");
			String xpath=map.get("Xpath");
			ul.entertext( xpath,usname);
			
			//click on continue button
			 map=readexcel("C:/Users/himanshu.dixit/w2/DataDrivenFrame/data.xlsx", "data", "Name", "continue");
			
				String continue_btn=map.get("Xpath");
				ul.clickbutton(continue_btn);
			 
			 
			 //Enter Password
			 map=readexcel("C:/Users/himanshu.dixit/w2/DataDrivenFrame/data.xlsx", "data", "Name", "password");
			String passw= map.get("Text");
			String path=map.get("Xpath");
			ul.entertext(path, passw);
			
			//Click on Login Button
			map=readexcel("C:/Users/himanshu.dixit/w2/DataDrivenFrame/data.xlsx", "data", "Name", "login");
			ul.clickbutton(map.get("Xpath"));
			
			
			
			
			
		
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
