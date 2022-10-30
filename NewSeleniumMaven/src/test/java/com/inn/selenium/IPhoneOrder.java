package com.inn.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IPhoneOrder {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[@title='My Account']")).click();

		driver.findElement(By.linkText("Login")).click();

		driver.findElement(By.id("input-email")).sendKeys("arun.selenium3@gmail.com");

		driver.findElement(By.id("input-password")).sendKeys("Second@123");

		driver.findElement(By.xpath("//input[@value='Login']")).click();

		System.out.println(driver.findElement(By.xpath("//*[@class='breadcrumb']//a[text()='Account']")).isDisplayed()); // True

		driver.findElement(By.name("search")).sendKeys("iPhone");

		driver.findElement(By.xpath("//*[@class='fa fa-search']/parent::button")).click();

		System.out.println(driver.findElement(By.xpath("//*[@class='caption']//a[text()='iPhone']")).isDisplayed()); // True

		driver.findElement(By.xpath("//*[@class='caption']//a[text()='iPhone']")).click();

		System.out.println(driver.findElement(By.xpath("//*[@class='breadcrumb']//a[text()='iPhone']")).isDisplayed());

		WebElement quanityField = driver.findElement(By.name("quantity"));

		quanityField.clear();

		quanityField.sendKeys("2");

		driver.findElement(By.id("button-cart")).click();

		WebElement successStatus = driver.findElement(By.xpath("//*[@class='alert alert-success alert-dismissible']"));

		String successStatusText = successStatus.getText();

		System.out.println(successStatusText.contains("Success: You have added")); // True

		System.out.println(successStatusText.contains("to your")); // True

		System.out.println(
				driver.findElement(By.xpath("//*[@class='alert alert-success alert-dismissible']//a[text()='iPhone']"))
						.isDisplayed());

		successStatus.findElement(By.xpath("//a[text()='shopping cart']")).click();
		
		driver.findElement(By.linkText("Checkout")).click();
		
		driver.findElement(By.id("input-payment-firstname")).sendKeys("Arun");
		driver.findElement(By.id("input-payment-lastname")).sendKeys("Motoori");
		driver.findElement(By.id("input-payment-address-1")).sendKeys("Flat No 1,Street No 2");
		driver.findElement(By.id("input-payment-city")).sendKeys("New York");
		driver.findElement(By.id("input-payment-postcode")).sendKeys("10001");
		
		WebElement country = driver.findElement(By.id("input-payment-country"));
		
		Select select = new Select(country);
		
	    select.selectByVisibleText("United States");
	    
	    WebElement state = driver.findElement(By.id("input-payment-zone"));
	    
		Select select2 = new Select(state);
		
		select2.selectByVisibleText("New York");
		
		driver.findElement(By.id("button-payment-address")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("button-shipping-address")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("button-shipping-method")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("agree")).click();
		
		Thread.sleep(2000);

		
		driver.findElement(By.id("button-payment-method")).click();
		
		Thread.sleep(2000);

		driver.findElement(By.id("button-confirm")).click();
		
		Thread.sleep(2000);

		System.out.println(driver.findElement(By.xpath("//*[@class='breadcrumb']//a[text()='Success']")).isDisplayed());
		
		System.out.println(driver.findElement(By.xpath("//*[@id='content']/h1[text()='Your order has been placed!']")).isDisplayed());

	
	}

}
