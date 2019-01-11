package com.testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	
	public static WebDriver driver;
	
	public static  void initialization()
	{
		System.out.println("Setting up the chrome driver----------->");
		String driverLocation = "D:/selenium_drivers/new/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverLocation);
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(200, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
	
	}
	
	
	
	
	
	

}
