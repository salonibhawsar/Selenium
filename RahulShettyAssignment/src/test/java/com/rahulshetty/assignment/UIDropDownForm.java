package com.rahulshetty.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UIDropDownForm {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/angularpractice/");

		driver.manage().window().maximize();

		driver.findElement(By.cssSelector("div[class='form-group'] input[name='name']")).sendKeys("saloni");

		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("xyz@gmail.com");

		driver.findElement(By.cssSelector("#exampleInputPassword1")).sendKeys("12345");

		driver.findElement(By.cssSelector("#exampleCheck1")).click();

		driver.findElement(By.cssSelector("#exampleFormControlSelect1")).click();

		driver.findElement(By.cssSelector("#inlineRadio2")).click();

		driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("04/06/1998");

		driver.findElement(By.cssSelector("input[value='Submit']")).submit();
		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());

		driver.quit();
	}

}
