package com.in.practice;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjcts.AccountPage;
import pageobjcts.LandingPage;
import pageobjcts.LoginPage;
import resources.BaseClass;

public class LoginTest extends BaseClass {

	WebDriver driver;

	@Test(dataProvider = "getLoginData")
	public void login(String email, String password, String expectedResult) throws Exception

	{
		driver = initializeBrowser();
		driver.get(prop.getProperty("url"));

		LandingPage lp = new LandingPage(driver);

		lp.myAccountDropdown();
		lp.loginOption();

		Thread.sleep(3000);

		LoginPage loginPage = new LoginPage(driver);
		loginPage.emailAddressTextField().sendKeys("email");
		loginPage.passwordField().sendKeys("password");
		loginPage.loginButton().click();

		AccountPage accountPage = new AccountPage(driver);

		// Assert.assertTrue(accountPage.editYourAccountInformation().isDisplayed());

		String acutualResult = null;

		try {

			if (accountPage.editYourAccountInformation().isDisplayed()) {
				acutualResult = "Success";
			}

		} catch (Exception e) {

			acutualResult = "Failure";

		}

		Assert.assertEquals(acutualResult, expectedResult);
	}

	@AfterMethod
	public void closure() {

		driver.close();

	}

	@DataProvider
	public Object[][] getLoginData() {

		Object[][] data = { { "arun.selenium@gmail.com", "Second@123", "Success" },
				{ "dummy@test.com", "1234", "Failure" } };

		return data;

	}

	// Print I to 100 without using number
	public static void main(String args[]) {

		/*
		 * String s = ".........."; int one = 'A'/'A' ; // 10/10 = 1 int hundred =
		 * s.length()*s.length(); //
		 * 
		 * 
		 * for(int i=one;i<=hundred;i++) { System.out.println(i); }
		 */
		printNum(1);
	}

	public static void printNum(int n) {
		if (n <= 100) {
			System.out.println(n);
			n++;
			printNum(n);
		}
	}

}
