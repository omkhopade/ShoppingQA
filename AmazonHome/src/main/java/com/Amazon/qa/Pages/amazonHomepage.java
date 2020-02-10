package com.Amazon.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Amazon.qa.Base.amazonBaseClass;

public class amazonHomepage extends amazonBaseClass {
	
	
	
	@FindBy(id="nav-link-accountList")
	WebElement signin;
	
	
	public amazonHomepage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public LoginPage signpage()
	{
		signin.click();
	return new LoginPage();
		
	}
	

}
