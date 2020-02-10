package amazonTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Amazon.qa.Base.amazonBaseClass;
import com.Amazon.qa.CommonUtils.commonUtils;
import com.Amazon.qa.Pages.LoginPage;
import com.Amazon.qa.Pages.amazonHomepage;

public class amazonEmailTest extends amazonBaseClass {
	
	LoginPage lp;
	commonUtils cm;
	amazonHomepage hm;
	
	public amazonEmailTest()
	{
		super();
		
	}

	@BeforeTest
	public void setUp()
	{
		intialization();
		lp=new LoginPage();
		cm=new commonUtils();
		hm=new amazonHomepage();
			
	} 
	
	@Test
	public void emailAddress() throws InterruptedException
	{
		hm.signpage();
		cm.smallWait();
		lp.enterEmail(pro.getProperty("email"));
			
	}
	
	@AfterMethod
	public void tearOff() throws InterruptedException
	{
	cm.mediumWait();
	lp.conti();	
	}
}
