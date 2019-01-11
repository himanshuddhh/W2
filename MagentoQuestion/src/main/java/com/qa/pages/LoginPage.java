package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase.TestBase;

public class LoginPage extends TestBase {

	public LoginPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id='email']")
	WebElement email;
	
	@FindBy(xpath="//*[@id='pass']")
	WebElement password;
	
	@FindBy(xpath="//*[@id='send2']")
	WebElement loginButton;
	
	public HomePage login(String email1,String password1) throws IOException, InterruptedException
	{
		
		email.sendKeys(email1);
		Thread.sleep(2000);
		password.sendKeys(password1);
		Thread.sleep(2000);
		loginButton.click();
		Thread.sleep(2000);
		return new HomePage();
		
	}//end of method login
	
	
	
	
	
}//end of class LoginPage
