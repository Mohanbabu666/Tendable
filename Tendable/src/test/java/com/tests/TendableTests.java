package com.tests;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pageobjects.ContactUsPage;
import com.pageobjects.FormPage;
import com.pageobjects.HomePage;
import com.pageobjects.MarketingPage;

public class TendableTests {

	public static WebDriver driver;
	String chromepath = "C://Users//User//eclipse-workspace//Tendable//drivers//chromedriver.exe";
	String edgepath = "C://Users//User//eclipse-workspace//Tendable//drivers//msedgedriver.exe";
	String url = "https://www.tendable.com";

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", chromepath);
		driver = new ChromeDriver();

		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}


	@AfterMethod 
	public void tearDown() 
	{ 
		driver.quit(); 
	}


	@Test(priority = 1)
	public void accessTopLevelMenus() {
		HomePage hp = new HomePage(driver);

		hp.clickHomeLink();
		hp.clickOurStoryLink();
		hp.clickOurSolutionLink();
		hp.clickWhyTendableLink();
	}

	@Test(priority = 2)
	public void verifyRequestDemoButton() {
		HomePage hp = new HomePage(driver);

		hp.clickHomeLink();
		Assert.assertEquals(true, hp.requestADemoLinkIsDisplayed());

		hp.clickOurStoryLink();
		Assert.assertEquals(true, hp.requestADemoLinkIsDisplayed());

		hp.clickOurSolutionLink();
		Assert.assertEquals(true, hp.requestADemoLinkIsDisplayed());

		hp.clickWhyTendableLink();
		Assert.assertEquals(true, hp.requestADemoLinkIsDisplayed());
	}

	@Test(priority = 3)
	public void verifyErrorMessage() {
		ContactUsPage cup = new ContactUsPage(driver);
		MarketingPage mp = new MarketingPage(driver);
		FormPage fp = new FormPage(driver);

		cup.clickOnContactUsLink();
		mp.clickOnMarketingContact();
		fp.setFullName();
		fp.setOrganisationName();
		fp.setPhoneNumber();
		fp.setEmail();
		fp.selectJobRole();
		fp.clickOnAgreeButton();
		fp.clickOnSubmitButton();

		if (fp.getErrorMessage() == true) {
			System.out.println("Test is Passed");
		} else {
			System.out.println("Test is Failed");
		}
	}
}
