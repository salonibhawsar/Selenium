package com.inn.selenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumAutoIt {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

		Actions action = new Actions(driver);

		action.moveToElement(driver.findElement(By.id("uploadfile"))).click().build().perform();

		Runtime.getRuntime().exec("D:\\SeleniumTrainingWorkspace\\AutoItDemoProj\\autoiffile\\FileUpload.exe");
		Thread.sleep(3000);
	}

}
