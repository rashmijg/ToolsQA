package com.tqa.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tqa.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//input[@placeholder='Search …']")
	private WebElement txtsearch;
	
	@FindBy(xpath="//input[@class='search-submit']")
	private WebElement btnSearch;
	
	
	public HomePage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void search(String text)
	{
		txtsearch.sendKeys(text);
	}
	
	public void btnClick()
	{
		btnSearch.click();
	}
	

}
