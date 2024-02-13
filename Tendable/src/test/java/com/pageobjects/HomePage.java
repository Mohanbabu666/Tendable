package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;

	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css="img[src='https://www.tendable.com/assets/img/tendable_logo.svg']")
	WebElement homeLink;

	@FindBy(linkText="Our Story")
	WebElement ourStoryLink;

	@FindBy(linkText="Our Solution")
	WebElement ourSolutionLink;

	@FindBy(linkText="Why Tendable?")
	WebElement whyTendableLink;

	@FindBy(linkText="Request A Demo")
	WebElement requestADemoLink;
	
	public void clickHomeLink()
	{
		homeLink.click();;
	}

	public void clickOurStoryLink()
	{
		ourStoryLink.click();;
	}

	public void clickOurSolutionLink()
	{
		ourSolutionLink.click();;
	}
	
	public void clickWhyTendableLink()
	{
		whyTendableLink.click();;
	}
	
	public boolean requestADemoLinkIsDisplayed()
	{
		return requestADemoLink.isDisplayed();
	}
	
}
