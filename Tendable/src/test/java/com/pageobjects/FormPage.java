package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FormPage {
	
	WebDriver driver;
	
	public FormPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="form-input-fullName")
	WebElement fullName;
	
	@FindBy(xpath="//input[@placeholder='organisationName']")
	WebElement organisationName;
	
	@FindBy(id="form-input-cellPhone")
	WebElement phoneNumber;
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(id="form-input-consentAgreed-0")
	WebElement agreeButton;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submitButton;
	
	@FindBy(name="jobRole")
	WebElement jobROleDropDown;
	
	@FindBy(xpath="//div[@class='ff-form-errors']")
	WebElement errorMessage;	

	public void setFullName()
	{
		fullName.sendKeys("Mohanbabu");
	}
	
	public void setOrganisationName()
	{
		organisationName.sendKeys("SA Technologies");
	}
	
	public void setPhoneNumber()
	{
		phoneNumber.sendKeys("9676169016");
	}
	
	public void setEmail()
	{
		email.sendKeys("mohanbabub666@gmail.com");
	}
	
	public void selectJobRole()
	{
		Select select=new Select(jobROleDropDown);
		select.selectByIndex(2);
	}
	
	public void clickOnAgreeButton()
	{
		agreeButton.click();
	}
	
	public void clickOnSubmitButton()
	{
		submitButton.click();
	}
	
	public boolean getErrorMessage()
	{
		return errorMessage.isDisplayed();
	}
}
