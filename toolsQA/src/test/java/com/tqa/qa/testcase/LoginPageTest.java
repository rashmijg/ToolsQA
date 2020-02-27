package com.tqa.qa.testcase;


import java.util.Set;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tqa.qa.base.TestBase;
import com.tqa.qa.pages.HomePage;
import com.tqa.qa.pages.loginPage;

public class LoginPageTest extends TestBase{
	loginPage loginPage;
	HomePage homePage;
	 static String parentWinHandle;
	
	
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		intialization();
		loginPage = new loginPage();
	}
	
	@Test(priority=1)
	public void login()
	{   
		parentWinHandle = driver.getWindowHandle();
        System.out.println("string second window " +parentWinHandle);
		loginPage.firstname("hello");
		loginPage.lastname("hi");
		loginPage.Country("india");
		loginPage.subject("k");

		
	}
	/*@Test(priority=2)
	public void switchTowindow() throws InterruptedException {
		homePage=loginPage.btnClick();
		Set<String> allWindowHandles = driver.getWindowHandles();
		 
		 for(String handle : allWindowHandles)
		 {
			 if(!handle.equals(parentWinHandle)){
		            driver.switchTo().window(handle);
		             System.out.println("string first window " +handle);
		            Thread.sleep(1000);
		            System.out.println("Title of the new window: " +
		            driver.getTitle());
		            homePage.search("helo");
		    		homePage.btnClick();
		    }
		}
	}*/
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	

}
