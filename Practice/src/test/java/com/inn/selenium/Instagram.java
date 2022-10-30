package com.inn.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Instagram {

	WebDriver driver = null;

	@Parameters({ "URL" })
	@Test
	public void logIn(String url) throws Exception {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get(url);

		driver.manage().window().maximize();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("tuktuk_._._");

		// Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("$mahakal");

		driver.findElement(By.xpath("//div/button[@type=\"submit\"]")).isEnabled(); // true

		driver.findElement(By.xpath("//div/button[@type=\"submit\"]")).submit();

		// check if its logged in succesfully or not

		System.out.println(driver.findElement(By.tagName("button")).isEnabled()); // true logged in succesfull

		driver.findElement(By.cssSelector("button[class='_acan _acao _acas']")).click();

		Thread.sleep(10000);
		// driver.quit();

	}

	@AfterMethod
	public void closeWindow() {
		driver.close();
	}
}
