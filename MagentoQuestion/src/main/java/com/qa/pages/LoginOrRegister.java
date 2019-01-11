package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase.TestBase;

public class LoginOrRegister  extends TestBase{

	public LoginOrRegister() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//a[contains(@href,'https://account.magento.com/customer/account/login')]")
	WebElement clickOnLoginOrRegister;

	public LoginPage loginorRegister() throws IOException, InterruptedException
	{
		
		clickOnLoginOrRegister.click();
		Thread.sleep(2000);
		System.out.println("Successfully entered into LoginORRegister Page");
		 
		return new LoginPage();
		
	}//end of method
	
	
	
	
}//end of LoginOrRegister Page
