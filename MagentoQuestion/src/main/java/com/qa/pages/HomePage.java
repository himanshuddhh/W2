package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase.TestBase;

public class HomePage extends TestBase{

	public HomePage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}//end of constructor

	
	@FindBy(xpath="//a[contains(text(),'Community')]//ancestor::div[@class='more-item']//a[contains(text(),'Manage')]")
	WebElement manageCommunityLink;
	@FindBy(xpath="//button[@class='lia-slide-menu-trigger lia-slide-out-nav-menu-wrapper']")
	WebElement menuButton;
	@FindBy(xpath="//span[contains(text(),'Core Technology - Magento 2')]//ancestor::li")
	WebElement core_Technology_Magento_2_link;
	@FindBy(xpath="//li[@class='lia-type-forum lia-nav-magento-2-theming lia-nav-item']/a")
	WebElement magento_2_theming_Ques_link;
	
	public PostMessage manageHomepage() throws InterruptedException, IOException
	{
		
		manageCommunityLink.click();
		Thread.sleep(2000);
		menuButton.click();
		Thread.sleep(2000);
		core_Technology_Magento_2_link.click();
		Thread.sleep(2000);
		magento_2_theming_Ques_link.click();
		Thread.sleep(2000);
		
		return new PostMessage();
	}//end of method
	
	
	
}//end of HomePage class
