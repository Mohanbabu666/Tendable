package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MarketingPage {
	
	WebDriver driver;
	
	public MarketingPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="//div[@class='w-full md:mx-auto md:w-1/3 px-2.5 md:px-5 xl:px-10 flex flex-wrap js-show-on-scroll self-stretch'][1]/descendant::button[text()='Contact']")
	WebElement contactButton;

	public void clickOnMarketingContact()
	{
		contactButton.click();
	}
}
