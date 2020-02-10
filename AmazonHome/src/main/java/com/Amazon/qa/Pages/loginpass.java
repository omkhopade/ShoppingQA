package com.Amazon.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Amazon.qa.Base.amazonBaseClass;

public class loginpass  extends amazonBaseClass{

	@FindBy(id="ap_password")
	WebElement pass;
	
	@FindBy(id="signInSubmit")
	WebElement login;
	
	
	public loginpass()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterpass(String enterpass)
	{
		pass.sendKeys(enterpass);
	}
	
	public Homepage login()
	{
		login.click();
		return new Homepage();
	}
}
