package com.tqa.qa.testcase;

import java.util.Set;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tqa.qa.base.TestBase;
import com.tqa.qa.pages.HomePage;
import com.tqa.qa.pages.loginPage;

public class HomePageTest extends TestBase{
	loginPage loginPage;
	HomePage homePage;
	
	public HomePageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		intialization();
		loginPage = new loginPage();
		homePage = new HomePage();
	}
	
	
	@Test
	public void switchTowindow() throws InterruptedException {
		homePage=loginPage.btnClick();
		Set<String> allWindowHandles = driver.getWindowHandles();
		 
		 for(String handle : allWindowHandles)
		 {
			 if(!handle.equals(LoginPageTest.parentWinHandle)){
		            driver.switchTo().window(handle);
		             System.out.println("string first window " +handle);
		            Thread.sleep(1000);
		            System.out.println("Title of the new window: " +
		            driver.getTitle());
		            homePage.search("Selectmenu");
		    		homePage.btnClick();
		    }
		}
	}
	
	
	
	@AfterMethod
	public void tearDown(){
		//driver.quit();
	}
	

}
