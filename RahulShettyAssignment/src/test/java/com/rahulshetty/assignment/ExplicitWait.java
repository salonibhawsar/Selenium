package com.rahulshetty.assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("//label[2]//span[2]")).click();

		//WebDriverWait wait = new WebDriverWait(driver, 10);

		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		
		Thread.sleep(10000);
		driver.findElement(By.id("okayBtn")).click();

		Select dropDown = new Select(driver.findElement(By.cssSelector("select[class='form-control']")));

		dropDown.selectByValue("consult");

		Thread.sleep(3000);
		driver.findElement(By.id("signInBtn")).click();

		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));

		Thread.sleep(30000);
		List <WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));

		for(int i =0;i<products.size();i++)

		{

		products.get(i).click();

		}

		driver.findElement(By.partialLinkText("Checkout")).click();}




	//driver.quit();
	

}
