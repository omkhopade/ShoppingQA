package com.Amazon.qa.CommonUtils;

public class commonUtils {
	
	public static final long pageLoadTime=40;
	public static final long implicit=20;
	
	
	
	public void smallWait() throws InterruptedException
	{
		Thread.sleep(3000);
	}
	
	public void mediumWait() throws InterruptedException
	{
		Thread.sleep(6000);
	}
	
	public void largeWait() throws InterruptedException
	{
		Thread.sleep(10000);
	}

}
