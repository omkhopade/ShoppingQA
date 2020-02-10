package com.Amazon.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Amazon.qa.Base.amazonBaseClass;

public class LoginPage  extends amazonBaseClass{
	
	@FindBy(id="ap_email")
	WebElement email;
	
	@FindBy(id="continue")
	WebElement cont;
	
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterEmail(String emails)
	{
		email.sendKeys(emails);
		
	}
	
	public loginpass conti()
	{
		cont.click();
		return new loginpass();
				
	}
	
	

}
