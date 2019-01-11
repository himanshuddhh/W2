package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase.TestBase;

public class PostMessage extends TestBase{

	public PostMessage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[@class='lia-button-wrapper lia-button-wrapper-primary lia-component-primary-post-button']//a")
	WebElement starttopic_btn;
	
	@FindBy(xpath="//input[@id='lia-subject']")
	WebElement entertitletextbox;
	
	@FindBy(xpath="//body[@id='tinymce']")
	WebElement bodytextbox;
	
	@FindBy(xpath="//a[contains(text(),'magento1')]")
	WebElement magnetotag;
	
	@FindBy(xpath="//a[contains(text(),'CE 2.0')]")
	WebElement CE_2__0_tag;
	
	@FindBy(xpath="//input[@class='lia-button lia-button-primary lia-button-Submit-action']")
	WebElement post_btn;
	
	public void postMessage()
	{
		starttopic_btn.click();
		
		entertitletextbox.sendKeys("Creating orders via API without payment");
		
		bodytextbox.sendKeys("Technology grows with growing needs");
		
		magnetotag.click();
		
		CE_2__0_tag.click();
		
		post_btn.click();
		
		
		
	}//end of postMessage method
	
	
	
	

}//end of PostMessage class
