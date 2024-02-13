package com.pageobjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactUsPage {
	
	WebDriver driver;
	
	public ContactUsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@class='body-button bg-aqua-600 mb-6']")
	WebElement contactUsLink;
	
	public void clickOnContactUsLink()
	{	
		JavascriptExecutor jsp=((JavascriptExecutor)driver);
		jsp.executeScript("window.scrollBy(0,5000)");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(contactUsLink));
		
		Actions actions = new Actions(driver); 
		actions.moveToElement(contactUsLink).click().build().perform();
		
		//JavascriptExecutor jsp=((JavascriptExecutor)driver);
		//jsp.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		//contactUsLink.click();
		
		//JavascriptExecutor jsp=((JavascriptExecutor)driver);
		//jsp.executeScript("window.scrollIntoView(true);",contactUsLink);
		//contactUsLink.click();
	}

}
