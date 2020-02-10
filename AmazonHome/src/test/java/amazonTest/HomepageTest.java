package amazonTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Amazon.qa.Base.amazonBaseClass;
import com.Amazon.qa.CommonUtils.commonUtils;
import com.Amazon.qa.Pages.LoginPage;
import com.Amazon.qa.Pages.amazonHomepage;

public class HomepageTest extends amazonBaseClass{
	
	amazonHomepage hp;
	commonUtils cm;
	LoginPage lp;
	
	
	
	public HomepageTest()
	{
		super();
	}
	
	
	@BeforeMethod
	public void setUp()
	{
		intialization();
		hp=new amazonHomepage();
		cm=new commonUtils();
		lp = new LoginPage();	
	}
	
	
	@Test
	public void signinclicktest() throws InterruptedException
	{
		cm.smallWait();
		lp=hp.signpage(); 
	}
	
	@AfterMethod
	public void tearoff() throws InterruptedException
	{
		cm.largeWait();
		driver.close();
	}

}
