package com.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MainClass {
	
	public static void main(String[] args) {
	//	DesiredCapabilities capabilities=new DesiredCapabilities();
			
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.infogain.com");
		
		
		
		
	}
}
