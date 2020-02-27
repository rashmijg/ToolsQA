package com.tqa.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tqa.qa.base.TestBase;

public class loginPage extends TestBase {
	
	
	@FindBy(xpath="//*[@id=\"content\"]/div[2]/div/form/input[1]")
	private WebElement txtFirstName;
	
	@FindBy(id="lname")
    private WebElement txtLastName;
	
	@FindBy(name="country")
	private WebElement txtCountry;
	
	@FindBy(id="subject")
	private WebElement txtsubject;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[2]/div/form/input[4]")
	private WebElement btnSubmit;
	
	
   public loginPage()
   {
	   PageFactory.initElements(driver,this);
   }
   
   public void firstname(String firstname)
   {
	   txtFirstName.sendKeys(firstname);
   }
   public void lastname(String lastname)
   {
	   txtLastName.sendKeys(lastname);
   }
   public void Country(String Country)
   {
	   txtCountry.sendKeys(Country);
   }
   public void subject(String Subject)
   {
	   txtsubject.sendKeys(Subject);  
   }
   public HomePage btnClick()
   {
	   btnSubmit.click();
	   return new HomePage();
   }
   
   
	
	
	
	
	
}

