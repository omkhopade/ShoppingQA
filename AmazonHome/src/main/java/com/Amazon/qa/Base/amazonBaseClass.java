package com.Amazon.qa.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.Amazon.qa.CommonUtils.commonUtils;

public class amazonBaseClass {

	public static  WebDriver driver;
	public static  Properties pro;
	
	public amazonBaseClass() {
		
		pro=new Properties();
		
		try
		{
			FileInputStream file=new FileInputStream("D:\\Selenium\\Automation Testing\\AmazonHome\\src\\main\\java\\com\\Amazon\\qa\\CommonUtils\\commonProperties.properties");   
			try {
				pro.load(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void intialization()
	{
		if(pro.getProperty("browser").equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if (pro.getProperty("browser").equals("fireFox"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("Select correct Browser");
		}
		
		
		driver.manage().timeouts().pageLoadTimeout(commonUtils.pageLoadTime, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(commonUtils.implicit,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get(pro.getProperty("url"));
		
	}
	
	
	
	
}
