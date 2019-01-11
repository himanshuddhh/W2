package com.common;

import java.awt.dnd.DragGestureEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;
import com.testbase.TestBase;

public class CommonClass extends TestBase{
	
	public By locatorValue(String type,String value){
		
		switch (type) {
		case "id":
			return By.id(value);
			
		case "name":
			return By.name(value);
			
		case "xpath":
			return By.xpath(value);
			
		case "":System.exit(0);
			
		default:
			return By.xpath(value);
		}
	
	}
	
	public void  enterText(String name,String type,String value,String parameter){
		
		
		By locator=locatorValue(type, value);
		
		driver.findElement(locator).sendKeys(parameter);
		
	}
	
	public void clickButton(String name,String type,String value){
		
		By locator=locatorValue(type, value);
		
		driver.findElement(locator).click();
		
		
	}
	
	public void launchURL(String url){
		
		driver.get(url);
		
	}
	
	
	
	

}
