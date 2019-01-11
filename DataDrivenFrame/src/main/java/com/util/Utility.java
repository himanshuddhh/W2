package com.util;

import org.openqa.selenium.By;

import com.TestBase.TestBase;

public class Utility extends TestBase {
	
	public void entertext(String xpath,String text)
	{
		driver.findElement(By.xpath(xpath)).sendKeys(text);
	}
	public void clickbutton(String xpath)
	{
		driver.findElement(By.xpath(xpath)).click();
	}

	
}
