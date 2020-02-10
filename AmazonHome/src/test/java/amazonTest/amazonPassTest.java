package amazonTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Amazon.qa.Base.amazonBaseClass;
import com.Amazon.qa.CommonUtils.commonUtils;
import com.Amazon.qa.Pages.LoginPage;
import com.Amazon.qa.Pages.amazonHomepage;
import com.Amazon.qa.Pages.loginpass;

public class amazonPassTest extends amazonBaseClass{
	
	loginpass lop;
	commonUtils cm;
	amazonEmailTest at;
	
	public amazonPassTest() 
	{
		super();
		
	}
		
	@BeforeMethod
	public void setUp()
	{
		//intialization();
		lop=new loginpass();
		cm =new commonUtils();
		at=new amazonEmailTest();	
	}

	@Test
	public void enterpasstest() throws InterruptedException
	{
		at.emailAddress();
		cm.smallWait();
		lop.enterpass(pro.getProperty("pass"));
		lop.login();
	}

	
	@AfterMethod
	public void tearoff() throws InterruptedException
	{
		cm.mediumWait();
		driver.close();
	}
}
